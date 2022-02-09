package com.kamesha.petclinic.services;

import com.kamesha.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);

}
