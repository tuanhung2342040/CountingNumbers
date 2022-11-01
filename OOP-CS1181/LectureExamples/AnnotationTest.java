


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


class AnnotationTest {
    @Test
    public void test1(){
        System.out.println("Test1:");

    }

    @Test
    public void test2(){
        System.out.println("Test2:");
    }

    @BeforeAll
    static void setUp() {
        System.out.println("before starting test");
        
    }

    @BeforeEach
    void beforeEachTest() {
        System.out.println("before each test");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("after each test");
    }

    @AfterAll
    static void clear() {
        System.out.println("at the end");

    }
}

