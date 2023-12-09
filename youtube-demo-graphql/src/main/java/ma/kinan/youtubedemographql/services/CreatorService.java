package ma.kinan.youtubedemographql.services;

import lombok.AllArgsConstructor;
import ma.kinan.youtubedemographql.dtos.CreatorRequest;
import ma.kinan.youtubedemographql.entities.Creator;
import ma.kinan.youtubedemographql.mappers.CreatorMapper;
import ma.kinan.youtubedemographql.repositories.ICreatorRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Eren
 **/
@Component
@AllArgsConstructor
public class CreatorService {
    private ICreatorRepository creatorRepository;
    private CreatorMapper creatorMapper;
    public Creator getCreatorById(Long id){
        return creatorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Creator with id = " + id + " not found."));
    }
    public Creator saveCreator(CreatorRequest creatorRequest){
        return creatorRepository.save(creatorMapper.fromCreatorRequestToCreator(creatorRequest));
    }
}
