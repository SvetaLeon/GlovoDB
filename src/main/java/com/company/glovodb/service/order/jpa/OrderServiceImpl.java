package com.company.glovodb.service.order.jpa;

import com.company.glovodb.dto.order.Order;
import com.company.glovodb.repository.OrdersJDBCRepository;
import com.company.glovodb.service.order.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrdersJDBCRepository orderJDBCRepository;

    @Override
    public Order getOrderById(Integer id) {
        return orderJDBCRepository.getById(id);
    }

    public List<Order> getOrders() {
        return orderJDBCRepository.getAllOrders();
    }

    @Override
    public void save(Order newOrder) {
        orderJDBCRepository.save(newOrder);
    }

    @Override
    public void update(Integer id, Order updatedOrderData) {
        Order updatedOrder = orderJDBCRepository.getById(id);
        updatedOrder.setDate(updatedOrderData.getDate());
        updatedOrder.setCost(updatedOrderData.getCost());
        orderJDBCRepository.update(id, updatedOrder);
    }

    @Override
    public void delete(Integer id) {
        orderJDBCRepository.deleteById(id);
    }
}
