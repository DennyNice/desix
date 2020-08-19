package com.example.desix.repo;

import com.example.desix.domain.LanguageMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageMongoRepo  extends MongoRepository<LanguageMongo,String> {
}
