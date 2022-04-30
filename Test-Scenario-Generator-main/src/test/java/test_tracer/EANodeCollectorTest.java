package test_tracer;

import java.util.HashMap;
import javax.imageio.metadata.IIOMetadataNode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;

class EANodeCollectorTest {
    /**
     * Method under test: {@link EANodeCollector#getActivityDiagram(Document, TracerForm)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetActivityDiagram() {

        EANodeCollector.getActivityDiagram(null, null);
    }

    /**
     * Method under test: {@link EANodeCollector#collectNodes(Document, org.w3c.dom.Node, java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCollectNodes() {


        IIOMetadataNode diagramNode = new IIOMetadataNode("Node Name");
        EANodeCollector.collectNodes(null, diagramNode, new HashMap<>());
    }

    /**
     * Method under test: {@link EANodeCollector#collectNodes(Document, org.w3c.dom.Node, java.util.Map)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCollectNodes2() {

        EANodeCollector.collectNodes(null, null, new HashMap<>());
    }
}

