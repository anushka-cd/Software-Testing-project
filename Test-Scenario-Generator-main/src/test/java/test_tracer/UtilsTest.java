package test_tracer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Vector;
import javax.imageio.metadata.IIOMetadataNode;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class UtilsTest {
    /**
     * Method under test: {@link Utils#printActNode(ActivityNode)}
     */
    @Test
    void testPrintActNode() {
        ActivityNode activityNode = new ActivityNode();
        Utils.printActNode(activityNode);
        Vector<InTransition> inTransitionList = activityNode.inTransitions;
        assertEquals(inTransitionList, activityNode.ownedIds);
        Vector<OutTransition> outTransitionList = activityNode.outTransitions;
        assertEquals(inTransitionList, outTransitionList);
        assertEquals(outTransitionList, activityNode.inTransitions);
    }

    /**
     * Method under test: {@link Utils#printActNode(ActivityNode)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPrintActNode2() {


        Utils.printActNode(null);
    }

    /**
     * Method under test: {@link Utils#printPaths(Vector, java.util.Map)}
     */
    @Test
    void testPrintPaths() {

        Vector<Vector<String>> activityPaths = new Vector<>();
        Utils.printPaths(activityPaths, new HashMap<>());
    }

    /**
     * Method under test: {@link Utils#printPaths(Vector, java.util.Map)}
     */
    @Test
    void testPrintPaths2() {


        Vector<Vector<String>> vectorList = new Vector<>();
        vectorList.add(new Vector<>());
        Utils.printPaths(vectorList, new HashMap<>());
    }

    /**
     * Method under test: {@link Utils#printPaths(Vector, java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPrintPaths3() {


        Vector<String> stringList = new Vector<>();
        stringList.add("foo");

        Vector<Vector<String>> vectorList = new Vector<>();
        vectorList.add(stringList);
        Utils.printPaths(vectorList, new HashMap<>());
    }

    /**
     * Method under test: {@link Utils#printActNodeMap(java.util.Map)}
     */
    @Test
    void testPrintActNodeMap() {

        Utils.printActNodeMap(new HashMap<>());
    }

    /**
     * Method under test: {@link Utils#printActNodeMap(java.util.Map)}
     */
    @Test
    void testPrintActNodeMap2() {


        HashMap<String, ActivityNode> stringActivityNodeMap = new HashMap<>();
        stringActivityNodeMap.put("\nActivity Node Map:", new ActivityNode());
        Utils.printActNodeMap(stringActivityNodeMap);
    }

    /**
     * Method under test: {@link Utils#printActNodeMap(java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPrintActNodeMap3() {

        HashMap<String, ActivityNode> stringActivityNodeMap = new HashMap<>();
        stringActivityNodeMap.put("\nActivity Node Map:", null);
        Utils.printActNodeMap(stringActivityNodeMap);
    }

    /**
     * Method under test: {@link Utils#nodeToString(org.w3c.dom.Node)}
     */
    @Test
    void testNodeToString() {
        assertEquals("<Node Name/>\r\n", Utils.nodeToString(new IIOMetadataNode("Node Name")));
    }

    /**
     * Method under test: {@link Utils#nodeToString(org.w3c.dom.Node)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testNodeToString2() {


        Utils.nodeToString(new IIOMetadataNode());
    }

    /**
     * Method under test: {@link Utils#openWebpage(URI)}
     */
    @Test
    void testOpenWebpage() {


        Utils.openWebpage(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri());
    }

    /**
     * Method under test: {@link Utils#openWebpage(URL)}
     */
    @Test
    void testOpenWebpage2() throws MalformedURLException {

        Utils.openWebpage(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL());
    }
}

