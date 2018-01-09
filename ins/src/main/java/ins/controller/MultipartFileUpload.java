package ins.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MultipartFileUpload {
	
	@RequestMapping(method=RequestMethod.POST,value="/uploadFile")
	public String uploadFile(@RequestParam("name") String name,@RequestParam("file") MultipartFile file)
	{
		System.out.println("file controller called");
		if(!file.isEmpty())
		{
			try {
				byte[] bytes=file.getBytes();
				String rootpath=System.getProperty("catalina.home");
				System.out.println(rootpath);
				File dir=new File(rootpath+File.separator+"tempFiles");
				if(!dir.exists()){
					dir.mkdir();
				}
				File serverFile= new File(dir.getAbsolutePath()+File.separator+name);
				BufferedOutputStream stream=new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				
				
				return " File Uploaded Succesfully";
				
			} catch (IOException e) {e.printStackTrace();}
		}
		return "File Not Found";
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/uploadMultipleFile")
	public String uploadMultipleFiles(@RequestParam("name") String[] names,@RequestParam("file") MultipartFile[] files) throws IOException
	{
		if(files.length==names.length){
			for(int i=0;i<files.length;i++)
			{
				byte[] bytes=files[i].getBytes();
				String name=names[i];
				String rootpath=System.getProperty("catalina.home");
				File file=new File(rootpath+File.separator+"tempFolder");
				if(!file.exists())
				{
					file.mkdir();
				}
				File serverFile=new File(file.getAbsolutePath()+File.separator+name);
				BufferedOutputStream stream=new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.flush();
				stream.close();
			}
			
			return "files uploaded successfully";
		}
		else
			return "Enter the correct number of files";
		
	}

}
