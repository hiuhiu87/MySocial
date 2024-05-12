package com.mysocial.tool.repository;

import com.mysocial.server.entity.UserSocial;
import com.mysocial.server.repository.UserSocialRepository;

import java.util.Optional;

public interface DBGenUserSocialRepository extends UserSocialRepository {

    Optional<UserSocial> findByEmail(String mail);

}
