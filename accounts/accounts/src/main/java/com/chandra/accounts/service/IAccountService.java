package com.chandra.accounts.service;

import com.chandra.accounts.dto.CustomerDto;

public interface IAccountService {


    /**
     * Creates a new account for the given customer.
     *
     * @param customer The customer for whom the account should be created.
     */
    public void createAccounts(CustomerDto customer);

    public CustomerDto fetchAccountDetails(String mobileNumber);

    boolean updateAccountDetails(CustomerDto customerDto);

    boolean deleteAccountDetails(String mobileNumber);

}
