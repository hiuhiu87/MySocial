package com.mysocial.tool;

import com.mysocial.server.entity.Interests;
import com.mysocial.server.entity.UserInterests;
import com.mysocial.server.entity.UserSocial;
import com.mysocial.tool.content.DBContent;
import com.mysocial.tool.content.info.InterestsInfo;
import com.mysocial.tool.content.info.UserSocialInfo;
import com.mysocial.tool.repository.DBGenCategoryRepository;
import com.mysocial.tool.repository.DBGenCommentRepository;
import com.mysocial.tool.repository.DBGenCommunityRepository;
import com.mysocial.tool.repository.DBGenEmotionPostRepository;
import com.mysocial.tool.repository.DBGenFollowsRepository;
import com.mysocial.tool.repository.DBGenImageRepository;
import com.mysocial.tool.repository.DBGenInterestsRepository;
import com.mysocial.tool.repository.DBGenPostPendingRepository;
import com.mysocial.tool.repository.DBGenPostRepository;
import com.mysocial.tool.repository.DBGenRuleRepository;
import com.mysocial.tool.repository.DBGenSavedRepository;
import com.mysocial.tool.repository.DBGenUserCommunityRepository;
import com.mysocial.tool.repository.DBGenUserInterestsRepository;
import com.mysocial.tool.repository.DBGenUserSocialRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.mysocial.tool.repository")
public class DBGenerator implements CommandLineRunner {

    private final DBGenCategoryRepository categoryRepository;

    private final DBGenCommentRepository commentRepository;

    private final DBGenCommunityRepository communityRepository;

    private final DBGenFollowsRepository followsRepository;

    private final DBGenImageRepository imageRepository;

    private final DBGenInterestsRepository interestsRepository;

    private final DBGenEmotionPostRepository likeRepository;

    private final DBGenPostPendingRepository postPendingRepository;

    private final DBGenPostRepository postRepository;

    private final DBGenRuleRepository ruleRepository;

    private final DBGenSavedRepository savedRepository;

    private final DBGenUserInterestsRepository userInterestsRepository;

    private final DBGenUserCommunityRepository userCommunityRepository;

    private final DBGenUserSocialRepository userSocialRepository;

    public DBGenerator(
            DBGenImageRepository imageRepository,
            DBGenCategoryRepository categoryRepository,
            DBGenCommentRepository commentRepository,
            DBGenCommunityRepository communityRepository,
            DBGenFollowsRepository followsRepository,
            DBGenEmotionPostRepository likeRepository,
            DBGenInterestsRepository interestsRepository,
            DBGenPostPendingRepository postPendingRepository,
            DBGenUserSocialRepository userSocialRepository,
            DBGenPostRepository postRepository,
            DBGenRuleRepository ruleRepository,
            DBGenUserInterestsRepository userInterestsRepository,
            DBGenSavedRepository savedRepository,
            DBGenUserCommunityRepository userCommunityRepository
    ) {
        this.imageRepository = imageRepository;
        this.categoryRepository = categoryRepository;
        this.commentRepository = commentRepository;
        this.communityRepository = communityRepository;
        this.followsRepository = followsRepository;
        this.likeRepository = likeRepository;
        this.postPendingRepository = postPendingRepository;
        this.userSocialRepository = userSocialRepository;
        this.postRepository = postRepository;
        this.ruleRepository = ruleRepository;
        this.savedRepository = savedRepository;
        this.userCommunityRepository = userCommunityRepository;
        this.interestsRepository = interestsRepository;
        this.userInterestsRepository = userInterestsRepository;
    }

    /**
     * config main class ApplicationContext Run Class DBGenerator and Close fake DB
     *
     * @param args ctx run and close
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DBGenerator.class);
        ctx.close();
    }

    /**
     * function use for UserSocial data
     *
     * @param socialInfo from DBContent
     * @return new UserSocial
     */
    private static UserSocial getUserSocial(UserSocialInfo socialInfo) {
        UserSocial userSocial = new UserSocial();
        userSocial.setFullName(socialInfo.getFullName());
        userSocial.setEmail(socialInfo.getEmail());
        userSocial.setPassword(socialInfo.getPassword());
        userSocial.setAvatar(socialInfo.getAvatar());
        userSocial.setLocation(socialInfo.getLocation());
        userSocial.setBio(socialInfo.getBio());
        return userSocial;
    }

    /**
     * function use for Interests data
     *
     * @param interestsInfo from DBContent
     * @return new Interests
     */
    private static Interests getInterests(InterestsInfo interestsInfo) {
        Interests interests = new Interests();
        interests.setIcon(interestsInfo.getIcon());
        interests.setContent(interestsInfo.getContent());
        return interests;
    }

    /**
     * function main class run fake db from DBContent
     *
     * @param args main
     * @throws Exception throwsException when fake db
     */
    @Override
    public void run(String... args) throws Exception {

        // Interests data
        for (InterestsInfo interestsInfo : DBContent.INTERESTS_INFOS) {
            Interests interests = getInterests(interestsInfo);
            interestsRepository.save(interests);
        }

        // UserSocial data
        for (UserSocialInfo socialInfo : DBContent.USER_SOCIAL_INFOS) {
            UserSocial userSocial = getUserSocial(socialInfo);
            userSocialRepository.save(userSocial);
        }

        // Interests _ UserSocial data
        for (InterestsInfo interestsInfo : DBContent.INTERESTS_INFOS) {
            Optional<Interests> interests = interestsRepository.findByContent(interestsInfo.getContent());
            interests.ifPresent(this::setInterests);
        }

    }

    /**
     * function fake data for Interests _ UserSocial data
     *
     * @param interests get interests from db and set data for new interests
     */
    private void setInterests(Interests interests) {
        for (UserSocialInfo socialInfo : DBContent.USER_SOCIAL_INFOS) {
            Optional<UserSocial> userSocial = userSocialRepository.findByEmail(socialInfo.getEmail());
            userSocial.ifPresent(social -> setUserSocial(interests, social));
        }
    }

    /**
     * function fake data for Interests _ UserSocial data
     *
     * @param interests  get interests from db and set data for new interests
     * @param userSocial get userSocial from db and set data for new  userSocial
     */
    private void setUserSocial(Interests interests, UserSocial userSocial) {
        UserInterests userInterests = new UserInterests();
        userInterests.setInterests(interests);
        userInterests.setUserSocial(userSocial);
        userInterests.setIsShow(interests.getIcon().equalsIgnoreCase("icon1"));
        userInterestsRepository.save(userInterests);
    }
}
