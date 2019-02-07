package edu.kit.informatik;

import static org.hamcrest.Matchers.*; //see: http://hamcrest.org/JavaHamcrest/javadoc/1.3/org/hamcrest/Matchers.html

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Testcase for final_assginment_01 Testcase is based on the work of: Moritz
 * Halm Joshua Gleitze ITI, VeriAlg Group IPD, SDQ Group
 * 
 * @author Pascal Henrich
 */
public class Testcase {

    private static final String[] NO_ARGS = {};

    @BeforeClass
    public static void enableTerminalTestingMode() {
        Terminal.enableTestingMode();
    }

    @After
    public void cleanUp() {
        // Important to tell the Terminal to check the last output
        Terminal.flush();
        Terminal.reset();
    }

    @Test
    public void test_01() {
        // add student should print out OK
        Terminal.addSingleLineOutputThatIsExactly("add student", "OK");
        // list students can output students in any order
        Terminal.addMultipleLineOutputThatMatches("list students", containsInAnyOrder("Emil", "Paul"));
        // quit should not print out anything
        Terminal.addNoOutput("quit");

        // starts program with no arguments
        Main.main(NO_ARGS);

    }
}
