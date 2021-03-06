package test_tracer;

/**
 * Represents an outgoing transition to an activity node.
 * Included in a vector on the activity nodes.
 * The visits attribute is used in the Test tracer algorithm,
 * it's incremented by one unit each time the algorithm travels that transition
 * The dry attribute registers that there´s no more relevant information to be searched on that diagram tree branch
 */

public class OutTransition {
    String type = null;
    String outNodeId = null;
    String name = null;
    String guard = null;
    Integer visits = 0;
    Boolean dry = false;
    Boolean loopEntry = false;
}
