package com.mysocial.server.repository;

import com.mysocial.server.entity.PostPending;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostPendingRepository extends JpaRepository<PostPending, String> {
}
