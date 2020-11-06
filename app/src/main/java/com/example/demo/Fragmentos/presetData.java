package com.example.demo.Fragmentos;

public class presetData {
    private String description;
    private int foto;
    private String title;

    public presetData() {
    }

    public presetData(String title2, int foto2, String description2) {
        this.title = title2;
        this.foto = foto2;
        this.description = description2;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title2) {
        this.title = title2;
    }

    public int getFoto() {
        return this.foto;
    }

    public void setFoto(int foto2) {
        this.foto = foto2;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description2) {
        this.description = description2;
    }
}
