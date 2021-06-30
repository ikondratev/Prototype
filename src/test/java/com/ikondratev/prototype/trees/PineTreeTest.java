package com.ikondratev.prototype.trees;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class PineTreeTest {
    PineTree original;
    PineTree clone;

    @Before
    public void preset() {
        original = new PineTree("OriginalPineTree", 15);
    }

    @Test
    public void copy() {
        clone = (PineTree) original.copy();
        assertEquals(clone.getClass(), original.getClass());
        assertEquals(clone.getType(), original.getType());
        assertEquals(clone.getSize(), original.getSize());
    }
}