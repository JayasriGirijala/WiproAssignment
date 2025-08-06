package com.groceryapp.service;

import com.groceryapp.entity.GroceryItem;
import java.util.List;

public interface GroceryItemService {
    List<GroceryItem> findAll();
    GroceryItem findById(Long id);
    GroceryItem save(GroceryItem item);
    GroceryItem update(Long id, GroceryItem item);
    void delete(Long id);
}
