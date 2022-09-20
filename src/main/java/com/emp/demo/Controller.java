package com.emp.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class Controller {

    @Autowired
    BalanceRepository repo;

    @GetMapping(value = "/test")
    public List<Balance> send(){
        List<Balance> lis = repo.findBycustomerID(1);
        return lis;
    }
}