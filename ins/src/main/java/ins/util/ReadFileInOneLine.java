package ins.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileInOneLine {

	public static void main(String[] args) throws IOException 
	{
		//From java 8
		@SuppressWarnings("rawtypes")
		List lines = Files.readAllLines(Paths.get("D:\\tasks.txt"),
                StandardCharsets.UTF_8);
		System.out.println(lines);

	}

}
