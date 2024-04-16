package com.jeepcode.JeepCode.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeepcode.JeepCode.models.JeepCode;
import com.jeepcode.JeepCode.repositories.JeepcodeRep;

@Service
public class JeepCodeService {

    @Autowired
    private JeepcodeRep jeepcodeRep;

    public List<JeepCode> jeepCodeList() {
        return jeepcodeRep.findAll();
    }

    public JeepCode getJeepCodeById(String id) {
        return jeepcodeRep.findById(id).
            orElseThrow(() 
                -> new IllegalArgumentException("Jeep code not found: " + id));
    }
}
