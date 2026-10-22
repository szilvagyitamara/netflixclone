package com.netflixclone.netflixclone.dao;

import com.netflixclone.netflixclone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
