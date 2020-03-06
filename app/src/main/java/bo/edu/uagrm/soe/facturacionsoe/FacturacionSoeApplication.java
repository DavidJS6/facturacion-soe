package bo.edu.uagrm.soe.facturacionsoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FacturacionSoeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FacturacionSoeApplication.class, args);
    }

}
