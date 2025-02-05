package com.example.app_with_argocd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/")
    public String testAPI() {
        return "eks-app-0.0.1";
    }
}
