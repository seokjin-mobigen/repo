package myspring.di.xml;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloBeanJunitTest {

    @Before
    public void init() {
        System.out.println("Init");
    }

    @Test
    public void test2() {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        consolePrinter.print(" Spring");
    }

    @Test
    public void test1() {
        Hello hello = new Hello();

        hello.setName(" World");

        assertEquals("Hello World", hello.sayHello());

    }
}
