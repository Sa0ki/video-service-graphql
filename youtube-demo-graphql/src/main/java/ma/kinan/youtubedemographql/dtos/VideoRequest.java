package ma.kinan.youtubedemographql.dtos;

import lombok.*;

import java.util.Date;

/**
 * @author Eren
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VideoRequest {
    private String title;
    private String url;
    private String description;
    private Date createdAt;
    private CreatorRequest creator;
}
