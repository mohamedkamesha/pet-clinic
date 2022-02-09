package com.kamesha.petclinic.map;

import com.kamesha.petclinic.model.Owner;
import com.kamesha.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractionMapService<Owner,Long>  implements CrudService<Owner,Long>{


    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(),owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }


}
