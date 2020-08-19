package com.example.desix.repo;

import com.example.desix.domain.LanguageMySQL;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LanguageMySQLRepo extends CrudRepository<LanguageMySQL,Long> {
    LanguageMySQL findByCreatorAndName(String creator, String name);
}
