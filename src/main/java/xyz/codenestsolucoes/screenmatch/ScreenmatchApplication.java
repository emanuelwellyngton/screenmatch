package xyz.codenestsolucoes.screenmatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import xyz.codenestsolucoes.screenmatch.controller.SerieController;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	@Autowired
	private SerieController serieController;

	public static void main(String[] args)
	{
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(serieController.loadSerieByID("tt0898266").getSeasons());
	}
}
