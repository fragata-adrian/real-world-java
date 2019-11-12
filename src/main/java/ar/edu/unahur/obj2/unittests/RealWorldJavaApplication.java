package ar.edu.unahur.obj2.unittests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*  -> Controller
    -> Service
    -> Repository
    -> Model
*/

@SpringBootApplication
@ComponentScan("ar.edu.unahur.obj2")
public class RealWorldJavaApplication {
    public static void main(String[] args) {
            SpringApplication.run(RealWorldJavaApplication.class, args);
        }
}
