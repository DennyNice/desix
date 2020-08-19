package com.example.desix.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

// Annotation Document because mongodb has another sintax and document its a usual TABLE like in SQL
@Document(collection = "language")
@Data
public class LanguageMongo {

    @Id
    // Very important in mongo db id must be String
    private String id;

    private String name;
    private String creator;
    private String feature;

    public LanguageMongo( String name, String creator, String feature) {
        this.name = name;
        this.creator = creator;
        this.feature = feature;
    }
}
