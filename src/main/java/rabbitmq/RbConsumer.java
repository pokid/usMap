package rabbitmq;


import com.rabbitmq.client.Channel;
import domain.User;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RabbitListener(queues = "helloQueue")
public class RbConsumer {

    @RabbitHandler
    public void receive0(Message msg,  Channel channel) throws IOException {
        System.out.println("consumer receive message0: " + msg);
        channel.basicAck(msg.getMessageProperties().getDeliveryTag(), false);
    }

    @RabbitHandler
    public void receive1(String msg, @Header(AmqpHeaders.DELIVERY_TAG)long deliveryTag, Channel channel) throws IOException {
        System.out.println("consumer receive message1: " + msg);
        channel.basicAck(deliveryTag, false);
    }
    @RabbitHandler
    public void receive2(User user, @Header(AmqpHeaders.DELIVERY_TAG)long deliveryTag, Channel channel) throws IOException {
        System.out.println("consumer receive message2: "+user);
        //代表消费者确认收到当前消息，第二个参数表示一次是否 ack 多条消息
        //如果发生以下情况投递消息所有的通道或连接被突然关闭（包括消费者端丢失TCP连接、消费者应用程序（进程）挂掉、通道级别的协议异常）任何已经投递的消息但是没有被消费者端确认的消息会自动重新排队。
        //请注意，连接检测不可用客户端需要一段时间才会发现，所以会有一段时间内的所有消息会重新投递
        //因为消息的可能重新投递，所有必须保证消费者端的接口的幂等。

        //在RabbitMQ中影响吞吐量最大的参数是：消息确认模式和Qos预取值
        //自动消息确认模式或设置Qos预取值为无限虽然可以最大的提高消息的投递速度，但是在消费者端未及时处理的消息的数量也将增加，从而增加消费者RAM消耗，使用消费者端奔溃。所以以上两种情况需要谨慎使用。
        //RabbitMQ官方推荐Qos预取值设置在 100到300范围内的值通常提供最佳的吞吐量，并且不会有使消费者奔溃的问题

        channel.basicAck(deliveryTag, false);
        channel.basicQos(100);

        // 代表消费者拒绝一条或者多条消息，第二个参数表示一次是否拒绝多条消息，第三个参数表示是否把当前消息重新入队
        // channel.basicNack(deliveryTag, false, false);

        // 代表消费者拒绝当前消息，第二个参数表示是否把当前消息重新入队
        // channel.basicReject(deliveryTag,false);
    }
}
