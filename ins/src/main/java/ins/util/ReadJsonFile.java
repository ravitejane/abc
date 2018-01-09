package ins.util;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadJsonFile {

	public static void main(String[] args) {
		
		readJson();

	}
	
	public static void readJson(){
		JSONParser parser=new JSONParser();
		try {
			JSONArray array=(JSONArray) parser.parse(new FileReader("D:\\person.json"));
			for(Object o:array){
				JSONObject person=(JSONObject) o;
				String name=(String)person.get("name");
				System.out.println(name);
				String city=(String)person.get("city");
				System.out.println(city);
				String job=(String)person.get("job");
				System.out.println(job);
				JSONArray cars=(JSONArray) person.get("cars");
				for(Object c:cars){
					System.out.println((String)c);
				}
			}
			
			
		} catch (IOException | ParseException e) {e.printStackTrace();	}
	}
}
