package com.mysocial.server.entity;

import com.mysocial.server.entity.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
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
@Table(name = "user_community")
@Entity
public class UserCommunity extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserSocial userSocial;

    @ManyToOne
    @JoinColumn(name = "community_id")
    private Community community;

    private Boolean isOwner;

}
