package com.subhrajit.onlinebanking.repository;

import com.subhrajit.onlinebanking.security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 
 * Project : online-banking
 * User: subhrajit
 * Email: jenasubhrajit99@gmail.com
 * To change this template use File | Settings | File Templates.
 */
public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findByName(String name);
}