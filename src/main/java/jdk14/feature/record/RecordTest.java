package jdk14.feature.record;

import org.junit.Test;

import java.util.HashSet;

/**
 * @author duqian
 * @date 2020/8/24 10:11
 **/
public class RecordTest {

    @Test
    public void test1() {
        Person p1 = new Person("罗密欧", new Person("zhuliye"));
        System.out.println(p1.toString());

        Person p2 = new Person("罗密欧", new Person("zhuliye"));
        System.out.println(p1.equals(p2));

        HashSet<Person> people = new HashSet<>();
        people.add(p1);
        people.add(p2);

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println(p1.name());
        System.out.println(p1.partner());
    }

    @Test
    public void test2() {
        Person p1 = new Person("zhangsan");
        System.out.println(p1.getNameUpperCase());

        Person.nation = "CHN";
        System.out.println(Person.getNation());
    }
}
