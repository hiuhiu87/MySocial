package com.mysocial.tool.repository;

import com.mysocial.server.entity.Interests;
import com.mysocial.server.repository.InterestsRepository;

import java.util.Optional;

public interface DBGenInterestsRepository extends InterestsRepository {

    Optional<Interests> findByContent(String content);

}
