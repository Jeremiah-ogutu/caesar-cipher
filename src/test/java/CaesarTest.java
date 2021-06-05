
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void NewCaesarObjectGetsCorrectlyCreated_true() throws Exception {
        Caesar caesar = new Caesar("hi",1);
        assertEquals(true, caesar  instanceof Caesar);
    }
}
