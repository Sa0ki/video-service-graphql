package ma.kinan.youtubedemographql.mappers;

import lombok.*;
import ma.kinan.youtubedemographql.dtos.CreatorRequest;
import ma.kinan.youtubedemographql.entities.Creator;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * @author Eren
 **/
@Component
public class CreatorMapper {
    private final ModelMapper modelMapper = new ModelMapper();
    public Creator fromCreatorRequestToCreator(CreatorRequest creatorRequest){
        return this.modelMapper.map(creatorRequest , Creator.class);
    }
    public CreatorRequest fromCreatorToCreatorRequest(Creator creator){
        return modelMapper.map(creator, CreatorRequest.class);
    }
}
