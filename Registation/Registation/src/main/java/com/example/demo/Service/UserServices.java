package com.example.demo.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.Userrepository;

 
@Service
public class UserServices {
@Autowired
    private Userrepository repo;
public Iterable<User> listAll() {
        return this.repo.findAll();
    }
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(User students)  
{  
repo.save(students);  
}
public User getStudentById(long id)  
{  
return repo.findById(id).get();  
}
public void update(User students, int id)  
{  
repo.save(students);  
}  
 
public void delete(long id)  
{  
repo.deleteById(id);  
}  
  
}
