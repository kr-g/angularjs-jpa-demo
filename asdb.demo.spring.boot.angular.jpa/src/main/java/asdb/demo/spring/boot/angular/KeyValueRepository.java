package asdb.demo.spring.boot.angular;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestResource(path = "alldb")
public interface KeyValueRepository extends CrudRepository<KeyValueElement, Long>  {

	@RequestMapping("/{key}")
	List<KeyValueElement> findByKey(@Param("key") String key);
	
}
