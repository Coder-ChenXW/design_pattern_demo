package org.scgk.demo07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {

    public static void main(String[] args) throws Exception {

//        writeObject2File();

        readObjectFile();
        readObjectFile();

    }

    public static void readObjectFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton_design_pattern/src/main/java/org/scgk/demo07/a.txt"));

        Singleton instance = (Singleton) ois.readObject();

        System.out.println(instance);

        ois.close();

    }

    public static void writeObject2File() throws Exception{
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_design_pattern/src/main/java/org/scgk/demo07/a.txt"));
        oos.writeObject(instance);
        oos.close();
    }

}
