package com.heima.pattern.singleton;

/**
 * 枚举方式实现单例
 * 枚举类型实现单例模式是极力推荐的实现模式。因为枚举是线程安全的，并且只会装载一次，设计者充分
 * 利用了枚举的这个特性来实现单例模式，枚举的写法非常简单，而且枚举类型是所用单例实现中唯一不会被
 * 破坏的单例实现模式。
 *
 * 枚举类型属于饿汉式方式，即预加载模式，在不考虑内存空间的情况下，使用枚举方式是比较好的一种方式
 */
public enum Singleton6 {
    INSTANCE;
}