package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.UserServices;
 

 
@RestController
public class UserContoller
{
@Autowired
private UserServices services;
@GetMapping("/getall")
public Iterable<User>getStudents()
{
return services.listAll();    
}
 
@PostMapping(value = "/save")
private long saveBook(@RequestBody User students)  
{  
services.saveOrUpdate(students);  
return  students.getId();  
}
  
@RequestMapping("/student/{id}")  
private User getBooks(@PathVariable(name = "id") int studentid)  
{  
return services.getStudentById(studentid);  
}  
    
@PutMapping("/edit/{id}")
 
    private User update(@RequestBody User students)  
    {  
   services.saveOrUpdate(students);  
       return students;  
    }  
 
@DeleteMapping("/delete/{id}")  
private void deleteStudent(@PathVariable("id") int id)  
{  
services.delete(id);  
}  
  
}
