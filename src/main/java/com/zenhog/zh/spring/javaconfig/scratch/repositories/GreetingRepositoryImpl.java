package com.zenhog.zh.spring.javaconfig.scratch.repositories;

public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello from English Greeting Service";
    }

    @Override
    public String getGermanGreeting() {
        return "Hello from German Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hello from Spanish Greeting Service";
    }
}
