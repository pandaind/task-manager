package demo.practice.taskmanager.data.jpa.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersistenceConfiguration {
	/**
	 * Primary Data source for Repositories
	 */
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	@Primary
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	/**
	 * Secondary Data source for data migration
	 */
	@Bean
	@ConfigurationProperties(prefix = "datasource.flyway")
	@FlywayDataSource
	public DataSource flywayDataSource() {
		return DataSourceBuilder.create().build();
	}
}
