package com.subhrajit.onlinebanking.service;

import com.subhrajit.onlinebanking.entity.PrimaryAccount;
import com.subhrajit.onlinebanking.entity.SavingsAccount;

import java.security.Principal;

/**
 
 * Project : online-banking
 * User: subhrajit
 * Email: jenasubhrajit99@gmail.com
 * To change this template use File | Settings | File Templates.
 */
public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);

}