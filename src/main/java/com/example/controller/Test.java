package com.example.controller;

import com.example.entity.Contact;
import com.example.service.ContactService;
import com.example.util.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Mohsen on 18/10/12.
 */
public class Test {
    public static void main(String[] args)  {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
        ContactService contactService = ctx.getBean(ContactService.class);

        Contact contact = new Contact();
        contact.setName("Mohsen");
        contact.setFamily("Shafiei");
        contact.setMobile("09363561168");
        try {
            contactService.add(contact);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
