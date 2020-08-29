package jdk14.feature.instance;

import lombok.Builder;
import lombok.Data;
import org.junit.Test;

/**
 * @author duqian
 * @date 2020/8/24 09:13
 **/
public class InstanceOprator {

    @Test
    public void test1() {
        Object obj = new String("Hello,JDK14");
        //obj=null obj instanceof 永远为false
        obj = null;
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str.contains("JDK"));
        } else {
            System.out.println("非String类型");
        }

        if (obj instanceof String string) {
            System.out.println(string.contains("JDK"));
        } else {
            System.out.println("非String类型");
        }
    }

    @Test
    public void test2() {
        Object obj = "Hello, JDK14";
        if (obj instanceof String str) {
            System.out.println(str);
        } else {
            System.out.println("非String类型");
        }
    }

    @Test
    public void test3() {
        Object o = Monitor.builder().model("abc").price(123L).build();
        Monitor m = Monitor.builder().price(123L).model("abc").build();
        System.out.println(m.equals(o));
    }


    @Data
    @Builder
    static class Monitor {
        private String model;
        private double price;

        @Override
        public boolean equals(Object o) {
            return o instanceof Monitor other && model.equals(other.model) && price == other.price;
        }
    }
}
