package apnivaa.ecommerce.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import apnivaa.ecommerce.Entity.Product;

@Repository
public interface ProductRepository  extends CrudRepository<Product, Integer>  {

}
