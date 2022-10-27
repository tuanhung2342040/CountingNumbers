package point3D_ver1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {
    private Point3D p3;
    public Point3DTest(){
        p3 = new Point3D(2.5, 9.1, 4.0);
    }

    @Test
    void move() {
        System.out.println("Test move():");
        p3.move(10.5, 20.5, 30.5);
        assertEquals(10.5, p3.getX());
        assertEquals(20.5, p3.getY());
        assertEquals(30.5, p3.getZ());
    }

    @Test
    void getZ() {
        System.out.println("Test getZ():");
        assertEquals(4.0, p3.getZ());
    }

    @Test
    void distance() {
        System.out.println("Test distance():");
        assertEquals(10.2, p3.distance(), 0.05);
    }

    @Test
    void testToString() {
        System.out.println("Test toString():");
        String expectedAnswer ="[z: 4.0[x: 2.5, y: 9.1]]";
        assertEquals(expectedAnswer, p3.toString());
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