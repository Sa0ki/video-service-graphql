package ma.kinan.youtubedemographql.repositories;

import ma.kinan.youtubedemographql.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICreatorRepository extends JpaRepository<Creator, Long> {
}
