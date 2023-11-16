package com.prodemy.boot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodemy.boot.demo.model.ApiResponse;
import com.prodemy.boot.demo.model.BalanceData;
import com.prodemy.boot.demo.model.request.TopUpRequest;

import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/balance")
public class BalanceController {

    private int currentBalance = 1000000; 

    @GetMapping
    public ApiResponse getBalance() {
        ApiResponse response = new ApiResponse();
        response.setStatus(0);
        response.setMessage("Get Balance Berhasil");
        BalanceData balanceData = new BalanceData();
        balanceData.setBalance(currentBalance);
        response.setData(balanceData);
        return response;
    }

    @PostMapping("/top-up")
    public ApiResponse topUpBalance(@RequestBody TopUpRequest request) {
        ApiResponse response = new ApiResponse();
        response.setStatus(0);

        int topUpAmount = request.getTopUpAmount();
        currentBalance += topUpAmount;

        response.setMessage("Top Up Balance berhasil");
        BalanceData balanceData = new BalanceData();
        balanceData.setBalance(currentBalance);
        response.setData(balanceData);

        return response;
    }
}
