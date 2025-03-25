package org.scgk.demo2;

import lombok.Data;

@Data
public class Citation implements Cloneable {

    private String name;

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show(){
        System.out.println(name+"同学，被评为三好学生...");
    }

}
