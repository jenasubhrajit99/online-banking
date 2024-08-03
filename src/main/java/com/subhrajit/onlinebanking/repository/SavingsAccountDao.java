package com.subhrajit.onlinebanking.repository;

import com.subhrajit.onlinebanking.entity.SavingsAccount;
import org.springframework.data.repository.CrudRepository;

/**
 
 * Project : online-banking
 * User: subhrajit
 * Email: jenasubhrajit99@gmail.com
 * To change this template use File | Settings | File Templates.
 */
public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber(int accountNumber);
}