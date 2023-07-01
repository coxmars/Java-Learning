package org.marco.app.repository;

import org.marco.app.model.Customer;

import java.util.List;

public interface OrdenableRepository {
    List<Customer> listCustomers (String field, Direction direction);


}
