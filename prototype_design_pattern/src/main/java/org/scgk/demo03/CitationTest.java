package org.scgk.demo03;

public class CitationTest {

    public static void main(String[] args) throws Exception {

        Citation citation = new Citation();
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);

        Citation citation1 = citation.clone();
        Student stu1 = citation1.getStu();
        stu1.setName("李四");


        citation.show();
        citation1.show();

    }

}
