package ma.snrt.nayd.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NaydRESTClient {
	@RequestMapping(value = "/login")
	public String home(){
		return "test du login";
	}
}
