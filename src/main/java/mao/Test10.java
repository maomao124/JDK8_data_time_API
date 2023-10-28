package mao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/**
 * Project name(项目名称)：JDK8_data_time_API
 * Package(包名): mao
 * Class(类名): Test10
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/28
 * Time(创建时间)： 19:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test10
{
    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        TemporalAdjuster temporalAdjuster = new TemporalAdjuster()
        {
            @Override
            public Temporal adjustInto(Temporal temporal)
            {
                LocalDateTime dateTime = (LocalDateTime) temporal;
                LocalDateTime nextMonth = dateTime.plusMonths(1).withDayOfMonth(1);
                System.out.println("nextMonth = " + nextMonth);
                return nextMonth;
            }
        };
        LocalDateTime nextMonth = now.with(temporalAdjuster);
        System.out.println("nextMonth = " + nextMonth);
        nextMonth = LocalDateTime.of(2034, 10, 16, 23, 11, 14).with(temporalAdjuster);
        System.out.println("nextMonth = " + nextMonth);
    }
}
