package com.suresh.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;


import com.suresh.model.ContactDetailsEntity;

public interface ContactRepository extends JpaRepository<ContactDetailsEntity, Serializable> {

}
