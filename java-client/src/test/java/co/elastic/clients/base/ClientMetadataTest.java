package co.elastic.clients.base;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ClientMetadataTest {

    @Test
    public void testHasMetadata() {
        ClientMetadata metadata = new ClientMetadata();
        assertTrue(metadata.toString().length() > 0);
    }

}
