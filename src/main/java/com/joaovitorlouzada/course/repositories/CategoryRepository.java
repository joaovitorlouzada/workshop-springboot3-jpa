package com.joaovitorlouzada.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitorlouzada.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
