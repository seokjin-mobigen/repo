package myspring.di.xml;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
;
public class HelloBeanJunitSpringTest {
    @Autowired
    Hello hello;

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
//        Hello hello = new Hello();

        hello.setName(" World");

        assertEquals("Hello World", hello.sayHello());

    }
}
