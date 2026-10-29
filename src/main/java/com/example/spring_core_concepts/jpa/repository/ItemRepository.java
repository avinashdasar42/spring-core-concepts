package com.example.spring_core_concepts.jpa.repository;

import com.example.spring_core_concepts.jpa.model.Item;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class ItemRepository {

    @PersistenceContext
    private EntityManager em;
    public Item find(Long id) {
        return em.find(Item.class, id);
    }
    public void save(Item item) {
        em.persist(item);
    }
    public Item update(Item item, Long id) {
        Item savedItem = em.find(Item.class,id);
        savedItem.setName(item.getName());
        savedItem.setDescription(item.getDescription());
        Item savedItem2 = em.find(Item.class,id);// here it is calling from persistence context, hence below  condition is true
        System.out.println("savedItem == savedItem2"+ (savedItem == savedItem2));
        System.out.println("savedItem2: "+ savedItem2.getName());
        System.out.println("savedItem2: "+ savedItem2.getDescription());
        System.out.println("savedItem: "+ savedItem.getName());
        System.out.println("savedItem: "+ savedItem.getDescription());
        return savedItem;
    }
}
