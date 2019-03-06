package com.example.cardviewexample;

public class Contact {

    int image;
    String name;
    String num;
    int call;


    public Contact(int image, String name, String num, int call) {
        this.image = image;
        this.name = name;
        this.num = num;
        this.call = call;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }
}
