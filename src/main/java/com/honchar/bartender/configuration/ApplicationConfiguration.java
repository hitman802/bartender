package com.honchar.bartender.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

@Configuration
@EnableJpaRepositories("com.honchar.bartender.repositories")
public class ApplicationConfiguration {
}
