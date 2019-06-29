package com.wordcount;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/SayHello")
	public String Hello()
	{
		return "<H1>Hi Mahesh, Executing from AWS... Hello All Happy Happy Learning..Loved it </H1><BR><H2>This is for the branch -Fifth</H2>";
	}

}
 	