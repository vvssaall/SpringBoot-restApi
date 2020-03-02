package com.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	//@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
		
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new  HelloWorldBean("Hello World");
		
	}
	@GetMapping(path="/hello-world/pathvariable/{name}")
	public String HelloWorldPath(@PathVariable String name) {
		return String.format("Hello world,%s",name);
		
	}
	@GetMapping(path="/hello-world/path/{path}")
	public HelloWorldBean VaraiblePath(@PathVariable String path) {
		return new HelloWorldBean(String.format("My name is %s", path));
	}

}
