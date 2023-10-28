package mao;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Set;

/**
 * Project name(项目名称)：JDK8_data_time_API
 * Package(包名): mao
 * Class(类名): Test11
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/28
 * Time(创建时间)： 19:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test11
{
    public static void main(String[] args)
    {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        Iterator<String> iterator = availableZoneIds.iterator();
        for (int i = 0; i < availableZoneIds.size(); i++)
        {
            if (i % 5 == 0 && i != 0)
            {
                System.out.println(iterator.next());
                continue;
            }
            System.out.print(iterator.next() + "\t");
        }
        ZonedDateTime bz = ZonedDateTime.now(Clock.systemUTC());
        System.out.println("bz = " + bz);
        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println("now1 = " + now1);
        ZonedDateTime now2 = ZonedDateTime.now(ZoneId.of("America/Atka"));
        System.out.println("now2 = " + now2);
    }
}
