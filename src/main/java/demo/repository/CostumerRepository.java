package demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import demo.model.Costumer;
import demo.model.FCenter;
import io.swagger.annotations.ApiParam;

@RepositoryRestResource()
public interface CostumerRepository extends CrudRepository<Costumer, Long> {
	List<Costumer> findByNameContainingIgnoreCase(@ApiParam(name="name")@RequestParam("name")@Param("name") String name);
	List<Costumer> findBySurnameContainingIgnoreCase(@ApiParam(name="surname")@RequestParam("surname")@Param("surname") String name);
}
