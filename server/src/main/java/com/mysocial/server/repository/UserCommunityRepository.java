package com.mysocial.server.repository;

import com.mysocial.server.entity.UserCommunity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCommunityRepository extends JpaRepository<UserCommunity, String> {
}
