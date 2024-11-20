package xyz.codenestsolucoes.screenmatch.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MediaDTO(@JsonAlias("Title") String titulo,
                       @JsonAlias("imdbID") String id,
                       @JsonAlias("totalSeasons") int quantTemporadas,
                       @JsonAlias("Plot") String sinopse,
                       @JsonAlias("Poster") String poster,
                       @JsonAlias("Year") String ano,
                       @JsonAlias("Type") String tipo){
}
