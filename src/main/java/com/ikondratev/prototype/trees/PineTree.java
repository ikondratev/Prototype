package com.ikondratev.prototype.trees;

public class PineTree extends Tree {
    private String type;
    private int size;

    public PineTree(String type, int size) {
        this.size = size;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public Tree copy() {
        PineTree clone =  new PineTree(
                this.getType(), this.getSize()
        );

        return clone;
    }

    @Override
    public String toString() {
        return this.getType() + " " + this.getSize();
    }
}
