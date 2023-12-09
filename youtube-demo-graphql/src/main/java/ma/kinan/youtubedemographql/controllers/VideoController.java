package ma.kinan.youtubedemographql.controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.kinan.youtubedemographql.dtos.VideoRequest;
import ma.kinan.youtubedemographql.entities.Video;
import ma.kinan.youtubedemographql.services.VideoService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author Eren
 **/
@Controller
@AllArgsConstructor
public class VideoController {
    private VideoService videoService;
    @QueryMapping
    public List<Video> getVideos(){
        return videoService.getVideos();
    }
    @MutationMapping
    public Video saveVideo(@Argument VideoRequest videoRequest){
        return videoService.saveVideo(videoRequest);
    }
}
