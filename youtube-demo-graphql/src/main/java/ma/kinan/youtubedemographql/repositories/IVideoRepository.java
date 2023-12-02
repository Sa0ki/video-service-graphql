package ma.kinan.youtubedemographql.repositories;

import ma.kinan.youtubedemographql.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVideoRepository extends JpaRepository<Video, Long> {
}
