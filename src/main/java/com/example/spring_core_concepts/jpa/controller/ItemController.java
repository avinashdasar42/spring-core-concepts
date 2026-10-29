package com.example.spring_core_concepts.jpa.controller;

import com.example.spring_core_concepts.jpa.model.Item;
import com.example.spring_core_concepts.jpa.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItem(@PathVariable("id") Long id){
        return ResponseEntity.ok(itemService.getItem(id));
    }

    @PostMapping
    public ResponseEntity<String> createItem(@RequestBody Item item){
        itemService.createItem(item);
        return ResponseEntity.ok("CREATED");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Item> updateItem(@RequestBody Item item, @PathVariable("id") Long id){
        return ResponseEntity.ok().body(itemService.updateItem(item, id));
    }
}
