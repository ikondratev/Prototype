package com.ikondratev.prototype.trees;

public class PlasticTree extends Tree {
    private String type;
    private int lendth;

    public PlasticTree(String type, int size) {
        this.lendth = size;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLendth() {
        return lendth;
    }

    public void setLendth(int lendth) {
        this.lendth = lendth;
    }

    @Override
    public Tree copy() {
        PlasticTree clone = new PlasticTree(
                this.getType(), this.getLendth()
        );

        return clone;
    }

    @Override
    public String toString() {
        return this.getType() + " " + this.getLendth();
    }
}
