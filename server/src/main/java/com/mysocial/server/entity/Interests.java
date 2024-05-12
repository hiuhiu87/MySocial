package com.mysocial.server.entity;

import com.mysocial.server.entity.base.BaseEntity;
import com.mysocial.server.infrastructure.constant.EntityProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@DynamicUpdate
@Table(name = "interests")
@Entity
public class Interests extends BaseEntity {

    @Nationalized
    @Column(length = EntityProperties.LENGTH_ICON)
    private String icon;

    @Nationalized
    @Column(length = EntityProperties.LENGTH_CONTENT)
    private String content;
}
