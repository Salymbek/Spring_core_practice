package peaksoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("peaksoft")
@PropertySource("classpath:application.properties")
public class Config {

    @Bean
    public EmailService emailService(){
        return new EmailService();
    }

    @Bean
    public SMSService service(){
        return new SMSService();
    }

    @Bean
    public MessagePrinter printer(){
        return new MessagePrinter(new SMSService());
    }

}
