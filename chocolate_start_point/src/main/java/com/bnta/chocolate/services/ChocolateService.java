package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChocolateService {
    
    @Autowired
    ChocolateRepository chocolateRepository;
    
    @Autowired
    EstateService estateService;
    
//    public Chocolate addNewChocolate(Integer estateId) {
//        Estate estate = estateService.getEstateById(estateId).get();
//        Chocolate chocolate = new Chocolate("Galaxy", 44, estate);
//        
//    }

    public List<Chocolate> getAllChocolates() {
        return chocolateRepository.findAll();
    }
    
    
    
    
}
