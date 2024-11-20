package xyz.codenestsolucoes.screenmatch.model;

import xyz.codenestsolucoes.screenmatch.dto.MediaDTO;
import xyz.codenestsolucoes.screenmatch.dto.SeasonDTO;

import java.util.ArrayList;
import java.util.List;

public class SerieModel extends MediaModel {
    private int totalSeasons;
    private List<SeasonModel> seasons;

    public SerieModel(MediaDTO mediaDTOdto, List<SeasonDTO> seasonsDTOS) {
        this(mediaDTOdto);
        this.seasons = loadSeasons(seasonsDTOS);
    }

    public SerieModel(MediaDTO mediaDTO) {
        super(mediaDTO);
        this.totalSeasons = mediaDTO.quantTemporadas();
    }

    public SerieModel(){
    }

    public int getTotalSeasons() {
        return totalSeasons;
    }

    public List<SeasonModel> getSeasons() {
        return seasons;
    }

    public List<SeasonModel> loadSeasons(List<SeasonDTO> seasonDTOS) {
        var seasons = new ArrayList<SeasonModel>();

        seasonDTOS.forEach((seasonDTO) -> {
            //Creates a new instance of SeasonModel and adds it to the seasons list
            seasons.add(new SeasonModel(seasonDTO));
        });

        return seasons;
    }

    @Override
    public String toString() {
        return "SerieModel{" +
                "totalSeasons=" + totalSeasons +
                ", seasons=" + seasons +
                '}';
    }
}
