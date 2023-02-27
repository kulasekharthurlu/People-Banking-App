package com.people.account.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements Interface {

    @Autowired
    private Repository repository;
    @Override
    public Account saveCustomer(Account account) {
        return repository.save(account);
    }

    @Override
    public Account updateCustomer(Account account) {
        return null;
    }

    @Override
    public void deleteCustomerByCustomerId(Long customerId) {

    }

    @Override
    public Account getCustomerByCustomerId(Long customerId) {
        return null;
    }
}
