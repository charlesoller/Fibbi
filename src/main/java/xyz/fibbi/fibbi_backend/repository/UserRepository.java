package xyz.fibbi.fibbi_backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.fibbi.fibbi_backend.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
