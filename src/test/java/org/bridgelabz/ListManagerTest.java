package org.bridgelabz;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {
    ListManager listManager = new ListManager();

    @Test
    public void shouldAddElementToTheList() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 5);
        assertEquals(1, list.size());
        assertTrue(list.contains(5));
    }

    @Test
    public void shouldRemoveElementFromTheList() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        listManager.removeElement(list, 10);
        assertFalse(list.contains(10));
        assertEquals(0, list.size());
    }

    @Test
    public void shouldGiveSizeOfTheList() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, listManager.getSize(list));
        listManager.addElement(list, 20);
        assertEquals(1, listManager.getSize(list));
    }
}
