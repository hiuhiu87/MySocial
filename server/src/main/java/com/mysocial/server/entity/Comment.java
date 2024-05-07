package com.mysocial.server.entity;

import com.mysocial.server.entity.base.BaseEntity;
import com.mysocial.server.infrastructure.constant.EntityProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "comment")
@Entity
public class Comment extends BaseEntity {

    @ManyToOne
    private UserSocial userSocial;

    @ManyToOne
    private Post post;

    @Nationalized
    @Column(length = EntityProperties.LENGTH_DESCRIPTION)
    private String content;

    @ManyToOne
    private Comment parent;

}
