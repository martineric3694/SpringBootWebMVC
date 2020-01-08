package main.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("rest")
public class RestController {

	@RequestMapping("")
	public String getMessage() {
		return "Rest Message";
	}
	
	@RequestMapping("list")
	public List getRest() {
		List result = new ArrayList();
		for(int i = 0;i<10;i++) {
			result.add("data ke-"+i);
		}
		return result;
	}
}
