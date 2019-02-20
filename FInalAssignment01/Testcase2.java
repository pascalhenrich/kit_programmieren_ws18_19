package edu.kit.informatik;

import static org.hamcrest.Matchers.*; //see: http://hamcrest.org/JavaHamcrest/javadoc/1.3/org/hamcrest/Matchers.html

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Testcase for final_assginment_01 Testcase is based on the work of: Moritz
 * Halm, Joshua Gleitze ITI, VeriAlg Group IPD, SDQ Group
 * 
 * @author Pascal Henrich
 */
public class Testcase2 {

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
        Terminal.addSingleLineOutputThatIsExactly("set-vc 3;5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 1;-2:1;4", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "---------------", "+++++----------", "---------------",
                "-----V---------", "---------------", "---------------", "---------------", "---------------",
                "---------------", "---------------", "---------------");
        Terminal.addSingleLineOutputThatIsExactly("move 3;6:3;7:3;6:3;5:3;4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 6;6:6;1", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "---------------", "+++++----------", "---------------",
                "----V----------", "---------------", "---------------", "-++++++--------", "---------------",
                "---------------", "---------------", "---------------");
        Terminal.addSingleLineOutputThatIsExactly("move 4;4:4;3:3;3", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 1;5:2;5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 2;3:3;3", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 2;9:4;9", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 2;3:3;3", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 6;0:2;0", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 3;2:3;3", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 2;1:5;1", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 4;3:4;2:5;2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("set-vc 3;7", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "---------------", "++++++---------", "++---+---+-----",
                "++-----C-+-----", "++-------+-----", "++V------------", "+++++++--------", "---------------",
                "---------------", "---------------", "---------------");
        Terminal.addSingleLineOutputThatIsExactly("roll 3", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 2;6:2;8", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 3;8:3;7:3;6", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 5;7:11;7", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "---------------", "++++++---------", "++---+++++-----",
                "++----C--+-----", "++-------+-----", "++V----+-------", "++++++++-------", "-------+-------",
                "-------+-------", "-------+-------", "-------+-------");
        Terminal.addSingleLineOutputThatIsExactly("move 3;5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 3;6:4;6", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 4;5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 3", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 7;8:4;8", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 4;4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 7;1:7;5", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 5;4:4;4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 6", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 1;6:1;11", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 5;4:4;4", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "---------------", "++++++++++++---", "++---+++++-----",
                "++----+--+-----", "++--C-+-++-----", "++V----++------", "+++++++++------", "-+++++-++------",
                "-------+-------", "-------+-------", "-------+-------");
        Terminal.addSingleLineOutputThatIsExactly("show-result", "14");
        Terminal.addNoOutput("quit");
        // starts program with no arguments
        Main.main(NO_ARGS);
    }
    
    @Test
    public void test_02() {
        Terminal.addSingleLineOutputThatIsExactly("set-vc 4;3", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatMatches("place -1;2:-1;8", startsWith("Error"));
        Terminal.addSingleLineOutputThatMatches("place 2;3:4;5", startsWith("Error"));
        Terminal.addSingleLineOutputThatIsExactly("reset", "OK");
        Terminal.addSingleLineOutputThatMatches("set-vc -1;0", startsWith("Error"));
        Terminal.addSingleLineOutputThatIsExactly("set-vc 4;3", "OK");
        Terminal.addSingleLineOutputThatMatches("roll dawn", startsWith("Error"));
        Terminal.addSingleLineOutputThatMatches(" roll dawn", startsWith("Error"));
        Terminal.addSingleLineOutputThatIsExactly("roll 2", "OK");
        Terminal.addSingleLineOutputThatMatches("place 2;1:2;3", startsWith("Error"));
        Terminal.addSingleLineOutputThatMatches("place 2;1:3;2", startsWith("Error"));
        Terminal.addSingleLineOutputThatMatches("place 2; 1:3;2", startsWith("Error"));
        Terminal.addSingleLineOutputThatMatches("place 2; 1;3;2", startsWith("Error"));
        Terminal.addSingleLineOutputThatIsExactly("place 0;1:0;2", "OK");
        Terminal.addSingleLineOutputThatMatches("move 4;4:4;5:4;6", startsWith("Error"));
        Terminal.addNoOutput("quit");
        // starts program with no arguments
        Main.main(NO_ARGS);
    }
    
    @Test
    public void test_03() {
        Terminal.addSingleLineOutputThatIsExactly("set-vc 3;4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 2;-5:2;1", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "---------------", "---------------", "++-------------",
                "----V----------", "---------------", "---------------", "---------------", "---------------",
                "---------------", "---------------", "---------------");
        Terminal.addSingleLineOutputThatIsExactly("reset", "OK");
        Terminal.addSingleLineOutputThatIsExactly("set-vc 3;4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 2;1:2;-5", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "---------------", "---------------", "++-------------",
                "----V----------", "---------------", "---------------", "---------------", "---------------",
                "---------------", "---------------", "---------------");
        Terminal.addSingleLineOutputThatIsExactly("reset", "OK");
        Terminal.addSingleLineOutputThatIsExactly("set-vc 3;4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 2;13:2;19", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "---------------", "---------------", "-------------++",
                "----V----------", "---------------", "---------------", "---------------", "---------------",
                "---------------", "---------------", "---------------");
        Terminal.addSingleLineOutputThatIsExactly("reset", "OK");
        Terminal.addSingleLineOutputThatIsExactly("set-vc 3;4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 2;19:2;13", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "---------------", "---------------", "-------------++",
                "----V----------", "---------------", "---------------", "---------------", "---------------",
                "---------------", "---------------", "---------------");
        Terminal.addSingleLineOutputThatIsExactly("reset", "OK");
        Terminal.addSingleLineOutputThatIsExactly("set-vc 3;4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place -5;1:1;1", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "-+-------------", "-+-------------", "---------------",
                "----V----------", "---------------", "---------------", "---------------", "---------------",
                "---------------", "---------------", "---------------");
        Terminal.addSingleLineOutputThatIsExactly("reset", "OK");
        Terminal.addSingleLineOutputThatIsExactly("set-vc 3;4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 1;1:-5;1", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "-+-------------", "-+-------------", "---------------",
                "----V----------", "---------------", "---------------", "---------------", "---------------",
                "---------------", "---------------", "---------------");
        Terminal.addSingleLineOutputThatIsExactly("reset", "OK");
        Terminal.addSingleLineOutputThatIsExactly("set-vc 3;4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 9;2:15;2", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "---------------", "---------------", "---------------",
                "----V----------", "---------------", "---------------", "---------------", "---------------",
                "---------------", "--+------------", "--+------------");
        Terminal.addSingleLineOutputThatIsExactly("reset", "OK");
        Terminal.addSingleLineOutputThatIsExactly("set-vc 3;4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 15;2:9;2", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "---------------", "---------------", "---------------",
                "----V----------", "---------------", "---------------", "---------------", "---------------",
                "---------------", "--+------------", "--+------------");
        Terminal.addNoOutput("quit");
        // starts program with no arguments
        Main.main(NO_ARGS);
    }
}