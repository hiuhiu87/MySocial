package com.mysocial.server.repository;

import com.mysocial.server.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityRepository extends JpaRepository<Community, String> {
}
