package myspring.di.xml;

public class HelloBeanTest {

    public static void main(String[] args) {
        Hello hello = new Hello();

        hello.setName(" World");

        System.out.println(hello.sayHello());
    }
}
