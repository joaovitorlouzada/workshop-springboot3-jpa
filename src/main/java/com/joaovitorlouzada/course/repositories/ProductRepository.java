package com.joaovitorlouzada.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitorlouzada.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
