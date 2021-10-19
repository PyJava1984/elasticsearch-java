package co.elastic.clients.base;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserAgentTest {

    @Test
    public void testUserAgentHeader() {
        UserAgent userAgent = new UserAgent("MegaClient", "1.2.3");
        assertEquals("MegaClient", userAgent.name());
        assertEquals("1.2.3", userAgent.version());
        assertEquals("MegaClient/1.2.3", userAgent.toString());
    }

    // TODO: test with metadata

}
