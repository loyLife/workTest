package org.loy.classloader;

import java.util.Calendar;

/***
 * 获取classloader信息测试类
 */
public class ClassLoaderInfo {
    public static void main(String[] args) {
        // 当前加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        System.out.println("父加载器：" + classLoader.getParent());
        System.out.println("根加载器：" + classLoader.getParent().getParent());
    }
}
