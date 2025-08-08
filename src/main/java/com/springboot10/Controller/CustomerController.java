package com.springboot10.Controller;



import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import springbootassi10.model.Customer;

@RestController
@RequestMapping("/cust")
public class CustomerController {

    // Test endpoint to verify it's running
    @GetMapping("/save")
    public String testEndpoint() {
        return "Please use POST /cust/save to submit a customer";
    }

    @PostMapping("/save")
    public String saveCustomer(@RequestBody @Valid Customer customer, BindingResult result) {
        if (result.hasErrors()) {
            return "Validation failed: " + result.getAllErrors();
        }
        return "Customer saved successfully!";
    }
}
