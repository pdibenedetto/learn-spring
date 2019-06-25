package com.baeldung.ls.service;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import com.baeldung.ls.persistence.model.Project;
import com.baeldung.ls.service.com.baeldung.ls.spring.TestConfig;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = TestConfig.class)
public class ProjectServiceIntegrationTest
{

    @Autowired
    private IProjectService projectService;

    @Test
    public void whenSavingProject_thenOK()
    {
        Project savedProject = projectService.save(new Project("name", LocalDate.now()));

        assertThat(savedProject, is(notNullValue()));
    }
}
