package com.example.recyc;

import android.widget.TextView;

public class MainModel {
    String email, course, name, turl;

    public MainModel(){

    }
    public MainModel(String email, String course, String name, String turl) {
        this.email = email;
        this.course = course;
        this.name = name;
        this.turl = turl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTurl() {
        return turl;
    }

    public void setTurl(String turl) {
        this.turl = turl;
    }
}
