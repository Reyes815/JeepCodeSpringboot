package com.jeepcode.JeepCode.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeepcode.JeepCode.models.Destination;
import com.jeepcode.JeepCode.services.DestinationService;

@RestController
@RequestMapping("/api/destinations")
public class DestinationsController {

    @Autowired
    private DestinationService destinationService;


    @GetMapping("/destinationList")
    public List<Destination> destinationList() {
        return destinationService.destinationList();
    }
}
