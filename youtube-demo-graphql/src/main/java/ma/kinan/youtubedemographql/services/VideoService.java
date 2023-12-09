package ma.kinan.youtubedemographql.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.kinan.youtubedemographql.dtos.VideoRequest;
import ma.kinan.youtubedemographql.entities.Creator;
import ma.kinan.youtubedemographql.entities.Video;
import ma.kinan.youtubedemographql.mappers.CreatorMapper;
import ma.kinan.youtubedemographql.mappers.VideoMapper;
import ma.kinan.youtubedemographql.repositories.ICreatorRepository;
import ma.kinan.youtubedemographql.repositories.IVideoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Eren
 **/
@Service
@AllArgsConstructor
public class VideoService {
    private VideoMapper videoMapper;
    private CreatorMapper creatorMapper;
    private ICreatorRepository creatorRepository;
    private IVideoRepository videoRepository;
    public List<Video> getVideos(){
        return videoRepository.findAll();
    }
    public Video saveVideo(VideoRequest videoRequest){
        Creator creator = creatorRepository.save(creatorMapper.fromCreatorRequestToCreator(videoRequest.getCreator()));
        Video video = videoMapper.fromVideoRequestToVideo(videoRequest);
        video.setCreator(creator);
        return videoRepository.save(video);
    }
}
