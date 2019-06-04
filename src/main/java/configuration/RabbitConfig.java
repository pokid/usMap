package configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig {
//    @Resource
//    private RabbitTemplate rbTemplate;

    @Bean
    public Queue helloQueue() {
        return new Queue("helloQueue");
    }

    @Bean
    public TopicExchange helloExchange() {
        return new TopicExchange("helloExchange");
    }

    @Bean
    public Binding bindingPaymentExchange(Queue helloQueue, TopicExchange helloExchange) {
        return BindingBuilder.bind(helloQueue).to(helloExchange).with("hello.#");
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);

        // 必须设置为 true，不然当 发送到交换器成功，但是没有匹配的队列，不会触发 ReturnCallback 回调
        // 而且 ReturnCallback 比 ConfirmCallback 先回调，意思就是 ReturnCallback 执行完了才会执行 ConfirmCallback
        rabbitTemplate.setMandatory(true);

        // 设置 ConfirmCallback 回调   yml需要配置 publisher-confirms: true
        rabbitTemplate.setConfirmCallback((correlationData, ack, cause) -> {
//            Console.log("ConfirmCallback , correlationData = {} , ack = {} , cause = {} ", correlationData, ack, cause);
            // 如果发送到交换器都没有成功（比如说删除了交换器），ack 返回值为 false
            // 如果发送到交换器成功，但是没有匹配的队列（比如说取消了绑定），ack 返回值为还是 true （这是一个坑，需要注意）
            if (ack) {
                String messageId = correlationData.getId();
                System.out.println("confirm:"+messageId);
//                RabbitMetaMessage rabbitMetaMessage = (RabbitMetaMessage) redisTemplate.opsForHash().get(RedisConfig.RETRY_KEY, messageId);
//                Console.log("rabbitMetaMessage = {}", rabbitMetaMessage);
//                if (!rabbitMetaMessage.isReturnCallback()) {
                    // 到这一步才能完全保证消息成功发送到了 rabbitmq
                    // 删除 redis 里面的消息
//                    redisTemplate.opsForHash().delete(RedisConfig.RETRY_KEY, messageId);
//                }
            }

        });

        // 设置 ReturnCallback 回调   yml需要配置 publisher-returns: true
        // 如果发送到交换器成功，但是没有匹配的队列，就会触发这个回调
        rabbitTemplate.setReturnCallback((message, replyCode, replyText,
                                          exchange, routingKey) -> {
//            Console.log("ReturnCallback unroutable messages, message = {} , replyCode = {} , replyText = {} , exchange = {} , routingKey = {} ", message, replyCode, replyText, exchange, routingKey);

            // 从 redis 取出消息，设置 returnCallback 设置为 true
            String messageId = message.getMessageProperties().getMessageId();
            System.out.println("return:"+messageId);
//            RabbitMetaMessage rabbitMetaMessage = (RabbitMetaMessage) redisTemplate.opsForHash().get(RedisConfig.RETRY_KEY, messageId);
//            rabbitMetaMessage.setReturnCallback(true);
//            redisTemplate.opsForHash().put(RedisConfig.RETRY_KEY, messageId, rabbitMetaMessage);
        });
        return rabbitTemplate;
    }
}
