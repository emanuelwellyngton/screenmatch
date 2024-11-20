package xyz.codenestsolucoes.screenmatch.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.command.annotation.Option;
import org.springframework.stereotype.Component;
import xyz.codenestsolucoes.screenmatch.controller.MediaController;
import xyz.codenestsolucoes.screenmatch.controller.SerieController;
import xyz.codenestsolucoes.screenmatch.model.MediaModel;
import xyz.codenestsolucoes.screenmatch.model.MovieModel;
import xyz.codenestsolucoes.screenmatch.model.SerieModel;

@Component
@Command(command = "find")
public class MenuView {
    @Autowired
    private MediaController mediaController;

    public void SerieService(){

    }

    @Command(command="movie by-id")
    public void searchMovieByID(@Option String id) {
        MediaModel model = mediaController.getMediaById(id);
        showmediaDetails(model);
    }

    @Command(command = "movie by-name")
    public void searchMovieByName(@Option String name) {
        System.out.println(name);
    }

    @Command(command = "serie by-id")
    public void searchSerieByID(@Option String id) {
        MediaModel model = mediaController.getMediaById(id);
        showmediaDetails(model);
    }

    @Command(command = "serie by-name")
    public void searchSerieByName(@Option String name) {

    }

    public void showmediaDetails(MediaModel model) {
        System.out.println("-- Detalhes da Mídia --\n");
        System.out.println("Título: " + model.getTitle() );
        System.out.println("Ano de lançamento: " + model.getYear());
        System.out.println("Sinopse: " + model.getPlot());

        if(model instanceof SerieModel serieModel) {
            System.out.println("Total de Temporadas: " + serieModel.getTotalSeasons());
        }
    }
}
