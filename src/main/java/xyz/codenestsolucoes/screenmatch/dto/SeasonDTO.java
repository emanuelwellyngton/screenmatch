package xyz.codenestsolucoes.screenmatch.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SeasonDTO(@JsonAlias("Title") String titulo,
                        @JsonAlias("Season") int numero,
                        @JsonAlias("Episodes") ArrayList<EpisodeDTO> episodios) {
}
