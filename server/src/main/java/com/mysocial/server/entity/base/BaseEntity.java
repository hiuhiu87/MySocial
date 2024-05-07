package com.mysocial.server.entity.base;

import com.mysocial.server.infrastructure.constant.EntityProperties;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity extends AuditEntity {

    @Id
    @Column(length = EntityProperties.LENGTH_ID)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

}
