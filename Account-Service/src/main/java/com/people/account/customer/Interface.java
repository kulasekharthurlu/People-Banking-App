package com.people.account.customer;

public interface Interface {
    Account saveCustomer(Account account);

    Account updateCustomer(Account account);

    void deleteCustomerByCustomerId(Long customerId);

    Account getCustomerByCustomerId(Long customerId);
}
