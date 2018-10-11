package com.example.dao;

import com.example.entity.Contact;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ContactDaoImpl implements ContactDao{

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Contact contact) {
        entityManager.persist(contact);
        entityManager.flush();
    }

    public void update(Contact contact) {
        entityManager.merge(contact);
    }

    public void delete(Contact contact) {
        entityManager.merge(contact);
        entityManager.remove(contact);
    }

    public Contact selectById(Long id) {
        return entityManager.find(Contact.class,id);
    }
@SuppressWarnings("unchecked")
    public List<Contact> readAll() {
        Query query = entityManager.createQuery("FROM Contact");
        return (List<Contact>) query.getResultList();
    }
}
