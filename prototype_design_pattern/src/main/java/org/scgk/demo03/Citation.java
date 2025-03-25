package org.scgk.demo03;

import lombok.Data;

@Data
public class Citation implements Cloneable {

    private Student stu;

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show(){
        System.out.println(stu.getName()+"同学，被评为三好学生...");
    }

}
