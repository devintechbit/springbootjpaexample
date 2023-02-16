package com.jpa.dao;

import com.jpa.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository <User, Integer> {

    //Crud repo is implementation to handle all crud operation...



    // CREATING CUSTOM METHODS..
    public List<User> findByName (String name);
    //find is called introducer
    // and By is our criteria.
    // Name is our properties.



}
