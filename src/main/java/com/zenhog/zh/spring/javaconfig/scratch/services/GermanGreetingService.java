package com.zenhog.zh.spring.javaconfig.scratch.services;

import com.zenhog.zh.spring.javaconfig.scratch.repositories.GreetingRepository;

public class GermanGreetingService implements GreetingService {

    GreetingRepository greetingRepository;

    public GermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String getGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
