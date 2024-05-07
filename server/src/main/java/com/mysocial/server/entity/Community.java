package com.mysocial.server.entity;

import com.mysocial.server.entity.base.BaseEntity;
import com.mysocial.server.infrastructure.constant.EntityProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "community")
@Entity
public class Community extends BaseEntity {

    @Nationalized
    private String name;

    @Nationalized
    @Column(length = EntityProperties.LENGTH_DESCRIPTION)
    private String description;

    private String bannerUrl;

    @Nationalized
    private String introduce;

}
