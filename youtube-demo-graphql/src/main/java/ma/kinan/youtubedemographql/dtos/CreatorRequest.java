package ma.kinan.youtubedemographql.dtos;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Eren
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatorRequest {
    private String name;
    private String email;
}
