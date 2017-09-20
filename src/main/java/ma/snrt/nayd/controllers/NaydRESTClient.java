package ma.snrt.nayd.controllers;


import ma.snrt.nayd.models.Role;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NaydRESTClient {
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public Role home(@RequestParam("username") String username, @RequestParam("password") String password){
		return new Role(10,username +" "+ password);
	}
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String home(){
		return "testing get";
	}
}
