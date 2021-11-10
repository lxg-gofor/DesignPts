package com.heima.pattern.prototype.test2;

import java.io.*;

public class CitationTest1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Citation c1 = new Citation();
        Student stu1 = new Student("张三","北京");
        c1.setStu(stu1);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        //将c1对象写出到文件中
        oos.writeObject(c1);
        oos.close();

        //创建对象出入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        //读取对象
        Citation c2 = (Citation) ois.readObject();
        //从c2获取student对象
        Student stu2 = c2.getStu();
        stu2.setName("李四");
        ois.close();

        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu1和stu2是同一个对象？"+(stu1==stu2));

        c1.show();
        c2.show();
    }
}
