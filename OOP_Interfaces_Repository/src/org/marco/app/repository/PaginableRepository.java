package org.marco.app.repository;

import org.marco.app.model.Customer;

import java.util.List;

public interface PaginableRepository {
    List<Customer> listCustomers (int from, int to);


}
