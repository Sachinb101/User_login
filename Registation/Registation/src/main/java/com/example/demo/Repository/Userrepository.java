package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.User;
 

 
@Repository
public interface Userrepository extends CrudRepository<User,Long> {
}
