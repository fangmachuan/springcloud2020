import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;


@SpringBootTest
public class time {

    @Test
    public void time(){
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }

}
