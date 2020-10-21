package com.motaharinia.base.config;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Configuration
@Transactional
public class IndexingConfiguration {

    @Autowired
    private EntityManager entityManager;

    @Bean
    public FullTextEntityManager getFullTextEntityManager() throws InterruptedException {
        FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(entityManager);
        fullTextEntityManager.createIndexer().startAndWait();
        return fullTextEntityManager;
    }
}
