package co.develhope.crud_rest.api.repositories;

import co.develhope.crud_rest.api.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Integer> {
}

