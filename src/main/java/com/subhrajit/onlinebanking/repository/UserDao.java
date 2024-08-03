package com.subhrajit.onlinebanking.repository;

import com.subhrajit.onlinebanking.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 
 * Project : online-banking
 * User: subhrajit
 * Email: jenasubhrajit99@gmail.com
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);

    User findByEmail(String email);

    List<User> findAll();
}