package com.mysocial.server.repository;

import com.mysocial.server.entity.Saved;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavedRepository extends JpaRepository<Saved, String> {
}
