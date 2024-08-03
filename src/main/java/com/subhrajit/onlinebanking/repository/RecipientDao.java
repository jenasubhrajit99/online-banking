package com.subhrajit.onlinebanking.repository;

import com.subhrajit.onlinebanking.entity.Recipient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 
 * Project : online-banking
 * User: subhrajit
 * Email: jenasubhrajit99@gmail.com
 * To change this template use File | Settings | File Templates.
 */
public interface RecipientDao extends CrudRepository<Recipient, Long> {

    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}