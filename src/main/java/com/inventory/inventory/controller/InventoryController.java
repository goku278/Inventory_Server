package com.inventory.inventory.controller;

import com.inventory.inventory.model.ApiResponse;
import com.inventory.inventory.model.Items;
import com.inventory.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api")
public class InventoryController {

    // This is a sample rest api implemented in java spring boot...
    // To demonstrate the uses of get api in flutter app via Dio library...
    @Autowired
    InventoryService inventoryService;
    @GetMapping("/inventory/fetchAllItems/")
    public ApiResponse fetchAllItems() {
        System.out.println("Fetch All Animes");
        return inventoryService.fetchAllItems();
    }

 /*   @PostMapping("saveAllItems/")
    public List<Items> saveAllItems() {
        return inventoryService.saveAllItems();
    }*/
}
