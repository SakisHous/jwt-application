package gr.aueb.cf.jwtapplication.repository;

import gr.aueb.cf.jwtapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> getUserInfoByUsername(String username);
}
