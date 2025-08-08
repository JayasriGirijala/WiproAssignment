package com.springboot14.service;

import com.springboot14.entity.FoodItem;
import com.springboot14.entity.RestaurantEntity;
import com.springboot14.exception.ResourceNotFoundException;
import com.springboot14.repository.FoodItemRepository;
import com.springboot14.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private FoodItemRepository foodItemRepository;

    public RestaurantEntity createRestaurant(RestaurantEntity restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public List<RestaurantEntity> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public RestaurantEntity getRestaurantById(Long id) {
        return restaurantRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with id: " + id));
    }

    public void deleteRestaurant(Long id) {
        RestaurantEntity restaurant = getRestaurantById(id);
        restaurantRepository.delete(restaurant);
    }

    public FoodItem addFoodToRestaurant(Long restaurantId, FoodItem food) {
        RestaurantEntity restaurant = getRestaurantById(restaurantId);
        food.setRestaurant(restaurant);
        return foodItemRepository.save(food);
    }

    public void deleteFood(Long foodId) {
        FoodItem food = foodItemRepository.findById(foodId)
                .orElseThrow(() -> new ResourceNotFoundException("Food not found with id: " + foodId));
        foodItemRepository.delete(food);
    }
}
