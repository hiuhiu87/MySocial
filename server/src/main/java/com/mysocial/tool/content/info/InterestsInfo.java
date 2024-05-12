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
public class InterestsInfo {

    @Nationalized
    @Column(length = EntityProperties.LENGTH_ICON)
    private String icon;

    @Nationalized
    @Column(length = EntityProperties.LENGTH_CONTENT)
    private String content;

}
