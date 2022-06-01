package com.example.pnvstudentmanager;

public class Students {
    public int id;
    public String name;
    public   Float score;

    public Students(int id, String name, Float score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Students (String name, Float score){
        this.name = name;
        this.score = score;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPoint(){
        return score;
    }
    public void setPoint(Float point) {
        this.score = score;
    }

}
