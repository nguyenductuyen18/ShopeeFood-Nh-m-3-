package com.example.shopeefood.service.orderItem;

import com.example.shopeefood.model.DetailCart;
import com.example.shopeefood.model.OrderItem;
import com.example.shopeefood.model.Shop;
import com.example.shopeefood.model.User;
import com.example.shopeefood.repository.IDetailCartRepository;
import com.example.shopeefood.repository.IOrderItemRepository;
import com.example.shopeefood.service.detailcart.IDetailCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServicer implements IOrderItemService {
    @Autowired
    private IOrderItemRepository iOrderItemRepository;
    @Override
    public Iterable<OrderItem> findAll() {
        return iOrderItemRepository.findAll();
    }

    @Override
    public OrderItem save(OrderItem orderItem) {
        return iOrderItemRepository.save(orderItem);
    }

    @Override
    public void remove(Long id) {
        iOrderItemRepository.deleteById(id);
    }

    @Override
    public Optional<OrderItem> findById(Long id) {
        return iOrderItemRepository.findById(id);
    }

    @Override
    public Iterable<OrderItem> findAllByShopAndCart(Shop shop, User user) {
        return iOrderItemRepository.findAllByShopAndCart(shop,user);
    }

}