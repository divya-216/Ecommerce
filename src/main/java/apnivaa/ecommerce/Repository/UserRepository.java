package apnivaa.ecommerce.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import apnivaa.ecommerce.Entity.User;
@Repository
public interface UserRepository  extends CrudRepository<User, Integer>  {

}
