package com.faw.config;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
public class MultipleMongoConfig {

    @Autowired
    private MultipleMongoProperties mongoProperties;
    
    @Primary
    @Bean(PrimaryMongoConfig.MONGO_TEMPLATE)
    public MongoTemplate primaryMongoTemplate() throws Exception {
        return new MongoTemplate(primaryFactory(this.mongoProperties.getPrimary()));
    }

//    @Bean(SecondaryMongoConfig.MONGO_TEMPLATE)
//    public MongoTemplate secondaryMongoTemplate() throws Exception {
//        return new MongoTemplate(secondaryFactory(this.mongoProperties.getSecondary()));
//    }
//
//    @Bean(TertiaryMongoConfig.MONGO_TEMPLATE)
//    public MongoTemplate tertiaryTemplate() throws Exception {
//    	return new MongoTemplate(tertiaryFactory(this.mongoProperties.getTertiary()));
//    }

    @Bean
    @Primary
    public MongoDbFactory primaryFactory(MongoProperties mongo) throws Exception {
        return new SimpleMongoDbFactory(new MongoClient(mongo.getUri()), mongo.getDatabase());
    }

//    @Bean
//    public MongoDbFactory secondaryFactory(MongoProperties mongo) throws Exception {
//        return new SimpleMongoDbFactory(new MongoClient(mongo.getUri()), mongo.getDatabase());
//    }
//
//    @Bean
//    public MongoDbFactory tertiaryFactory(MongoProperties mongo) throws Exception {
//    	return new SimpleMongoDbFactory(new MongoClient(mongo.getUri()), mongo.getDatabase());
//    }
    
}
