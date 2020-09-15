package com.suresh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Contact_Dtls")
public class ContactDetailsEntity {
	
	@Id
	@Column(name="contact_Id")
	@GeneratedValue
	private Integer c_Id;
	@Column(name="contact_Name")
	private String c_Name;
	@Column(name="contact_Email")
	private String c_Email;
	@Column(name="contact_Number")
	private Long c_Num;
	

}
