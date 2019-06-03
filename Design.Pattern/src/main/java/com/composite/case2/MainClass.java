package com.composite.case2;

public class MainClass {

    public static void main(String[] args) {

        Element html = new HtmlParentElement("html");

        Element title = new HtmlElement("title", "This is welcome Page");
        Element header = new HtmlElement("header");

        html.appendChiled(title);
        html.appendChiled(header);

        Element body = new HtmlParentElement("body");
        Element h1 = new HtmlElement("h1", "Welcome");
        Element h2 = new HtmlElement("h2", "Amit");
        Element h3 = new HtmlElement("h3", "Singh");
        Element div = new HtmlParentElement("div");

        html.appendChiled(body);

        body.appendChiled(h1);
        body.appendChiled(h2);
        body.appendChiled(h3);
        body.appendChiled(div);

        Element li = new HtmlParentElement("li");
        div.appendChiled(li);
        Element ui1 = new HtmlElement("ui", "Home");
        Element ui2 = new HtmlElement("ui", "About");
        Element ui3 = new HtmlElement("ui", "Contact Me");
        li.appendChiled(ui1);
        li.appendChiled(ui2);
        li.appendChiled(ui3);
        System.out.println(html);

    }
}
