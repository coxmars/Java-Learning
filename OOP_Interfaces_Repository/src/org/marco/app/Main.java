package org.marco.app;

import org.marco.app.model.Customer;
import org.marco.app.repository.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Este es como nuestro DAO (Data Access Object)
        CrudRepository repository = new CustomerListRepository();

        // Agregamos clientes
        repository.saveCustomer(new Customer("Marco","Araya"));
        repository.saveCustomer(new Customer("Luis","Navarro"));
        repository.saveCustomer(new Customer("Josue","Rivera"));
        repository.saveCustomer(new Customer("Daniela","Sanchez"));
        repository.saveCustomer(new Customer("Ashley","Castillo"));
        repository.saveCustomer(new Customer("Nicol","Gomez"));
        repository.saveCustomer(new Customer("Sofia","Loaiza"));

        // Listamos clientes
        System.out.println("--------- Lista total ------------");
        List<Customer> customers = repository.listCustomers();
        customers.forEach(System.out::println); // Replace lambda for Method reference

        // Listamos clientes por paginacion - Trae del 0 al 2 porque es excluyente
        System.out.println("--------- Lista paginacion ------------");
        // Aqui hacemos un cast de PaginableRepository porque tenemos varias interfaces
        // con el mismo metodo pero distinta implementacion, la alternativa seria unificar todas
        // las interfaces en una fullRepository y se hace el llamado a esa nada más sin hacer cast
        List<Customer> paginable = ((PaginableRepository)repository).listCustomers(0,3);
        paginable.forEach(System.out::println);

        // Listamos clientes por orden - Forma ascendente y descendente
        System.out.println("--------- Lista ordenacion ------------");
        List<Customer> ordenable = ((OrdenableRepository)repository).listCustomers("nombre", Direction.ASC);
        ordenable.forEach(System.out::println);

        // Actualizamos un cliente y luego lo listamos para validar el cambio
        System.out.println("--------- Actualizar cliente ------------");
        Customer updateCustomer = new Customer("Marco", "Jiménez");
        updateCustomer.setId(1);
        // Actualizamos el cliente
        repository.updateCustomer(updateCustomer);
        Customer customerAfter = repository.customerById(1);
        System.out.println("El cliente actualizado es: " + customerAfter);

        // Eliminamos un cliente
        System.out.println("--------- Eliminar cliente ------------");
        repository.deleteCustomer(1);
        ordenable.forEach(System.out::println);

        // Total de clientes
        System.out.println("--------- Total clientes ------------");
        System.out.println("Clientes: " + ((ContableRepository)repository).total());
    }
}
