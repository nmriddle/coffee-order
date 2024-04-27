package edu.iu.habahram.coffeeorder.controllers;

import edu.iu.habahram.coffeeorder.model.OrderData;
import edu.iu.habahram.coffeeorder.model.Receipt;
import edu.iu.habahram.coffeeorder.repository.OrderFileRepository;
import edu.iu.habahram.coffeeorder.repository.OrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrderController {
    private OrderRepository orderRepository;
    private OrderFileRepository orderFileRepository;

    public OrderController(OrderFileRepository orderFileRepository, OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
        this.orderFileRepository = orderFileRepository;
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody OrderData order) {
        try {
            Receipt receipt = orderFileRepository.add(order);
            orderRepository.save(receipt);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(receipt);
        } catch (Exception e) {
            System.out.println("");
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}
