import jdk.nashorn.internal.codegen.ObjectCreator;
import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class PingpongTest {
    @Test
    // This is an annotation marked with an @ Symbol. They are used to provide extra information to the Java compiler.

    public void runPingPong_countPingPong_ArrayList() {
        Pingpong testPingPong = new Pingpong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();

        expectedOutput.add(1);
        assertEquals(expectedOutput, testPingPong.runPingpong(1));


    }

    @Test

    public void runPingPong_countUpToGivenNumber_ArrayList() throws Exception {
        Pingpong testPingPong = new Pingpong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        assertEquals(expectedOutput, testPingPong.runPingpong(2));
    }

    @Test

    public void runPingPong_replaceMultiplesOf3_ArrayList() {
        Pingpong testPingPong = new Pingpong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();

        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add("ping");

        assertEquals(expectedOutput, testPingPong.runPingpong(3));
    }

    @Test
    public void runPingPong_replaceMultiplesOf5_ArrayList() {
        Pingpong testPingPong = new Pingpong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();

        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add("ping");
        expectedOutput.add(4);
        expectedOutput.add("pong");
        assertEquals(expectedOutput, testPingPong.runPingpong(5));
    }

    @Test

    public void runPingPong_replaceMultiplesOfBoth3And5_ArrayList() {
        Pingpong testPingPong = new Pingpong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();

        expectedOutput.add(1);
        expectedOutput.add(2);
        expectedOutput.add("ping");
        expectedOutput.add(4);
        expectedOutput.add("pong");
        expectedOutput.add("ping");
        expectedOutput.add(7);
        expectedOutput.add(8);
        expectedOutput.add("ping");
        expectedOutput.add("pong");
        expectedOutput.add(11);
        expectedOutput.add("ping");
        expectedOutput.add(13);
        expectedOutput.add(14);
        expectedOutput.add("ping-pong");
        assertEquals(expectedOutput, testPingPong.runPingpong(15));
    }
}
