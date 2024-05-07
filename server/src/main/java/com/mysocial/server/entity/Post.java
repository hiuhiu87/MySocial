package com.mysocial.server.entity;

import com.mysocial.server.entity.base.BaseEntity;
import com.mysocial.server.infrastructure.constant.EntityProperties;
import com.mysocial.server.infrastructure.constant.PostAccessModifier;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "post")
@Entity
public class Post extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserSocial userSocial;

    @Nationalized
    @Column(length = EntityProperties.LENGTH_DESCRIPTION)
    private String content;

    @Enumerated(EnumType.STRING)
    private PostAccessModifier accessModifier;

    private Long deletedAt;

}
