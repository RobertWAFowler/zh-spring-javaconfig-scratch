package com.zenhog.zh.spring.javaconfig.scratch.config;

import com.zenhog.zh.spring.javaconfig.scratch.repositories.GreetingRepository;
import com.zenhog.zh.spring.javaconfig.scratch.repositories.GreetingRepositoryImpl;
import com.zenhog.zh.spring.javaconfig.scratch.services.GreetingService;
import com.zenhog.zh.spring.javaconfig.scratch.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
class GreetingServiceConfig {

    @Bean
    GreetingRepository greetingRepository(){
        return new GreetingRepositoryImpl();
    }

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default","en"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return  greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("es");
    }
}
