package com.groceryapp;

import com.groceryapp.entity.GroceryItem;
import com.groceryapp.repository.GroceryItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GroceryItemIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private GroceryItemRepository repository;

    @Test
    public void testCreateGroceryItem() {
        GroceryItem item = new GroceryItem();
        item.setName("Oil");
        item.setQuantity(1);
        item.setPrice(150.0);

        ResponseEntity<GroceryItem> response = restTemplate.postForEntity("/api/groceries", item, GroceryItem.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody().getId());
    }
}
