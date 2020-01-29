import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PingpongTest {

    @Test
    public void runPingpong_countUpToOne_ArrayList() {
        Pingpong testPingpong = new Pingpong();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        assertEquals(expectedOutput, testPingpong.runPingpong(1));
    }

}