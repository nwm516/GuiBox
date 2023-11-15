package org.example;

/**
 * Test class for the GuiBox project
 *
 * @author Nicholas Miller
 * @version 11/14/2023
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class GuiBoxTest {

    // Constructor Test
    @Test
    public void boxConstructorTest() {
        Box testBox = new Box(3, 3, 4);
        assertNotNull(testBox);
    }

    // Invalid Dimensions Tests
    @Test
    public void invalidLengthTest() {
        assertThrows(IllegalArgumentException.class, () -> new Box(-3, 3, 4));
    }
    @Test
    public void invalidWidthTest() {
        assertThrows(IllegalArgumentException.class, () -> new Box(4, -5, 4));
    }
    @Test
    public void invalidHeightTest() {
        assertThrows(IllegalArgumentException.class, () -> new Box(10, 12, -12));
    }

    // Getter Tests
    @Test
    public void getLengthTest() {
        Box testBox = new Box(10, 11, 12);

        assertEquals(10, testBox.getLength(), 0.00);
    }
    @Test
    public void getWidthTest() {
        Box testBox = new Box(10, 11, 12);

        assertEquals(11, testBox.getWidth(), 0.00);
    }
    @Test
    public void getHeightTest() {
        Box testBox = new Box(10, 11, 12);

        assertEquals(12, testBox.getHeight(), 0.00);
    }

    // Setter Tests
    @Test
    public void setLengthTest() {
        Box testBox = new Box(20, 20, 30);

        double lengthValue = 25;
        testBox.setLength(lengthValue);

        assertEquals(lengthValue, testBox.getLength(), 0.00);
    }

    @Test
    public void setWidthTest() {
        Box testBox = new Box(20, 20, 30);

        double widthValue = 40;
        testBox.setWidth(widthValue);

        assertEquals(widthValue, testBox.getWidth(), 0.00);
    }

    @Test
    public void setHeightTest() {
        Box testBox = new Box(20, 20, 30);

        double heightValue = 10;
        testBox.setHeight(heightValue);

        assertEquals(heightValue, testBox.getHeight(), 0.00);
    }
}
