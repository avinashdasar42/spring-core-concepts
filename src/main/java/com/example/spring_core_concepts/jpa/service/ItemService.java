package com.example.spring_core_concepts.jpa.service;

import com.example.spring_core_concepts.jpa.model.Item;
import com.example.spring_core_concepts.jpa.repository.ItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    // what is the use of readOnly in transactional and when to use it?
    @Transactional(readOnly = true)
    public Item getItem(Long id) {
        return itemRepository.find(id);
    }

    @Transactional
    public void createItem(Item item) {
        itemRepository.save(item);
    }

    @Transactional
    public Item updateItem(Item item, Long id) {
        return itemRepository.update(item, id);
    }
}
