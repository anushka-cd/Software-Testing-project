package test_tracer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Vector;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class TestTracerTest {
    /**
     * Method under test: {@link TestTracer#createActivityPaths(java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateActivityPaths() {

        TestTracer.createActivityPaths(new HashMap<>());
    }

    /**
     * Method under test: {@link TestTracer#createActivityPaths(java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateActivityPaths2() {

        HashMap<String, ActivityNode> stringActivityNodeMap = new HashMap<>();
        stringActivityNodeMap.put("Couldn't find an initial node.", new ActivityNode());
        TestTracer.createActivityPaths(stringActivityNodeMap);
    }

    /**
     * Method under test: {@link TestTracer#cleanVisits(java.util.Map)}
     */
    @Test
    void testCleanVisits() {


        TestTracer.cleanVisits(new HashMap<>());
    }

    /**
     * Method under test: {@link TestTracer#cleanVisits(java.util.Map)}
     */
    @Test
    void testCleanVisits2() {


        HashMap<String, ActivityNode> stringActivityNodeMap = new HashMap<>();
        stringActivityNodeMap.put("Key", new ActivityNode());
        TestTracer.cleanVisits(stringActivityNodeMap);
    }

    /**
     * Method under test: {@link TestTracer#join(ActivityNode, String)}
     */
    @Test
    void testJoin() {
        ActivityNode activityNode = new ActivityNode();
        TestTracer.join(activityNode, "42");
        Vector<InTransition> inTransitionList = activityNode.inTransitions;
        assertEquals(inTransitionList, activityNode.ownedIds);
        Vector<OutTransition> outTransitionList = activityNode.outTransitions;
        assertEquals(inTransitionList, outTransitionList);
        assertEquals(outTransitionList, activityNode.inTransitions);
    }

    /**
     * Method under test: {@link TestTracer#allJoined(ActivityNode)}
     */
    @Test
    void testAllJoined() {
        assertTrue(TestTracer.allJoined(new ActivityNode()));
    }

    /**
     * Method under test: {@link TestTracer#getNumTrans(java.util.Map)}
     */
    @Test
    void testGetNumTrans() {
        assertEquals(0, TestTracer.getNumTrans(new HashMap<>()).intValue());
    }

    /**
     * Method under test: {@link TestTracer#getNumTrans(java.util.Map)}
     */
    @Test
    void testGetNumTrans2() {
        HashMap<String, ActivityNode> stringActivityNodeMap = new HashMap<>();
        stringActivityNodeMap.put("Key", new ActivityNode());
        assertEquals(0, TestTracer.getNumTrans(stringActivityNodeMap).intValue());
    }

    /**
     * Method under test: {@link TestTracer#getInitialActNode(java.util.Map)}
     */
    @Test
    void testGetInitialActNode() {
        assertNull(TestTracer.getInitialActNode(new HashMap<>()));
    }

    /**
     * Method under test: {@link TestTracer#getInitialActNode(java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetInitialActNode2() {


        HashMap<String, ActivityNode> stringActivityNodeMap = new HashMap<>();
        stringActivityNodeMap.put("Key", new ActivityNode());
        TestTracer.getInitialActNode(stringActivityNodeMap);
    }

    /**
     * Method under test: {@link TestTracer#isIndirectlyInConnected(ActivityNode, java.util.Map)}
     */
    @Test
    void testIsIndirectlyInConnected() {
        ActivityNode node = new ActivityNode();
        assertFalse(TestTracer.isIndirectlyInConnected(node, new HashMap<>()));
    }

    /**
     * Method under test: {@link TestTracer#isIndirectlyInConnected(ActivityNode, java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsIndirectlyInConnected2() {
           TestTracer.isIndirectlyInConnected(null, new HashMap<>());
    }

    /**
     * Method under test: {@link TestTracer#ownerIsInConnected(ActivityNode, java.util.Map)}
     */
    @Test
    void testOwnerIsInConnected() {
        ActivityNode node = new ActivityNode();
        assertFalse(TestTracer.ownerIsInConnected(node, new HashMap<>()));
    }

    /**
     * Method under test: {@link TestTracer#ownerIsInConnected(ActivityNode, java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testOwnerIsInConnected2() {


        TestTracer.ownerIsInConnected(null, new HashMap<>());
    }

    /**
     * Method under test: {@link TestTracer#aOwnedIsInConnected(ActivityNode, java.util.Map)}
     */
    @Test
    void testAOwnedIsInConnected() {
        ActivityNode node = new ActivityNode();
        assertFalse(TestTracer.aOwnedIsInConnected(node, new HashMap<>()));
    }

    /**
     * Method under test: {@link TestTracer#selectOutTransition(ActivityNode)}
     */
    @Test
    void testSelectOutTransition() {
        assertNull(TestTracer.selectOutTransition(new ActivityNode()));
    }

    /**
     * Method under test: {@link TestTracer#removeDuplicateLoops(Vector, java.util.Map)}
     */
    @Test
    void testRemoveDuplicateLoops() {
        Vector<Vector<String>> activityPaths = new Vector<>();
        assertTrue(TestTracer.removeDuplicateLoops(activityPaths, new HashMap<>()).isEmpty());
    }

    /**
     * Method under test: {@link TestTracer#removeDuplicateLoops(Vector, java.util.Map)}
     */
    @Test
    void testRemoveDuplicateLoops2() {
        Vector<Vector<String>> vectorList = new Vector<>();
        vectorList.add(new Vector<>());
        assertEquals(1, TestTracer.removeDuplicateLoops(vectorList, new HashMap<>()).size());
    }

    /**
     * Method under test: {@link TestTracer#removeDuplicateLoops(Vector, java.util.Map)}
     */
    @Test
    void testRemoveDuplicateLoops3() {
        Vector<String> stringList = new Vector<>();
        stringList.add("foo");

        Vector<Vector<String>> vectorList = new Vector<>();
        vectorList.add(stringList);
        assertEquals(1, TestTracer.removeDuplicateLoops(vectorList, new HashMap<>()).size());
    }

    /**
     * Method under test: {@link TestTracer#removeDuplicateLoops(Vector, java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveDuplicateLoops4() {

        Vector<String> stringList = new Vector<>();
        stringList.add("foo");
        stringList.add("foo");

        Vector<Vector<String>> vectorList = new Vector<>();
        vectorList.add(stringList);
        TestTracer.removeDuplicateLoops(vectorList, new HashMap<>());
    }

    /**
     * Method under test: {@link TestTracer#removeDuplicateLoops(Vector, java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRemoveDuplicateLoops5() {


        Vector<String> stringList = new Vector<>();
        stringList.add("foo");
        stringList.add("foo");
        stringList.add("foo");

        Vector<Vector<String>> vectorList = new Vector<>();
        vectorList.add(stringList);
        TestTracer.removeDuplicateLoops(vectorList, new HashMap<>());
    }

    /**
     * Method under test: {@link TestTracer#getLoops(Vector, java.util.Map)}
     */
    @Test
    void testGetLoops() {
        Vector<String> path = new Vector<>();
        assertTrue(TestTracer.getLoops(path, new HashMap<>()).isEmpty());
    }

    /**
     * Method under test: {@link TestTracer#getLoops(Vector, java.util.Map)}
     */
    @Test
    void testGetLoops2() {
        Vector<String> stringList = new Vector<>();
        stringList.add("foo");
        assertTrue(TestTracer.getLoops(stringList, new HashMap<>()).isEmpty());
    }

    /**
     * Method under test: {@link TestTracer#getLoops(Vector, java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetLoops3() {


        Vector<String> stringList = new Vector<>();
        stringList.add("foo");
        stringList.add("foo");
        TestTracer.getLoops(stringList, new HashMap<>());
    }

    /**
     * Method under test: {@link TestTracer#getLoops(Vector, java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetLoops4() {


        Vector<String> stringList = new Vector<>();
        stringList.add("foo");
        stringList.add("foo");
        stringList.add("foo");
        TestTracer.getLoops(stringList, new HashMap<>());
    }
}

