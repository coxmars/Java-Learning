package org.marco.app.repository;

import org.marco.app.model.Customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Utilizamos implementación multiple de interfaces o herencia multiple interfaces
public class CustomerListRepository implements CrudRepository,OrdenableRepository,PaginableRepository,ContableRepository {

    private List<Customer> dataSource;

    public CustomerListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Customer> listCustomers() {
        return dataSource;
    }

    @Override
    public Customer customerById(Integer id) {
        Customer customerFound = null;
        for (Customer customer: dataSource) {
            if (customer.getId()!=null && customer.getId().equals(id)) {
                customerFound = customer;
                break;
            }
        }

        return customerFound;
    }

    @Override
    public void saveCustomer(Customer customer) {
        this.dataSource.add(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        Customer customerFound = this.customerById(customer.getId());
        customerFound.setNombre(customer.getNombre());
        customerFound.setApellido(customer.getApellido());
    }

    // Este remove o eliminar utiliza por debajo equals por lo que debemos tener el equals
    // en la clase de Customer para que funcione
    @Override
    public void deleteCustomer(Integer id) {
        Customer customerFound = this.customerById(id);
        this.dataSource.remove(customerFound);
    }

    @Override
    public List<Customer> listCustomers(String field, Direction direction) {
        // Creamos otra lista para insertar los clientes ordenados (La normal es inmutable)
        List<Customer> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer a, Customer b) {
                int result = 0;
                if (direction == Direction.ASC) {
                    switch (field) {
                        case "id" -> result = a.getId().compareTo(b.getId());
                        case "nombre" -> result = a.getNombre().compareTo(b.getNombre());
                        case "apellido" -> result = a.getApellido().compareTo(b.getApellido());
                    }
                }
                else if (direction == Direction.DESC) {
                    switch (field) {
                        case "id" -> result = b.getId().compareTo(a.getId());
                        case "nombre" -> result = b.getNombre().compareTo(a.getNombre());
                        case "apellido" -> result = b.getApellido().compareTo(a.getApellido());
                    }
                }
                return result;
            }
        });

        return listaOrdenada;
    }

    @Override
    public List<Customer> listCustomers(int from, int to) {
        return dataSource.subList(from,to);
    }

    @Override
    public int total() {
        return dataSource.size();
    }
}
