package cc.rcbb.test.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReference;

/**
 * <p>
 * AtomicReferenceTest
 * </p>
 *
 * @author rcbb.cc
 * @date 2021/9/14
 */
class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

public class AtomicReferenceTest {
    public static void main(String[] args) {
        Person p1 = new Person(18);
        Person p2 = new Person(28);

        AtomicReference ar = new AtomicReference<>(p1);
        ar.compareAndSet(p1, p2);
        Person p3 = (Person) ar.get();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("p2 == p3 :" + (p2 == p3));
    }
}
