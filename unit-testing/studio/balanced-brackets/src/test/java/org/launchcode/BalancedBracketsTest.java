package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    String str1 = ""
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void oneBracketReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void stringWithBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("c[rap]"));
    }
    @Test
    public void stringWithoutBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("crap"));
    }
    @Test
    public void stringOneBracketReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void bracketsOutOfOrderReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void multipleSetsWrongOrderReturnsFalse () {
        assertFalse((BalancedBrackets.hasBalancedBrackets("[][]]"));
    }
}