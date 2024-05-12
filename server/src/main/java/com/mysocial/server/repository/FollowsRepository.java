package com.mysocial.server.repository;

import com.mysocial.server.entity.Follows;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowsRepository extends JpaRepository<Follows, String> {
}
