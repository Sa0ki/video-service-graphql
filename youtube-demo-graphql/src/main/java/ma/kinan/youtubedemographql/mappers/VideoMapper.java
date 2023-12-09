package ma.kinan.youtubedemographql.mappers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.kinan.youtubedemographql.dtos.VideoRequest;
import ma.kinan.youtubedemographql.entities.Video;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * @author Eren
 **/
@Component
public class VideoMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public Video fromVideoRequestToVideo(VideoRequest videoRequest){
        return modelMapper.map(videoRequest, Video.class);
    }
    public VideoRequest fromVideoToVideoRequest(Video video){
        return modelMapper.map(video, VideoRequest.class);
    }
}
