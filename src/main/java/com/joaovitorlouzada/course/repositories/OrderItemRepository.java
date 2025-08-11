package com.joaovitorlouzada.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovitorlouzada.course.entities.OrderItem;
import com.joaovitorlouzada.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
