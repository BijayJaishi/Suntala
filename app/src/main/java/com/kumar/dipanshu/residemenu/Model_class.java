package com.kumar.dipanshu.residemenu;

/**
 * Created by Bijay on 11/10/2019.
 */

public class Model_class {

    public String id;
    public int image;
    public String fruitname;
    public String fruitcost;
    public String fruittype;
    public String fruitdescription;

    public Model_class() {
    }

    public Model_class(String id, int image, String fruitname, String fruitcost, String fruittype, String fruitdescription) {
        this.id = id;
        this.image = image;
        this.fruitname = fruitname;
        this.fruitcost = fruitcost;
        this.fruittype = fruittype;
        this.fruitdescription = fruitdescription;
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

    public String getFruitname() {
        return fruitname;
    }

    public void setFruitname(String fruitname) {
        this.fruitname = fruitname;
    }

    public String getFruitcost() {
        return fruitcost;
    }

    public void setFruitcost(String fruitcost) {
        this.fruitcost = fruitcost;
    }

    public String getFruittype() {
        return fruittype;
    }

    public void setFruittype(String fruittype) {
        this.fruittype = fruittype;
    }

    public String getFruitdescription() {
        return fruitdescription;
    }

    public void setFruitdescription(String fruitdescription) {
        this.fruitdescription = fruitdescription;
    }
}
