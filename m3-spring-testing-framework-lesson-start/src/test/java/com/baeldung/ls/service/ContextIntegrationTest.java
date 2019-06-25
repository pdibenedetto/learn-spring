package com.baeldung.ls.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class ContextIntegrationTest
{
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void whenContextIsLoaded_thenNoExceptions()
    {
    }

    /**
     * Verifies that the Spring Context Bootstrapping Process is cached as it is very expensive
     */
    @Test
    public void whenContextIsLoaded_thenNoExceptions2()
    {
    }
}
