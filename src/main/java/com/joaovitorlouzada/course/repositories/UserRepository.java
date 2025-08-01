package com.joaovitorlouzada.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitorlouzada.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
