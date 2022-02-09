package com.kamesha.petclinic.services;

import java.util.Set;

public interface CrudService <T,ID>{

 T findById(ID id);
 T save(T t);  //insert or update
 Set<T> findAll();
 void delete(T t);
 void deleteById(ID id);
}
