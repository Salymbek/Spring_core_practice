package peaksoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

//        EmailService emailService = context.getBean("emailService", EmailService.class);
//        emailService.getMessage();
//
//        SMSService service = context.getBean("smsService", SMSService.class);
//        service.getMessage();
//

        MessagePrinter printer = context.getBean("printer",MessagePrinter.class);
        System.out.println(printer);


        context.close();









    }
}
