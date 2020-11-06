package myspring.di.xml;

import java.awt.*;
import java.net.Socket;

public class Hello {
    private String name;
    private Printer printer;

    public Hello() { }

    public Hello(String name, Printer printer) {
        this.name = name;
        this.printer = printer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public String sayHello() {
        return "Hello" + name;
    }

    public void print() {
        this.printer.print(sayHello());
    }
}
