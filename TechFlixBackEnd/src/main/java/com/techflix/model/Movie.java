package com.techflix.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "movies")
public class Movie {
    @Id
    private String id;

    private String title;
    private String image;  // Armazenará a imagem em formato base64
    private String description;  // Adicionando campo de descrição
    private String genre;  // Adicionando campo de gênero
    private boolean isNew;

    @Field("link")
    private String watchLink; // Mapeando o campo do banco de dados

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    public String getWatchLink() {
        return watchLink;
    }

    public void setWatchLink(String watchLink) {
        this.watchLink = watchLink;
    }
}
