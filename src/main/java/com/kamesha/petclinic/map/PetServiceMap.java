package com.kamesha.petclinic.map;

import com.kamesha.petclinic.model.Owner;
import com.kamesha.petclinic.model.Pet;
import com.kamesha.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractionMapService<Pet,Long> implements CrudService<Pet,Long> {



    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(),pet);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }



}
