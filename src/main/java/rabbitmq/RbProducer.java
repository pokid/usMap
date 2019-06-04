package rabbitmq;
import domain.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

@Component
public class RbProducer {

    //注意一定要使用RabbitTemplate！！
    //虽然RabbitTemplate实现了AmqpTemplate 但是AmqpTemplate里并没有能发送correlationData的方法
    @Resource
    private RabbitTemplate rbtemplate;

    public void send1(String msg){
        //CorrelationData
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        rbtemplate.convertAndSend("helloExchange", "hello.yj", msg,correlationData);
    }

    public void send2(User user){
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        rbtemplate.convertAndSend("helloExchange", "hello.yj", user,correlationData);
    }

}
