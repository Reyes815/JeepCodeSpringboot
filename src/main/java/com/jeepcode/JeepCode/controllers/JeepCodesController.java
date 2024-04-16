package com.jeepcode.JeepCode.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeepcode.JeepCode.models.JeepCode;
import com.jeepcode.JeepCode.services.JeepCodeService;

@RestController
@RequestMapping("/api/jeepcodes")
public class JeepCodesController {

    @Autowired
    private JeepCodeService jeepCodeService;

    @GetMapping("/jeepCodeList")
    public List<JeepCode> jeepCodesList(){
        return jeepCodeService.jeepCodeList();
    }

    @GetMapping
    @RequestMapping("{id}")
    public JeepCode getJeepCodeById(@PathVariable String id) {
        return jeepCodeService.getJeepCodeById(id);
    }
}
