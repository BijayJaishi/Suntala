package com.kumar.dipanshu.residemenu;

/**
 * Created by Bijay on 11/12/2019.
 */

public class Model_mycart {

    public String cartid;
    public int cartimage;
    public String cartfruitname;
    public String cartfruitcost;
    public String cartfruittype;
    public String cartfruitdescription;

    public Model_mycart() {
    }

    public Model_mycart(String cartid, int cartimage, String cartfruitname, String cartfruitcost, String cartfruittype, String cartfruitdescription) {
        this.cartid = cartid;
        this.cartimage = cartimage;
        this.cartfruitname = cartfruitname;
        this.cartfruitcost = cartfruitcost;
        this.cartfruittype = cartfruittype;
        this.cartfruitdescription = cartfruitdescription;
    }

    public String getCartid() {
        return cartid;
    }

    public void setCartid(String cartid) {
        this.cartid = cartid;
    }

    public int getCartimage() {
        return cartimage;
    }

    public void setCartimage(int cartimage) {
        this.cartimage = cartimage;
    }

    public String getCartfruitname() {
        return cartfruitname;
    }

    public void setCartfruitname(String cartfruitname) {
        this.cartfruitname = cartfruitname;
    }

    public String getCartfruitcost() {
        return cartfruitcost;
    }

    public void setCartfruitcost(String cartfruitcost) {
        this.cartfruitcost = cartfruitcost;
    }

    public String getCartfruittype() {
        return cartfruittype;
    }

    public void setCartfruittype(String cartfruittype) {
        this.cartfruittype = cartfruittype;
    }

    public String getCartfruitdescription() {
        return cartfruitdescription;
    }

    public void setCartfruitdescription(String cartfruitdescription) {
        this.cartfruitdescription = cartfruitdescription;
    }
}
