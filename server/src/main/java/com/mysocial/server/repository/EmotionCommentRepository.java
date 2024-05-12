package com.mysocial.server.repository;

import com.mysocial.server.entity.EmotionComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmotionCommentRepository extends JpaRepository<EmotionComment, String> {
}
