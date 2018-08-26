package com.zenhog.zh.spring.javaconfig.scratch.services;

import com.zenhog.zh.spring.javaconfig.scratch.repositories.GreetingRepository;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new EnglishGreetingService(greetingRepository);
            case "de":
                return new GermanGreetingService(greetingRepository);
            case "es":
                return new SpanishGreetingService(greetingRepository);
            default:
                return new EnglishGreetingService(greetingRepository);
        }
    }
}
