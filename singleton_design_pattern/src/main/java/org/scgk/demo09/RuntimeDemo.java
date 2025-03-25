package org.scgk.demo09;

import java.io.InputStream;

public class RuntimeDemo {

    public static void main(String[] args) throws Exception {

        Runtime runtime = Runtime.getRuntime();

        Process process = runtime.exec("ls");
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024*1024*100];
        int len = is.read(arr);
        System.out.println(new String(arr,0,len,"gbk"));

    }

}
