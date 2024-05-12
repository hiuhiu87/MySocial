package com.mysocial.server.entity;

import com.mysocial.server.entity.base.BaseEntity;
import com.mysocial.server.infrastructure.constant.EmotionType;
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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@DynamicUpdate
@Table(name = "emotion_comment")
@Entity
public class EmotionComment extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserSocial userSocial;

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;

    @Enumerated(EnumType.STRING)
    private EmotionType emotionType;

}
