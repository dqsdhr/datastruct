package jdk14.feature.switchfeature;

import org.junit.Test;

import java.time.DayOfWeek;

/**
 * @author duqian
 * @date 2020/8/24 13:43
 **/
public class SwitchTest {
    @Test
    public void jdk12() {
        DayOfWeek friday = DayOfWeek.FRIDAY;
        switch (friday) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
                System.out.println(1);
                break;
            case THURSDAY:
                System.out.println(2);
                break;
            case FRIDAY:
                System.out.println(3);
                break;
            case SATURDAY:
                System.out.println(4);
                break;
            case SUNDAY:
                System.out.println(5);
                break;
            default:
                throw new IllegalStateException("What day is today?" + friday);
        }
    }
}
