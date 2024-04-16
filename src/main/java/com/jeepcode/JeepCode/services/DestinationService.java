package com.jeepcode.JeepCode.services;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jeepcode.JeepCode.models.Destination;
import com.jeepcode.JeepCode.repositories.DestinationRep;

@Service
public class DestinationService {

    @Autowired
    private DestinationRep destinationRep;

    public List<Destination> destinationList(){
        return destinationRep.findAll();
    }
}
