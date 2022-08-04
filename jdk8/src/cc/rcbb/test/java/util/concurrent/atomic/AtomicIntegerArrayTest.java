package cc.rcbb.test.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * <p>
 * AtomicIntegerArrayTest
 * </p>
 *
 * @author rcbb.cc
 * @date 2021/9/14
 */
public class AtomicIntegerArrayTest {

    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(new int[]{0, 0});
        System.out.println(array);
        System.out.println(array.getAndAdd(1, 1));
        System.out.println(array);
    }

}
