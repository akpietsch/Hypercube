
package info.unikoeln.de.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "home";
	}
	
	@GetMapping("/edit")
	public String editPicture() {
		return "picLaboratory";
		
	}
	
}