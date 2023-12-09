package ma.kinan.youtubedemographql.controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.kinan.youtubedemographql.dtos.CreatorRequest;
import ma.kinan.youtubedemographql.entities.Creator;
import ma.kinan.youtubedemographql.services.CreatorService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

/**
 * @author Eren
 **/
@Controller
@AllArgsConstructor
public class CreatorController {
    private CreatorService creatorService;
    @QueryMapping
    public Creator getCreatorById(@Argument Long id){
        return creatorService.getCreatorById(id);
    }
    @MutationMapping
    public Creator saveCreator(@Argument CreatorRequest creatorRequest){
        return creatorService.saveCreator(creatorRequest);
    }
}
