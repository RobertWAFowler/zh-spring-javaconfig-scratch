package com.zenhog.zh.spring.javaconfig.scratch.services;

import com.zenhog.zh.spring.javaconfig.scratch.repositories.GreetingRepository;

public class SpanishGreetingService implements GreetingService {

    GreetingRepository greetingRepository;

    public SpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String getGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
