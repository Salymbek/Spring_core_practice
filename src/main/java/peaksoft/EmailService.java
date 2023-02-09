package peaksoft;

import org.springframework.stereotype.Component;

//@Component("emailService")
public class EmailService implements Service{

    public void getMessage() {
        System.out.println("Email Service ...");
    }

    @Override
    public String toString() {
        return "EmailService{}";
    }
}
