package edu.kit.informatik;
import static org.hamcrest.Matchers.*; //see: http://hamcrest.org/JavaHamcrest/javadoc/1.3/org/hamcrest/Matchers.html

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;


public class Testcase3 {

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
        Terminal.addSingleLineOutputThatIsExactly("set-vc 0;0", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 1;0:1;1", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 0;1:0;0", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 1;3:-5;3", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 0;1", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 3", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 2;0:2;2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 0;0", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 0;4:0;7", "OK");
        Terminal.addSingleLineOutputThatMatches("roll 5", startsWith("Error"));
        Terminal.addSingleLineOutputThatIsExactly("move 0;1", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 5", "OK");
        Terminal.addSingleLineOutputThatMatches("place 0;7:0;11", startsWith("Error"));
        Terminal.addSingleLineOutputThatIsExactly("place 0;8:0;12", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 0;0", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 6", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 0;13:5;13", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 0;1", "OK");
        Terminal.addSingleLineOutputThatIsExactly("set-vc 1;12", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll DAWN", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 3;12:3;6", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 1;11", "OK");
        Terminal.addSingleLineOutputThatMatches("place 10;0:10;6", startsWith("Error"));
        Terminal.addSingleLineOutputThatIsExactly("roll 2", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 3;5:3;4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 1;12", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 6", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 3;3:8;3", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 1;11", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 3", "OK");
        Terminal.addSingleLineOutputThatMatches("place 0;6:2;6", startsWith("Error"));
        Terminal.addSingleLineOutputThatIsExactly("place 6;0:6;2", "OK");
        Terminal.addSingleLineOutputThatMatches("move 1;11", startsWith("Error"));
        Terminal.addSingleLineOutputThatIsExactly("move 2;11:1;11", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 4", "OK");
        Terminal.addSingleLineOutputThatIsExactly("place 10;0:10;3", "OK");
        Terminal.addSingleLineOutputThatIsExactly("move 2;11", "OK");
        Terminal.addSingleLineOutputThatIsExactly("roll 5", "OK");
        Terminal.addSingleLineOutputThatMatches("place 10;4:10;9", startsWith("Error"));
        Terminal.addSingleLineOutputThatIsExactly("place 10;4:10;8", "OK");
        
        Terminal.addSingleLineOutputThatMatches("roll 4", startsWith("Error"));
        Terminal.addSingleLineOutputThatMatches("show-result", startsWith("Error"));
        Terminal.addSingleLineOutputThatIsExactly("move 1;11", "OK");
        Terminal.addMultipleLinesOutputThatIsExactly("print", "-V-+++++++++++-", "++-+-------C-+-", "+++----------+-",
                "---+++++++++++-", "---+---------+-", "---+---------+-", "++++-----------", "---+-----------",
                "---+-----------", "---------------", "+++++++++------");
        Terminal.addSingleLineOutputThatIsExactly("show-result", "33");
        Terminal.addNoOutput("quit");
        // starts program with no arguments
        Main.main(NO_ARGS);
    }
}
