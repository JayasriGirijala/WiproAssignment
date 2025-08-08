package com.task15p.controller;

import com.task15p.entity.Client;
import com.task15p.repository.ClientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clients")
public class ClientController {

    private final ClientRepository repository;

    public ClientController(ClientRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String listClients(Model model) {
        List<Client> clients = repository.findAll();
        model.addAttribute("clients", clients);
        return "list";
    }

    @GetMapping("/add")
    public String showAddForm(Client client) {
        return "add-client";
    }

    @PostMapping("/add")
    public String addClient(Client client) {
        repository.save(client);
        return "redirect:/clients";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        Client client = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid client Id:" + id));
        model.addAttribute("client", client);
        return "edit-client";
    }

    @PostMapping("/edit/{id}")
    public String updateClient(@PathVariable("id") Long id, Client client) {
        client.setId(id);
        repository.save(client);
        return "redirect:/clients";
    }

    @GetMapping("/delete/{id}")
    public String deleteClient(@PathVariable("id") Long id) {
        repository.deleteById(id);
        return "redirect:/clients";
    }
}

