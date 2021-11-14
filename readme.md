# 设计模式

## [六大设计原则](https://blog.csdn.net/qq_40493944/article/details/120525226)
### 单一职责原则 
### 里氏替换原则  
### 依赖倒置原则 
### 接口隔离原则
### 迪米特法则 
### 开闭原则 

## 32种设计模式

### 创建型模式
>这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。
>这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。

#### [单例设计模式](https://blog.csdn.net/qq_40493944/article/details/121068286)
#### [工厂模式](https://blog.csdn.net/qq_40493944/article/details/121069454)
#### [原型模式](https://blog.csdn.net/qq_40493944/article/details/121071659)
#### [建造者模式](https://blog.csdn.net/qq_40493944/article/details/121072593)


### 结构型模式
> 结构型模式描述如何将类或对象按某种布局组成更大的结构。它分为类结构型模式和对象结构
>型模式，前者采用继承机制来组织接口和类，后者釆用组合或聚合来组合对象。
>由于组合关系或聚合关系比继承关系耦合度低，满足“合成复用原则”，所以对象结构型模式比类结构
>型模式具有更大的灵活性。
结构型模式分为以下 7 种：
#### [代理模式](https://blog.csdn.net/qq_40493944/article/details/121072847)
#### [适配器模式](https://blog.csdn.net/qq_40493944/article/details/121112151)
#### [装饰者模式](https://blog.csdn.net/qq_40493944/article/details/121131358)
#### [桥接模式](https://blog.csdn.net/qq_40493944/article/details/121185867)
#### [外观模式](https://blog.csdn.net/qq_40493944/article/details/121186215)
#### [组合模式](https://blog.csdn.net/qq_40493944/article/details/121186398)
#### [享元模式](https://blog.csdn.net/qq_40493944/article/details/121133087)

### 行为型模式
> 行为型模式用于描述程序在运行时复杂的流程控制，即描述多个类或对象之间怎样相互协作共同完成单个对象都无法单独完成的任务，它涉及算法与对象间职责的分配。
>行为型模式分为类行为模式和对象行为模式，前者采用继承机制来在类间分派行为，后者采用组合或聚合在对象间分配行为。由于组合关系或聚合关系比继承关系耦合度低，满足“合成复用原则”，所以对象行为模式比类行为模式具有更大的灵活性。
>行为型模式分为：
#### [模板方法模式](https://blog.csdn.net/qq_40493944/article/details/121316331)
#### [策略模式](https://blog.csdn.net/qq_40493944/article/details/121316604)
#### [命令模式](https://blog.csdn.net/qq_40493944/article/details/121317397)
#### [责任链模式](https://blog.csdn.net/qq_40493944/article/details/121317764)
#### [状态模式](https://blog.csdn.net/qq_40493944/article/details/121319523)
#### [观察者模式](https://blog.csdn.net/qq_40493944/article/details/121319663)
#### [中介者模式](https://blog.csdn.net/qq_40493944/article/details/121319796)
#### [迭代器模式](https://blog.csdn.net/qq_40493944/article/details/121325475)
#### [访问者模式](https://blog.csdn.net/qq_40493944/article/details/121325605)
#### [备忘录模式](https://blog.csdn.net/qq_40493944/article/details/121325766)