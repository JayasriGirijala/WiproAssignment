package com.springboot14.controller;

import com.springboot14.entity.FoodItem;
import com.springboot14.entity.RestaurantEntity;
import com.springboot14.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping
    public RestaurantEntity createRestaurant(@Valid @RequestBody RestaurantEntity restaurant) {
        return restaurantService.createRestaurant(restaurant);
    }

    @GetMapping
    public List<RestaurantEntity> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/{id}")
    public RestaurantEntity getRestaurantById(@PathVariable Long id) {
        return restaurantService.getRestaurantById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);
    }

    @PostMapping("/{id}/foods")
    public FoodItem addFoodToRestaurant(@PathVariable Long id, @Valid @RequestBody FoodItem food) {
        return restaurantService.addFoodToRestaurant(id, food);
    }

    @DeleteMapping("/foods/{foodId}")
    public void deleteFood(@PathVariable Long foodId) {
        restaurantService.deleteFood(foodId);
    }
}
