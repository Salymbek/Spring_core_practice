package peaksoft;

import org.springframework.stereotype.Component;

//@Component("smsService")
public class SMSService implements Service{
    public void getMessage() {
        System.out.println("SMS Service ...");
    }

    @Override
    public String toString() {
        return "SMSService{}";
    }
}
