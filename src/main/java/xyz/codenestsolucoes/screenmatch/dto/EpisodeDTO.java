package xyz.codenestsolucoes.screenmatch.dto;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record EpisodeDTO(@JsonAlias("Title") String title,
                         @JsonAlias("Episode") int number,
                         @JsonAlias("Released") String released) {
}
