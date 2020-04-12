package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

	@RequestMapping("/owners")
	public String listOwners(Model model) {
		return "owner/index";
	}
}
