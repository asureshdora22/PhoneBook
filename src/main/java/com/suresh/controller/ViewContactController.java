package com.suresh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.suresh.pojo.Contact;
import com.suresh.service.ContactService;

@Controller
public class ViewContactController {
	
	@Autowired
	private ContactService contactService;
	@GetMapping("/addContactHyperlink")
	public String addContactHyperlink(Model model) {
		model.addAttribute("contact", new Contact());
		return "index";
		
	}
	
	@GetMapping("/editContact")
	public String editContact(@RequestParam("cid")Integer id,Model model) {
		Contact contactById = contactService.getContactById(id);
		model.addAttribute("contact", contactById);
		return "index";
		
	}
	@GetMapping("/deleteContact")
	public String deleteContact(@RequestParam("cid")Integer id,RedirectAttributes re) {
		contactService.deleteContact(id);
		re.addFlashAttribute("deletecont", "Deleted success fully");
		
		return "redirect:ContactList";
		
	}

}
