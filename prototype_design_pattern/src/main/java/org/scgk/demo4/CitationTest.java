package org.scgk.demo4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CitationTest {

    public static void main(String[] args) throws Exception {

        Citation citation = new Citation();
        Student stu = new Student();
        stu.setName("张三");
        citation.setStu(stu);

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/usr/local/code/scgk_code/design_pattern_demo/prototype_design_pattern/src/main/java/org/scgk/demo4/robin/a.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("prototype_design_pattern/src/main/java/org/scgk/demo4/robin/a.txt"));

        oos.writeObject(citation);

        oos.close();

//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/usr/local/code/scgk_code/design_pattern_demo/prototype_design_pattern/src/main/java/org/scgk/demo4/robin/a.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("prototype_design_pattern/src/main/java/org/scgk/demo4/robin/a.txt"));

        Citation citation1 = (Citation) ois.readObject();

        ois.close();
        Student stu1 = citation1.getStu();
        stu1.setName("李四");

        citation.show();
        citation1.show();


    }

}
