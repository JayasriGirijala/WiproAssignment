package com.groceryapp;

import com.groceryapp.entity.GroceryItem;
import com.groceryapp.repository.GroceryItemRepository;
import com.groceryapp.service.GroceryItemService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Optional;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GroceryItemServiceTest {

    private final GroceryItemRepository repo = mock(GroceryItemRepository.class);
    private final GroceryItemService service = new GroceryItemService(repo);

    @Test
    public void testSaveItem() {
        GroceryItem item = new GroceryItem();
        item.setName("Rice");
        item.setQuantity(2);
        item.setPrice(120);

        when(repo.save(item)).thenReturn(item);
        GroceryItem saved = service.save(item);

        assertEquals("Rice", saved.getName());
    }

    @Test
    public void testFindById() {
        GroceryItem item = new GroceryItem();
        item.setId(1L);
        item.setName("Milk");

        when(repo.findById(1L)).thenReturn(Optional.of(item));

        GroceryItem found = service.findById(1L);
        assertEquals("Milk", found.getName());
    }
}
