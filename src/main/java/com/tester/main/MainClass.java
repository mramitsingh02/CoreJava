package com.tester.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MainClass {
    public static void add(String[] args) {
        System.out.println("Hello");
        Document d = Jsoup.parse("<a href='http://www.example.com'>Example</a>");
        String s = d.getElementsByTag("a")
                .first()
                .attr("href");
        System.out.println(s);

    }
}