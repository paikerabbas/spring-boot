package com.saien.springbootone;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserVO, Long> {
	
	Optional<UserVO> findUserByUsername(String username);

}
