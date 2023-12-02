package ma.kinan.youtubedemographql.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

/**
 * @author Eren
 **/
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String url;
    private String description;
    private Date createdAt;
    @ManyToOne
    private Creator creator;
}
