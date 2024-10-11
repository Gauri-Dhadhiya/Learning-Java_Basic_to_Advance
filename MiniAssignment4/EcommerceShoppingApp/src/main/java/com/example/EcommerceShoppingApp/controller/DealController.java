package com.example.EcommerceShoppingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.EcommerceShoppingApp.service.DealService;
import com.example.amazon.bean.DealItem;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
public class DealController {

    @Autowired
    private DealService dealService;

    @GetMapping("/deals/{categoryName}")
    public List<DealItem> getDeals(@PathVariable String categoryName) throws ExecutionException, InterruptedException {
         CompletableFuture<List<DealItem>> dealsData= dealService.getDeals(categoryName);
         return dealsData.get();
    }
}

