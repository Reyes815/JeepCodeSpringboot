package com.jeepcode.JeepCode.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jeepcode.JeepCode.models.Destination;

public interface DestinationRep extends JpaRepository<Destination, String> {
    
}
