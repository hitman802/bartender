package com.honchar.bartender.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.honchar.bartender.repositories")
public class ApplicationConfiguration {
}
