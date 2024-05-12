package com.mysocial.server.repository;

import com.mysocial.server.entity.EmotionPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmotionPostRepository extends JpaRepository<EmotionPost, String> {
}
