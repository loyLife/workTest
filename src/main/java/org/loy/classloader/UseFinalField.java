package org.loy.classloader;

/***
 * 调用final修饰的类静态变量不会初始化静态块
 */

class FinalFieldClass {
    public static final String LOY_LIFE = "LOY LIFE";

    static {
        System.out.println("FinalFieldClass init");
    }
}
public class UseFinalField {
    public static void main(String[] args) {
        System.out.println(FinalFieldClass.LOY_LIFE);
    }
}
