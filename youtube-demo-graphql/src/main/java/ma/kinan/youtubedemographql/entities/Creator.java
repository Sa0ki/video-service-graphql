package ma.kinan.youtubedemographql.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * @author Eren
 **/
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Creator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "creator")
    private List<Video> videos;
}
