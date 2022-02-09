package com.kamesha.petclinic.services;

import com.kamesha.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);  //insert or update
    Set<Pet> findAll();
}
