package com.example.service;

import com.example.dao.ContactDao;
import com.example.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactDao contactDao;


    public void add(Contact contact) throws  Exception{
        contactDao.insert(contact);
    }

    public void remove(Integer id) {
//        contactDao.delete();
    }

    public void edit(Contact contact) {
        contactDao.update(contact);
    }

    public List<Contact> readAll() {
        return contactDao.readAll();
    }
}
