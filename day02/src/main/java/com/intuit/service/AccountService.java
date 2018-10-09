package com.intuit.service;

import com.intuit.domain.Account;
import com.intuit.dao.AccountsRepository;
import com.intuit.domain.Statements;
import com.intuit.dao.StatementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class AccountService {

    @Autowired
    public AccountsRepository accountsRepository;

    @Autowired
    public StatementsRepository statementsRepository;

    public void deposit(int accountNumber,int amount, String type) {

        if (accountsRepository.existsById(accountNumber)){
            Account account = accountsRepository.findById(accountNumber).get();
            account.setBalance(account.getBalance() + amount);
            accountsRepository.save(account);
            insertStatement(accountNumber, amount, type);
        }


        // update balance in accounts table
        // insert into statements table and type will be either “Withdraw” or “Deposit” or “Interest” or "Fees" depending on the operation.

    }
    @Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
    public void withdraw(int accountNumber,int amount, String type) {

        if (accountsRepository.existsById(accountNumber)){
            Account account = accountsRepository.findById(accountNumber).get();
            account.setBalance(account.getBalance() - amount);
            accountsRepository.save(account);
            insertStatement(accountNumber, amount, type);
        }
        // update balance in accounts table
        // insert into statements table and type will be either “Withdraw” or “Deposit” or “Interest” or "Fees" depending on the operation.
    }

    private void insertStatement(int accountNumber, int amount, String type){
        Statements statements = new Statements();
        statements.setAccountNumber(accountNumber);
        statements.setAmount(amount);
        statements.setType(type);
        statementsRepository.save(statements);

    }
}
