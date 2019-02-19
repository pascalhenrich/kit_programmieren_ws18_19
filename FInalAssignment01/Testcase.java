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
        Terminal.addSingleLineOutputThatIsExactly("set-vc -5;2",
                "Error, this is not a correct input!");
        Terminal.addSingleLineOutputThatIsExactly("set-vc 5;2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("state 5;2", "V");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("reset", "OK");
        Terminal.addSingleLineOutputThatIsExactly("set-vc 5;2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 6;2:6;6", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 4;2:3;2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 2;0:2;5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 4;2:3;2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 3;1:9;1", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 4;2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 3", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 5;3:5;5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 5;2:4;2:5;2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 0;0:0;1", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 4;2:5;2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 3", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 2;6:5;6", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 4;2:3;2:4;2", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "++-------------", "---------------", "+++++++--------",
                "-+----+--------", "-+V---+--------", "-+-++++--------", "-++++++--------", "-+-------------",
                "-+-------------", "-+-------------", "---------------");
        Terminal.addSingleLineOutputThatIsExactly("set-vc 3;5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 0;14:0;20", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 4;5:4;4:4;3:4;2:3;2:3;3:3;4",
                "Error, you are not allowed to do this move!");
        Terminal.addSingleLineOutputThatIsExactly("move 4;5:4;4:4;3:3;3:3;2:3;3:3;4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 10;0:10;5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 4;4:4;3:3;3:3;4:3;5:4;5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 1;13:1;14", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 3;5:3;4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 2;10:2;14", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 4;4:4;5:3;5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 3;11:3;14", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 4;5:3;5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 3", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 4;12:4;10", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 3;4:3;5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("show-result", "8");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "++------------+", "-------------++", "+++++++---+++++",
                "-+---C+----++++", "-+V---+---+++--", "-+-++++--------", "-++++++--------", "-+-------------",
                "-+-------------", "-+-------------", "++++++---------");
        Terminal.addSingleLineOutputThatIsExactly("reset", "OK");
        Terminal.addSingleLineOutputThatIsExactly("set-vc 0;0", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "V--------------", "---------------", "---------------",
                "---------------", "---------------", "---------------", "---------------", "---------------",
                "---------------", "---------------", "---------------");
        Terminal.addNoOutput("quit");
        // starts program with no arguments
        Main.main(NO_ARGS);
    }
}
