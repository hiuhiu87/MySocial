package com.mysocial.tool.content;

import com.mysocial.tool.content.info.InterestsInfo;
import com.mysocial.tool.content.info.UserSocialInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class DBContent {

    /**
     * Create Data For Interests
     */
    public final static List<InterestsInfo> INTERESTS_INFOS = Arrays.asList(
            new InterestsInfo("icon1", "Sing"),
            new InterestsInfo("icon1", "Song"),
            new InterestsInfo("icon3", "Code"),
            new InterestsInfo("icon4", "Chill"),
            new InterestsInfo("icon5", "Football")
    );

    /**
     * Create Data For UserSocial
     */
    public final static List<UserSocialInfo> USER_SOCIAL_INFOS = Arrays.asList(
            new UserSocialInfo(
                    "Nguyễn Minh Hiếu",
                    "minhhieu8723@gmail.com",
                    "Nhey1123@",
                    "https://avatars.githubusercontent.com/u/114718657?v=4",
                    "vinbigdata - Hà Nội - 13:41 - same time - nguyenminh.hieu.7758235",
                    "hiuhiu87"
            ),
            new UserSocialInfo(
                    "Trịnh Hiếu Nghĩa",
                    "nghiaxpes1@gmail.com",
                    "Nghiaxpes1",
                    "https://avatars.githubusercontent.com/u/125682339?s=400&u=2e3cdbb095c9ef7bce47234da290a374f73b7c80&v=4",
                    "42, ngõ 2, ĐL Thăng Long, nghia.pe.332",
                    ".Try to become better."
            ),
            new UserSocialInfo(
                    "Nguyễn Bá Cường",
                    "cuongwf.ngb@gmail.com",
                    "cuongwf",
                    "https://avatars.githubusercontent.com/u/121405290?v=4",
                    "Cống - Bắc Ninh, bcuongwf",
                    ".>_<."
            ),
            new UserSocialInfo(
                    "Lục Văn Luật",
                    "lucvanluat@gmail.com",
                    "Nghiaxpes1",
                    "https://avatars.githubusercontent.com/u/125682339?s=400&u=2e3cdbb095c9ef7bce47234da290a374f73b7c80&v=4",
                    "Bãi rác - Cao Bằng, ",
                    ".Eó có gì."
            ),
            new UserSocialInfo(
                    "Another",
                    "another@gmail.com",
                    "another",
                    "https://avatars.githubusercontent.com/u/121405290?v=4",
                    "another.location",
                    "._>another.bio<_."
            )
    );


}
