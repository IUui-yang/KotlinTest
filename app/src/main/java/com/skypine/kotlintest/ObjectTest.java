package com.skypine.kotlintest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * &lt;一句话功能简述&gt;
 * &lt;功能详细描述&gt;
 *
 * @author 25497
 * @version [版本号]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class ObjectTest {
    public static void main(String[] args) {
        Singleton.singletonTestExt();
        Singleton.INSTANCE.singletonTest();
        int i1 = Singleton.iExt;
        Singleton.INSTANCE.setI(1);
        int i = Singleton.INSTANCE.getI();

        List<Integer> integers = new ArrayList<>();
        integers.forEach(i2 -> i2++);
        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.forEach((i3, i4) -> System.out.println("i3-->" + i3 + ", i4--> " + i4));
       new  Thread(() -> System.out.println("Thread is runing")).start();
    }
}