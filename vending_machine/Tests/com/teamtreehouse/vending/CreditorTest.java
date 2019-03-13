// NOTES
// 0. To create test file. Open Class that you want to create a test file for. Right click class name inside Class file
// --> Go to --> Test

// 1.  Error showes up in Test. To get rid of error do
// File --> Project Structure --> Dependencies --> JUnit4 --> Change dropdown from test to provided

// 2. To create a test folder right click main folder and choose new directory.
// Right click new directory and click Mark Directory --> Test sources route. All tests files will now be saved to this directory

// 3. To start tests. Right click test folder and click Run All Tests

package com.teamtreehouse.vending;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditorTest {

    private Creditor creditor;

    @Before
    public void setUp() throws Exception {
        creditor = new Creditor();
    }

    @Test
    public void failExample() throws Exception {
        // fail(); // Force Fail
    }

    @Test
    public void addingFundsIncrementsAvailableFunds() throws Exception {
        //Arrange
        // Creditor creditor = new Creditor(); // This is now created in @Before to remove duplicate creations in each test

        // Act
        creditor.addFunds(25);
        creditor.addFunds(25);

        // Assert
        assertEquals(50, creditor.getAvailableFunds()); // Expected and Actual Value
    }

    @Test
    public void refundingReturnsAllAvailableFunds() throws Exception {
        // Creditor creditor = new Creditor();
        creditor.addFunds(10);

        int refend = creditor.refund();

        assertEquals(10, refend);
    }

    @Test
    public void refundingResetsAvailableFundsToZero () throws Exception {
        // Creditor creditor = new Creditor();
        creditor.addFunds(10);

        creditor.refund();

        assertEquals(0, creditor.getAvailableFunds());
    }
}