package com.example.defrawyV100.db;

import com.example.defrawyV100.models.CustomerCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCartRepo extends JpaRepository<CustomerCart,Long> {


}
