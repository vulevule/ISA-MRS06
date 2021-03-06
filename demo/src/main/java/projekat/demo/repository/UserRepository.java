package projekat.demo.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import projekat.demo.model.RoleType;
import projekat.demo.model.User;

public interface UserRepository extends CrudRepository<User, String> {


	User findByEmail(String email);
	
	User findByEmailAndPassword(String username, String password);
	
	User findByEmailAndRole(String email, RoleType role);
	
	Collection<User> findByRole(RoleType role);
}
