package com.example.dao;

import com.example.entity.Contact;

import java.util.List;


public interface ContactDao {

    public void insert(Contact contact);

    public void update(Contact contact);

    public void delete(Contact contact);

    public Contact selectById(Long id);

    public List<Contact> readAll();

}
