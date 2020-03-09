package day12;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Demo {
    public static void main(String[] args) throws IOException {
        String path= Demo.class.getClassLoader().getResource("student.xml").getPath();
        Document document= Jsoup.parse(new File(path),"utf-8");
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements);
        System.out.println("-----------");
        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);
        System.out.println("-----------");




//        Elements elements = document.getElementsByTag("name");
//        System.out.println(elements.size());
//
//        Element element = elements.get(0);
//        System.out.println(element.text());
//        URL url = new URL("https://www.bilibili.com/");//代表网络中的一个资源路径
//        Document document = Jsoup.parse(url, 10000);
//        System.out.println(document);


    }
}
