
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTest {
    private Sample sample;
    public SampleTest(){
        sample = new Sample(2,5.03, "test");
    }

    @Test
    void getX() {
        assertEquals(2,sample.getX());
    }

    @Test
    void getY() {
        assertEquals(5, sample.getY(),0.05);
        // delta is the tolerance for comparing two double numbers.
    }

    @Test
    void getZ() {
        assertEquals("test",sample.getZ());
    }

    @Test
    void getBoolean() {
        assertTrue(sample.getBoolean());
    }

    @Test
    void getReferemce() {
        assertNull(sample.getReference());
    }
}

