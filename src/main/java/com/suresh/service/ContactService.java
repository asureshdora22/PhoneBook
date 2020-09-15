package com.suresh.service;

import java.util.List;

import com.suresh.pojo.Contact;

public interface ContactService {
	public Boolean saveContact(Contact contact);
	public List<Contact> getAllContact();
	public Contact getContactById(Integer id);
	public Boolean updateContact(Contact contact);
	public Boolean deleteContact(Integer id);

}
