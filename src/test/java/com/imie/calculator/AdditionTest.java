/**
 *
 */
package com.imie.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Typhanie BRETECHE
 *
 */
public class AdditionTest {

    /**
     * @throws java.lang.Exception
     */
    private Addition add;

    @Before
    public void setUp() throws Exception {
        this.add = new Addition(1);
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for {@link com.imie.calculator.Addition#make(int)}.
     */
    @Test
    public void testAddition() {
        Assert.assertNotNull(this.add);
        Assert.assertEquals(1, this.add.value);
    }

    /**
     * Test method for {@link com.imie.calculator.Addition#make(int)}.
     */
    @Test
    public void testMake() {
        this.add.make(2);

        //3 ? add.value
        Assert.assertNotNull(this.add);
        Assert.assertEquals(3, this.add.value);
    }

    /**
     * Test method for {@link com.imie.calculator.Addition#getValue()}.
     */
    @Test
    public void testGetValue() {
        Addition add = new Addition(1);

        Assert.assertNotNull(add);
        Assert.assertEquals(1, add.getValue());
    }

}
