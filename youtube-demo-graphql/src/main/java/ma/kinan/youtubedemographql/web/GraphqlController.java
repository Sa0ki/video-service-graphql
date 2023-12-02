package ma.kinan.youtubedemographql.web;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.kinan.youtubedemographql.entities.Creator;
import ma.kinan.youtubedemographql.entities.Video;
import ma.kinan.youtubedemographql.repositories.ICreatorRepository;
import ma.kinan.youtubedemographql.repositories.IVideoRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author Eren
 **/
@Controller
@AllArgsConstructor
public class GraphqlController {
    private ICreatorRepository creatorRepository;
    private IVideoRepository videoRepository;
    @QueryMapping
    public List<Video> getVideos(){
        return videoRepository.findAll();
    }
    @QueryMapping
    public Creator getCreatorById(@Argument Long id){
        return creatorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Creator with id = " + id + " not found."));
    }
}
