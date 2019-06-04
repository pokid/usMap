import boot.TestBoot;
import domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import rabbitmq.RbConsumer;
import rabbitmq.RbProducer;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestBoot.class)
public class TestRabbit {
    @Resource
    private RbProducer producer;
    @Test
    public void send1() {
        producer.send1("hello,im a string");
    }
    @Test
    public void send2() {
        User user = new User();
        user.setNickname("hello,im a object");
        producer.send2(user);
    }

}
