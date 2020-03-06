package bo.edu.uagrm.soe.facturacionsoe;

import bo.edu.uagrm.soe.facturacionsoe.config.ProductsConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FacturacionSoeApplication {
    public static void main(String[] args) {
        SpringApplication.run(FacturacionSoeApplication.class, args);
    }
}
