package com.subhrajit.onlinebanking.repository;

import com.subhrajit.onlinebanking.entity.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 
 * Project : online-banking
 * User: subhrajit
 * Email: jenasubhrajit99@gmail.com
 * To change this template use File | Settings | File Templates.
 */
public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}