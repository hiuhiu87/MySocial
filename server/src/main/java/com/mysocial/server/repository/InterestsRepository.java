package com.mysocial.server.repository;

import com.mysocial.server.entity.Interests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestsRepository extends JpaRepository<Interests, String> {
}
