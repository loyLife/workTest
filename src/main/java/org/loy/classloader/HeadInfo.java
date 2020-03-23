package org.loy.classloader;

/***
 * 获取堆内存信息
 */
public class HeadInfo {
    public static void main(String[] args) {
        System.out.println("最大堆内存：-Xmx" + Runtime.getRuntime().maxMemory() / 1024 /1024 +"M");
        System.out.println("总堆内存：-tmx" + Runtime.getRuntime().totalMemory() / 1024 /1024 +"M");
    }
}
