package org.scgk.demo08;

public class Singleton {

    private static boolean flag = false;

    private Singleton(){
        synchronized (Singleton.class){
            if (flag=true){
                throw new RuntimeException("不能创建多个对象...");
            }
            flag=true;
        }
    }

    private static class SingletonHolder{
        private static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
