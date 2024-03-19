package com.example.demo;

public class Peliculas {
    private int id;
    private String titulo;
    private int annio;
    private String Director;
    private String genero;
    private String sinopsis;

    public Peliculas (int id,String titulo,int annio,String Director,String genero,String sinopsis){
        this.id = id;
        this.titulo = titulo;
        this.annio = annio;
        this.Director = Director;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }
    //GETTERS Y SETTERS
    public int getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getAnnio(){
        return annio;
    }
    public String getDirector(){
        return Director;
    }
    public String getGenero(){
        return genero;
    }
    public String getSinopsis(){
        return sinopsis;
    }



}
