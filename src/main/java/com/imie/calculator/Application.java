/**
 *
 */
package com.imie.calculator;

/**
 * @author Typhanie BRETECHE
 *
 */
public class Application {

    /**
     * @param args
     */
    public static void main(final String[] args) {
        final int a = 1;

        final Addition add = new Addition(a);

        add.make(2);
        System.out.println(add.getValue());

        add.make(3);
        System.out.println(add.getValue());

        System.out.println("Hello World");

    }

}
