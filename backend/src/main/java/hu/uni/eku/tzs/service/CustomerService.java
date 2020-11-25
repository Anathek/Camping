package hu.uni.eku.tzs.service;

import hu.uni.eku.tzs.model.Customer;
import hu.uni.eku.tzs.service.exceptions.CustomerAlreadyExistsException;

import java.util.Collection;

public interface CustomerService {

    void record(Customer customer) throws  CustomerAlreadyExistsException;

    Customer readByEmail(String email);

    Collection<Customer> readAll();
}
