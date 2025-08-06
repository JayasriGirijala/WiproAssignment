package com.groceryapp.service;

import com.groceryapp.entity.GroceryItem;
import com.groceryapp.repository.GroceryItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class GroceryItemServiceImpl implements GroceryItemService {

    private final GroceryItemRepository repository;

    public GroceryItemServiceImpl(GroceryItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<GroceryItem> findAll() {
        return repository.findAll();
    }

    @Override
    public GroceryItem findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("GroceryItem not found with id: " + id));
    }

    @Override
    public GroceryItem save(GroceryItem item) {
        return repository.save(item);
    }

    @Override
    public GroceryItem update(Long id, GroceryItem item) {
        GroceryItem existing = findById(id);
        existing.setName(item.getName());
        existing.setQuantity(item.getQuantity());
        existing.setPrice(item.getPrice());
        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        GroceryItem existing = findById(id);
        repository.delete(existing);
    }
}
