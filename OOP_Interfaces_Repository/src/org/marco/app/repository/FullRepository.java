package org.marco.app.repository;

// Aqui tenemos herencia multiple de interfaces
public interface FullRepository extends CrudRepository, OrdenableRepository, PaginableRepository, ContableRepository {

}
