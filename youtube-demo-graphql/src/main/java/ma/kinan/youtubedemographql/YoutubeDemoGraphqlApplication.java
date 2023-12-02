package ma.kinan.youtubedemographql;

import ma.kinan.youtubedemographql.entities.Creator;
import ma.kinan.youtubedemographql.entities.Video;
import ma.kinan.youtubedemographql.repositories.ICreatorRepository;
import ma.kinan.youtubedemographql.repositories.IVideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class YoutubeDemoGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoutubeDemoGraphqlApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(ICreatorRepository creatorRepository, IVideoRepository videoRepository){
        return args -> {
            List<Creator> creators = creatorRepository.saveAll(List.of(
                    Creator.builder().name("Saad").email("e.saad.kinan@gmail.com").build(),
                    Creator.builder().name("Yousr").email("yfant@gmail.com").build(),
                    Creator.builder().name("Kawtar").email("kaw1999@gmail.com").build()
            ));
            int cpt = 0;
            for(int i = 0; i < creators.size(); i ++){
                videoRepository.saveAll(List.of(
                     Video.builder().title("Video " + (++cpt))
                             .createdAt(new Date())
                             .description("Description" + cpt)
                             .creator(creators.get(i))
                             .build(),
                        Video.builder().title("Video " + (++cpt))
                                .createdAt(new Date())
                                .description("Description" + cpt)
                                .creator(creators.get(i))
                                .build()
                ));
            }
        };
    }
}
