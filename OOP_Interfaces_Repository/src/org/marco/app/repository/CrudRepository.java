package org.marco.app.repository;

import org.marco.app.model.Customer;

import java.util.List;

public interface CrudRepository {
    List<Customer> listCustomers();

    Customer customerById(Integer id);

    void saveCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(Integer id);
}
