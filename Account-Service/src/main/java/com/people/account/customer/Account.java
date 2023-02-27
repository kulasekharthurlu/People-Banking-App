package com.people.account.customer;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.people.account.enums.AccountType;
import com.people.account.enums.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_accounts_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderClassName = "AccountBuilder")
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Account {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long customerId;

    @Column(name = "customer_account_number")
    private String customerAccountNumber;

    @Column(name = "customer_first_name")
    private String customerFirstName;

    @Column(name = "customer_last_name")
    private String customerLastName;

    @Column(name = "customer_email")
    private String customerEmail;

    @Column(name = "customer_password")
    private String customerPassword;

    @Column(name = "customer_date_of_birth")
    private LocalDate customerDateOfBirth;

    @Column(name = "customer_account_balance")
    private Double customerAccountBalance;

    @Column(name = "customer_gender")
    private Gender customerGender;

    @Column(name = "customer_account_type")
    private AccountType customerAccountType;

    @Column(name = "customer_account_open_date")
    private LocalDate customerAccountOpenDate;

}
