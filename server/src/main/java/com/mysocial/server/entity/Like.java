package com.mysocial.server.entity;

import com.mysocial.server.entity.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@DynamicUpdate
@Table(name = "likes")
@Entity
public class Like extends BaseEntity {

    @ManyToOne
    private UserSocial userSocial;

    @ManyToOne
    private Post post;

}
