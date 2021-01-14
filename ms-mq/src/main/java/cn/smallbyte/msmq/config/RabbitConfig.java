package cn.smallbyte.msmq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

@Configuration
public class RabbitConfig {
    @Bean
    public Queue Queue() {
        return new Queue("ms-mq");
    }
}
