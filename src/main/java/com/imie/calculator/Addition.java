/**
 *
 */
package com.imie.calculator;

/**
 *
 * @author Typhanie BRETECHE
 *
 */
public class Addition {

    /**
     * Declare variable value.
     */
    protected int value;

    /**
     * Fonction addition.
     * @param a
     */
    public Addition(final int a) {
        this.value = a;
    }

    /**
     * Fonction make.
     * @param b
     */
    public void make(final int b) {
        this.value += b; // += b :: this.value + b
    }

    /**
     * Retourne la valeur.
     * @return
     */
    public int getValue() {
        return this.value;
    }
}
