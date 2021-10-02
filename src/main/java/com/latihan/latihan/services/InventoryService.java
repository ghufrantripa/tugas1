/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.latihan.services;

import com.latihan.latihan.interfaces.InventoryInterface;
import com.latihan.latihan.models.Inventory;
import com.latihan.latihan.repositories.InventoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ghufran Tripa
 */
@Service
public class InventoryService implements InventoryInterface {

    @Autowired
    private InventoryRepository inventoryRepository;
    
    public List<Inventory> getAll() {
        return inventoryRepository.findAll();
    }

    public void store(Inventory inventory) {
        this.inventoryRepository.save(inventory);
    }

    public Inventory getById(long id) {
      Optional < Inventory > optional = inventoryRepository.findById(id);

      if (!optional.isPresent()) {
        throw new RuntimeException(" Inventory not found for id :: " + id);
      }

      Inventory inventory = optional.get();
      return inventory;
    }

    public void delete(long id) {
      this.inventoryRepository.deleteById(id);
    }
}
