package com.example.springbootdemo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface USerRepo extends CrudRepository<User, Integer> {

    static Iterable<User> saveAll(List<User> users) {
        return users;
    }
    public List<User> findByName(String name);
    public  List<User> findByNameAndCity(String name, String city);
}
