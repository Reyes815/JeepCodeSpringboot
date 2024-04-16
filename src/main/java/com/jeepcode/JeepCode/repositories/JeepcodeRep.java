package com.jeepcode.JeepCode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeepcode.JeepCode.models.JeepCode;

public interface JeepcodeRep extends JpaRepository<JeepCode, String> {
    
}
