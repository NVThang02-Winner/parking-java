package com.example.cellphones.controller;

import com.example.cellphones.service.VNPayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class VNPayController {
    private final VNPayService vnPayService;

    @PostMapping("/submitOrder")
    public String submitOrder(@RequestParam("amount") int orderTotal,
                              @RequestParam("orderInfo") String orderInfo) {
        return vnPayService.createOrder(orderTotal, orderInfo);
    }

}
