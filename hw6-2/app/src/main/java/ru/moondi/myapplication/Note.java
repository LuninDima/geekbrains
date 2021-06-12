package ru.moondi.myapplication;

public class Note {
    private String name;
    private String description;
    private String date;
    private String text;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Note(String name, String description, String date, String text) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.text = text;
    }
}
