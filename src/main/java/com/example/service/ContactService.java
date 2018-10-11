package com.example.service;

import com.example.entity.Contact;

import java.util.List;

public interface ContactService {
	public void add(Contact contact) throws Exception;
	public void remove(Integer id);
	public void edit(Contact contact);
	public List<Contact> readAll();

}
