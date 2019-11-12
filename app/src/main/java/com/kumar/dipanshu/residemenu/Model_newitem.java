package com.kumar.dipanshu.residemenu;

/**
 * Created by Bijay on 11/12/2019.
 */

public class Model_newitem {

    public String id;
    public String newfruitname;
    public int newfruitimage;
    public String newfruitcost;

    public Model_newitem() {
    }

    public Model_newitem(String id, String newfruitname, int newfruitimage, String newfruitcost) {
        this.id = id;
        this.newfruitname = newfruitname;
        this.newfruitimage = newfruitimage;
        this.newfruitcost = newfruitcost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNewfruitname() {
        return newfruitname;
    }

    public void setNewfruitname(String newfruitname) {
        this.newfruitname = newfruitname;
    }

    public int getNewfruitimage() {
        return newfruitimage;
    }

    public void setNewfruitimage(int newfruitimage) {
        this.newfruitimage = newfruitimage;
    }

    public String getNewfruitcost() {
        return newfruitcost;
    }

    public void setNewfruitcost(String newfruitcost) {
        this.newfruitcost = newfruitcost;
    }
}
