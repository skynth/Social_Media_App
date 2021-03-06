package com.example.socialmediaapp;

//Makeup of the individual element in the recyclerview
public class StaticRvModel {
    private int image;
    private String text;

    public void setImage(int image) {
        this.image = image;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public StaticRvModel(int image, String text) {
        this.image = image;
        this.text = text;
    }
}
