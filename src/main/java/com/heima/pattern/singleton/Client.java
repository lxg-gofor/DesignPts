package com.heima.pattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 测试类
 */
public class Client {
    public static void main(String[] args) throws Exception {
        /*Singleton1 s1 = Singleton1.getINSTANCE();
        Singleton1 s2 = Singleton1.getINSTANCE();
        System.out.println(s1==s2);*/

        /*Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance1 = Singleton5.getInstance();
        System.out.println(instance==instance1);*/


        /**
         * 使用序列化破坏单例模式
         */
        //写对象
        //writeObject2File();
        //读对象
        //readObjectFromFile();
        //readObjectFromFile();

        /**
         * 通过反射破坏单例模式
         */
        destroySingletonByReflect();//返回结果为false，说明单例模式被破坏了

    }

    /**
     * 通过反射来破坏单例模式
     */
    public static void destroySingletonByReflect() throws Exception {
        //获取Singleton的字节对象
        Class<Singleton5> clazz = Singleton5.class;
        //获取无参构造方法
        Constructor<Singleton5> constructor = clazz.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);
        //创建Singleton对象
        Singleton5 s1 = constructor.newInstance();
        Singleton5 s2 = constructor.newInstance();
        System.out.println("s1==s2? : "+(s1==s2));
    }

    /**
     * 向文件中写对象
     * @throws Exception
     */
    public static void writeObject2File() throws Exception{
        //获取Singleton对象
        Singleton4 instance = Singleton4.getInstance();
        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        //写对象
        oos.writeObject(instance);
        //释放资源
        oos.close();
    }

    public static void readObjectFromFile() throws Exception {
        //创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        //读取对象
        Singleton4 instance = (Singleton4) ois.readObject();

        System.out.println(instance);
        //释放资源
        ois.close();
    }

}

