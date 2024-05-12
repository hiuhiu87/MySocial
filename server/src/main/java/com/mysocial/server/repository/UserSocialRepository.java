package com.mysocial.server.repository;

import com.mysocial.server.entity.UserSocial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSocialRepository extends JpaRepository<UserSocial, String> {
}
