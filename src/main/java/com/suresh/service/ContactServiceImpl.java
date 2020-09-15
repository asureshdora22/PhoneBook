package com.suresh.service;

import java.util.List;
import java.util.Optional;

import org.dom4j.bean.BeanAttribute;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.BeanEntry;
import org.springframework.stereotype.Service;

import com.suresh.model.ContactDetailsEntity;
import com.suresh.pojo.Contact;
import com.suresh.repository.ContactRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactRepository contactRepository;
	@Override
	public Boolean saveContact(Contact contact) {
		ContactDetailsEntity entity=new ContactDetailsEntity();
		BeanUtils.copyProperties(contact, entity);
		ContactDetailsEntity detailsEntity  = contactRepository.save(entity);
		return detailsEntity.getC_Id()!=null;
	}

	@Override
	public List<Contact> getAllContact() {
		Object findAll = contactRepository.findAll();
		List<Contact> list=(List<Contact>) findAll;
		return list;
		
	}

	@Override
	public Contact getContactById(Integer id) {
		Optional<ContactDetailsEntity> optional = contactRepository.findById(id);
		if(optional.isPresent()) {
			ContactDetailsEntity entity = optional.get();
			Contact contact=new Contact();
			BeanUtils.copyProperties(entity,contact);
			return contact;
		}
		return null;
		
		
	}

	@Override
	public Boolean updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteContact(Integer id) {
		contactRepository.deleteById(id);
		return true;
	}

}
