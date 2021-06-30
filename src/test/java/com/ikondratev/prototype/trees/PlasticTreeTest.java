package com.ikondratev.prototype.trees;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class PlasticTreeTest {
    PlasticTree original;
    PlasticTree clone;

    @Before
    public void preset() {
        original = new PlasticTree("OriginalPlasticTree", 15);
    }

    @Test
    public void copy() {
        clone = (PlasticTree) original.copy();
        assertEquals(clone.getClass(), original.getClass());
        assertEquals(clone.getLendth(), original.getLendth());
        assertEquals(clone.getLendth(), original.getLendth());
    }
}