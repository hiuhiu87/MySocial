package com.mysocial.server.repository;

import com.mysocial.server.entity.UserInterests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInterestsRepository extends JpaRepository<UserInterests, String> {
}
