package com.composite.case3;


public class MainClass {

    public static void main(String[] args) {

        Element html = new HtmlParentElement("html");

        Element title = new HtmlElement(html,"title", "This is welcome Page");
        Element header = new HtmlElement(html,"header");

        Element body = new HtmlParentElement(html, "body");
        Element h1 = new HtmlElement(body,"h1", "Welcome");
        Element h2 = new HtmlElement(body,"h2", "Amit");
        Element h3 = new HtmlElement(body,"h3", "Singh");
        Element div = new HtmlParentElement(body,"div");

        Element li = new HtmlParentElement(div,"li");
        Element ui1 = new HtmlElement(li, "ui", "Home");
        Element ui2 = new HtmlElement(li,"ui", "About");
        Element ui3 = new HtmlElement(li,"ui", "Contact Me");
        System.out.println(html);

    }
}
