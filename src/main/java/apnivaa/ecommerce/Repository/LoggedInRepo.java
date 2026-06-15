package apnivaa.ecommerce.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import apnivaa.ecommerce.Entity.LoggedInUsers;


@Repository
public interface LoggedInRepo  extends CrudRepository<LoggedInUsers, Integer>  {

}
