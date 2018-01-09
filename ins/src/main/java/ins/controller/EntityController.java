package ins.controller;


import java.util.ArrayList;


import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import ins.model.User;

@Controller
public class EntityController {
	
	org.slf4j.Logger log=LoggerFactory.getLogger(EntityController.class);
	
	@RequestMapping("/handleGet")
	public HttpEntity<User> httpEntityTest()
	{
		
		RestTemplate template=new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<User> entity = new HttpEntity<User>(new User(), headers);
		HttpEntity<User> res= template.exchange("http://localhost:8080/ins/user/2", HttpMethod.GET, entity, User.class);
		System.out.println("ok got");
		return res;
	
	}
	
	@RequestMapping("/handleGet1")
	public HttpEntity<ArrayList> httpEntityTest1()
	{
		RestTemplate template=new RestTemplate();
		HttpEntity<ArrayList> entity = template.getForEntity("http://localhost:8080/ins/users", ArrayList.class);
		ArrayList<User> body = entity.getBody();
		System.out.println(body);
		 MediaType contentType = entity.getHeaders().getContentType();
		return entity;
	}
	
	 @RequestMapping("/handlePost")
	 public HttpEntity<String> handle() {
	   HttpHeaders responseHeaders = new HttpHeaders();
	   responseHeaders.set("MyResponseHeader", "MyValue");
	   responseHeaders.set("name", "raviteja");
	   return new HttpEntity<String>("Hello World", responseHeaders);
	 }

}
