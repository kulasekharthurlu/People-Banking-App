package com.people.account.customer;

import com.people.account.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/customer/v1")
public class Controller {

    @Autowired
    private Interface service;

    @RequestMapping("/save")
    public Response<?> saveCountry(@RequestBody Account account) {
        Account res = service.saveCustomer(account);
        return new Response<>(res,"saved", HttpStatus.ACCEPTED,1);

    }







}
