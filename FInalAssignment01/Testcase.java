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
        // Beispiel Interaktion um einen DAWN Stein zu legen
        // add gamestone correct
        Terminal.addSingleLineOutputThatIsExactly("place 5;-6;5;0", "OK");
        // print
        Terminal.addMultipleLinesOutputThatIsExactly("print", "---------------", "---------------", "---------------",
                "---------------", "---------------", "+--------------", "---------------", "---------------",
                "---------------", "---------------", "---------------");
        // starts program with no arguments
        Main.main(NO_ARGS);

    }

    @Test
    public void test_02() {
        // Beispiel Interaktion um einen Spielstein der Länge 5 zu legen
        // add gamestone wrong
        Terminal.addSingleLineOutputThatIsExactly("place 0;-4:0;1", "Error, the token is not completely on the board.");
        // starts program with no arguments
        Main.main(NO_ARGS);

    }

    @Test
    public void test_03() {
        // Beispiel Interaktion um einen Spielstein der Länge 5 zu legen
        // add gamestone correct
        Terminal.addSingleLineOutputThatIsExactly("place 0;0:0;4", "OK");
        // print
        Terminal.addMultipleLinesOutputThatIsExactly("print", "+++++----------", "---------------", "---------------",
                "---------------", "---------------", "---------------", "---------------", "---------------",
                "---------------", "---------------", "---------------");
        // starts program with no arguments
        Main.main(NO_ARGS);

    }

    @Test
    public void test_04() {
        // Beispiel Interaktion um einen Spielstein der Länge 5 zu legen
        // add gamestone correct
        Terminal.addSingleLineOutputThatIsExactly("place 0;4:0;0", "OK");
        // print
        Terminal.addMultipleLinesOutputThatIsExactly("print", "+++++----------", "---------------", "---------------",
                "---------------", "---------------", "---------------", "---------------", "---------------",
                "---------------", "---------------", "---------------");
        // starts program with no arguments
        Main.main(NO_ARGS);

    }

}
