package springdemo;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff {
    public void assist() {
        System.out.println("Nurses assist Doctors to operate on patience");
    }
}
