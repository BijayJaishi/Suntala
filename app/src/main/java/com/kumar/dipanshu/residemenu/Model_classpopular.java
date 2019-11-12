package com.kumar.dipanshu.residemenu;

/**
 * Created by Bijay on 11/12/2019.
 */

public class Model_classpopular {

    public String id;
    public int image;
    public String fruitnamee;
    public String fruitcostt;
    public String fruitamount;
    public String fruitdescriptionn;

    public Model_classpopular() {
    }

    public Model_classpopular(String id, int image, String fruitnamee, String fruitcostt, String fruitamount, String fruitdescriptionn) {
        this.id = id;
        this.image = image;
        this.fruitnamee = fruitnamee;
        this.fruitcostt = fruitcostt;
        this.fruitamount = fruitamount;
        this.fruitdescriptionn = fruitdescriptionn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getFruitnamee() {
        return fruitnamee;
    }

    public void setFruitnamee(String fruitnamee) {
        this.fruitnamee = fruitnamee;
    }

    public String getFruitcostt() {
        return fruitcostt;
    }

    public void setFruitcostt(String fruitcostt) {
        this.fruitcostt = fruitcostt;
    }

    public String getFruitamount() {
        return fruitamount;
    }

    public void setFruitamount(String fruitamount) {
        this.fruitamount = fruitamount;
    }

    public String getFruitdescriptionn() {
        return fruitdescriptionn;
    }

    public void setFruitdescriptionn(String fruitdescriptionn) {
        this.fruitdescriptionn = fruitdescriptionn;
    }
}
