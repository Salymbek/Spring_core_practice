package peaksoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("messagePrinter")
@Scope
public class MessagePrinter {
    private Service service;
    @Value("${message}")
    private String message;


   // @Autowired
    public MessagePrinter(@Qualifier("smsService") Service service) {
        this.service = service;
    }




    @PostConstruct
    void initMethod(){
        System.out.println("Welcome !");
    }


    @PreDestroy
    void destroyMethod(){
        System.out.println("Good Bye !");
    }








/*-----------------------------------------------------------------------------------------*/










    public MessagePrinter() {
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessagePrinter(Service service, String message) {
        this.service = service;
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessagePrinter{" +
                "service=" + service +
                ", message='" + message + '\'' +
                '}';
    }
}
