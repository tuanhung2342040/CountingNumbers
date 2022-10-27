package point3D_ver1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {
    private Point2D p2;
    public Point2DTest(){
        p2 = new Point2D(2, 3);
    }
    @Test
    void move() {
        System.out.println("Test move():");
       p2.move(19.5, 5.2);
       assertEquals(19.5, p2.getX());
       assertEquals(5.2, p2.getY());
    }

    @Test
    void getX() {
        System.out.println("Test getX():");
        assertEquals(2, p2.getX());
    }

    @Test
    void getY() {
        System.out.println("Test getY():");
        assertEquals(3, p2.getY());
    }

    @Test
    void distance() {
        System.out.println("Test distance():");
        assertEquals(Math.sqrt(13), p2.distance());
    }

    @Test
    void testToString() {
        System.out.println("Test toString():");
        String expectedAnswer ="[x: 2.0, y: 3.0]";
        assertEquals(expectedAnswer, p2.toString());
    }

    @BeforeAll
    static void setUp(){
        System.out.println("Before starting test");
    }

    @BeforeEach
    void beforeEachTest() {
        System.out.println("Before each test");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("After each test");
    }

    @AfterAll
    static void clear() {
        System.out.println("At the end");
    }
}