package com.inventory.inventory.repo;

import com.inventory.inventory.dao.ItemsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepo extends JpaRepository<ItemsDao, Long> {
}