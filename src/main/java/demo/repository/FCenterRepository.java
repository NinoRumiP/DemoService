package demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import demo.model.FCenter;
import io.swagger.annotations.ApiParam;

@RepositoryRestResource()
public interface FCenterRepository extends CrudRepository<FCenter, Long> {
	
	List<FCenter> findByName(@ApiParam(name="name")@RequestParam("name") @Param("name") String name);
	List<FCenter> findByLocation(@ApiParam(name="location")@RequestParam("location")@Param("location") String location);
	List<FCenter> findByNameContainingIgnoreCase(@ApiParam(name="name")@RequestParam("name")@Param("name") String name);
	List<FCenter> findByLocationContainingIgnoreCase(@ApiParam(name="location")@RequestParam("location")@Param("location") String location);
}
