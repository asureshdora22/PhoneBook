package com.suresh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.suresh.pojo.Contact;
import com.suresh.service.ContactService;

@Controller
public class ContactInfoController {
	@Autowired
	private ContactService service;
	
	@GetMapping("/")
	public String loadContactForm(Model model) {
		Contact contact=new Contact();
		model.addAttribute("contact", contact);
		return "index";
		
	}
	
	@PostMapping(value = "/saveContact")
	public  String handalSubmitBtn(@ModelAttribute("contact") Contact contact,RedirectAttributes attributes) {
		
		Boolean saveContact = service.saveContact(contact);
		if(saveContact) {
			if (contact.getC_Id()!=null) {
				attributes.addFlashAttribute("success", "Successful Update Contact");

			}else {
			attributes.addFlashAttribute("success", "Successful Save Contact");
			}}
		else {
			attributes.addFlashAttribute("ussuccess", "UnSuccess Something is wrong");

		}
		return "redirect:/";
		
	}
	
	@GetMapping("/ContactList")
	public  String handalViewCntHyperLink(Model model) {
		 
		 model.addAttribute("allcontact", service.getAllContact());
		return "viewContact";
		
	}

}
