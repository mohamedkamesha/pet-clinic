package com.kamesha.petclinic.services;

import com.kamesha.petclinic.model.Vet;
import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);  //insert or update
    Set<Vet> findAll();
}
