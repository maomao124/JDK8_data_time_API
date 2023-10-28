package mao;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * Project name(项目名称)：JDK8_data_time_API
 * Package(包名): mao
 * Class(类名): Test9
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/28
 * Time(创建时间)： 18:30
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test9
{
    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime localDateTime = now.plusMinutes(32);
        Duration duration = Duration.between(now, localDateTime);
        System.out.println("相差的天数:" + duration.toDays());
        System.out.println("相差的小时数:" + duration.toHours());
        System.out.println("相差的分钟数:" + duration.toMinutes());
        duration = Duration.between(localDateTime, now);
        System.out.println("相差的天数:" + duration.toDays());
        System.out.println("相差的小时数:" + duration.toHours());
        System.out.println("相差的分钟数:" + duration.toMinutes());
        duration = Duration.between(now, LocalDateTime.of(2034, 10, 16, 23, 11, 14));
        System.out.println("相差的天数:" + duration.toDays());
        System.out.println("相差的小时数:" + duration.toHours());
        System.out.println("相差的分钟数:" + duration.toMinutes());
        LocalDate nowDate = LocalDate.now();
        LocalDate date = LocalDate.of(1993, 2, 3);
        Period period = Period.between(date, nowDate);
        System.out.println("相差的年:" + period.getYears());
        System.out.println("相差的月:" + period.getMonths());
        System.out.println("相差的天:" + period.getDays());
    }
}
