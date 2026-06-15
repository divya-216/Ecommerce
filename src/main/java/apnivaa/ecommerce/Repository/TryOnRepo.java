package apnivaa.ecommerce.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import apnivaa.ecommerce.Entity.TryOnPreview;

@Repository
public interface TryOnRepo extends CrudRepository<TryOnPreview, Integer>{

}
