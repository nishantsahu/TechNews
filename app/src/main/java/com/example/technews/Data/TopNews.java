package com.example.technews.Data;

public class TopNews {
    String title, imageUrl;

    public TopNews(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
