package org.scgk.demo2;

public class CitationTest {

    public static void main(String[] args) throws Exception {

        Citation citation = new Citation();
        Citation citation1 = citation.clone();

        citation.setName("张三");
        citation1.setName("李四");

        citation.show();
        citation1.show();

    }

}
