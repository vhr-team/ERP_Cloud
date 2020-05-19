package cc.mrbird.febs.server.warehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FebsServerWarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(FebsServerWarehouseApplication.class, args);
    }

}
