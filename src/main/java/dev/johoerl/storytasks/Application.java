package dev.johoerl.storytasks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import lombok.extern.java.Log;
import javax.sql.DataSource;


@SpringBootApplication
@Log
public class Application implements CommandLineRunner {

	private final DataSource dataSource;

	public Application(final DataSource dataSource) {this.dataSource = dataSource;}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(final String... args) {
		log.info("Datasource: " + dataSource.toString());
		final JdbcTemplate resTemplate = new JdbcTemplate(dataSource);
		resTemplate.execute("select 1");
	}

}
