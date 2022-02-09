package com.kamesha.petclinic.services;

import com.kamesha.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);  //insert or update
    Set<Owner> findAll();
}
