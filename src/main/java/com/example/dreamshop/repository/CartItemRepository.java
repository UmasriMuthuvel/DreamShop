package com.example.dreamshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dreamshop.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByCartId(Long id);

}
