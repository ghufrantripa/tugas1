/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.latihan.repositories;

import com.latihan.latihan.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ghufran Tripa
 */
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>{
    
}
