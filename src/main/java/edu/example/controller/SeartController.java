package edu.example.controller;

import edu.example.service.SeartService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seat")
public class SeartController {
    private final SeartService seartService;

    public SeartController(SeartService seartService) {
        this.seartService = seartService;
    }
}
