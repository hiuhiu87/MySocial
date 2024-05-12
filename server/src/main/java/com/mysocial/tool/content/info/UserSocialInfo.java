package com.mysocial.tool.content.info;

import com.mysocial.server.infrastructure.constant.EntityProperties;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserSocialInfo {

    @Nationalized
    @Column(length = EntityProperties.LENGTH_NAME)
    private String fullName;

    @Column(length = EntityProperties.LENGTH_EMAIL)
    private String email;

    private String password;

    private String avatar;

    private String location;

    @Nationalized
    private String bio;

}
