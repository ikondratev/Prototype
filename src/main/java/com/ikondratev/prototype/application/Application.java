package com.ikondratev.prototype.application;

import com.ikondratev.prototype.trees.PineTree;
import com.ikondratev.prototype.trees.PlasticTree;

public class Application {
    public static void main(String[] args) {
        PlasticTree plasticTree = new PlasticTree("PlasticTree", 12);
        PineTree pineTree = new PineTree("PineTree", 15);

        System.out.println("Origin plastic: " + plasticTree.toString());
        System.out.println("Origin pine: " + pineTree.toString());
    }
}
