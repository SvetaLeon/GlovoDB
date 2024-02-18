package com.company.glovodb.service.order;

import com.company.glovodb.dto.order.Order;

import java.util.List;

public interface OrderService {
    Order getOrderById(Integer id);

    List<Order> getOrders();

    void save(Order order);

    void update(Integer id, Order updatedOrderData);

    void delete(Integer id);
}
