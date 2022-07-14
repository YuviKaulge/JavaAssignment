package springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController 
{
	@RequestMapping("")
	public String home() {
		System.out.println("this is home url");
		return "index"; 
	}

}
