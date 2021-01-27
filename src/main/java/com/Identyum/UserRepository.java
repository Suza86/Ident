package com.Identyum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT * FROM user WHERE user_name = :user_name")
	public User findByUser(String user_name);
}
