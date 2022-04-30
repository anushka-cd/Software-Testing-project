package test_tracer;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ActivityNodeTest {
    /**
     * Method under test: default or parameterless constructor of {@link ActivityNode}
     */
    @Test
    void testConstructor() {
        ActivityNode actualActivityNode = new ActivityNode();
        assertTrue(actualActivityNode.ownedIds.isEmpty());
        assertTrue(actualActivityNode.outTransitions.isEmpty());
        assertTrue(actualActivityNode.inTransitions.isEmpty());
    }
}

