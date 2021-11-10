package com.heima.pattern.prototype.demo;

public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("具体的原型对象创建完成！");
    }

    /**
     * 重写超级父类Object提供的clone()方法，实现浅克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
