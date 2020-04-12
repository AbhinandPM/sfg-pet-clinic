package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

	@RequestMapping("/vets")
	public String getIndex(Model model) {
		return "vet/index";
	}
}
