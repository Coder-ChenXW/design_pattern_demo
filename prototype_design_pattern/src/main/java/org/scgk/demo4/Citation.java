package org.scgk.demo4;

import lombok.Data;

import java.io.Serializable;

@Data
public class Citation implements Cloneable, Serializable {

    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show(){
        System.out.println(stu.getName()+"同学，被评为三好学生...");
    }

}
