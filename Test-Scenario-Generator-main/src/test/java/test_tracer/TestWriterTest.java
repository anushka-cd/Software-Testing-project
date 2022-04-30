package test_tracer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Vector;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class TestWriterTest {
    /**
     * Method under test: {@link TestWriter#isInterrupt(String, String, java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsInterrupt() {


        TestWriter.isInterrupt("42", "42", new HashMap<>());
    }

    /**
     * Method under test: {@link TestWriter#isInterrupt(String, String, java.util.Map)}
     */
    @Test
    void testIsInterrupt2() {
        HashMap<String, ActivityNode> stringActivityNodeMap = new HashMap<>();
        stringActivityNodeMap.put("42", new ActivityNode());
        assertFalse(TestWriter.isInterrupt("42", "42", stringActivityNodeMap));
    }

    /**
     * Method under test: {@link TestWriter#writeTests(Vector, java.util.Map)}
     */
    @Test
    void testWriteTests() {
        Vector<Vector<String>> activityPaths = new Vector<>();
        assertTrue(TestWriter.writeTests(activityPaths, new HashMap<>()).isEmpty());
    }

    /**
     * Method under test: {@link TestWriter#writeTests(Vector, java.util.Map)}
     */
    @Test
    void testWriteTests2() {
        Vector<Vector<String>> vectorList = new Vector<>();
        vectorList.add(new Vector<>());
        assertEquals(1, TestWriter.writeTests(vectorList, new HashMap<>()).size());
    }

    /**
     * Method under test: {@link TestWriter#writeTests(Vector, java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testWriteTests3() {


        Vector<String> stringList = new Vector<>();
        stringList.add("foo");

        Vector<Vector<String>> vectorList = new Vector<>();
        vectorList.add(stringList);
        TestWriter.writeTests(vectorList, new HashMap<>());
    }

    /**
     * Method under test: {@link TestWriter#writeTests(Vector, java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testWriteTests4() {


        Vector<String> stringList = new Vector<>();
        stringList.add("foo");
        stringList.add("foo");

        Vector<Vector<String>> vectorList = new Vector<>();
        vectorList.add(stringList);
        TestWriter.writeTests(vectorList, new HashMap<>());
    }

    /**
     * Method under test: {@link TestWriter#readTests(Vector)}
     */
    @Test
    void testReadTests() {

        TestWriter.readTests(new Vector<>());
    }

    /**
     * Method under test: {@link TestWriter#readTests(Vector)}
     */
    @Test
    void testReadTests2() {

        Vector<Vector<String>> vectorList = new Vector<>();
        vectorList.add(new Vector<>());
        TestWriter.readTests(vectorList);
    }

    /**
     * Method under test: {@link TestWriter#readTests(Vector)}
     */
    @Test
    void testReadTests3() {


        Vector<String> stringList = new Vector<>();
        stringList.add("foo");

        Vector<Vector<String>> vectorList = new Vector<>();
        vectorList.add(stringList);
        TestWriter.readTests(vectorList);
    }

    /**
     * Method under test: {@link TestWriter#getPreviousActions(ActivityNode, int, Vector, java.util.Map)}
     */
    @Test
    void testGetPreviousActions() {
        ActivityNode node = new ActivityNode();
        Vector<String> activityPath = new Vector<>();
        assertTrue(TestWriter.getPreviousActions(node, 1, activityPath, new HashMap<>()).isEmpty());
    }
}

