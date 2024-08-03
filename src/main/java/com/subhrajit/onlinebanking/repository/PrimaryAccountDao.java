package com.subhrajit.onlinebanking.repository;

import com.subhrajit.onlinebanking.entity.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

/**
 
 * Project : online-banking
 * User: subhrajit
 * Email: jenasubhrajit99@gmail.com
 * To change this template use File | Settings | File Templates.
 */
public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {

    PrimaryAccount findByAccountNumber(int accountNumber);
}