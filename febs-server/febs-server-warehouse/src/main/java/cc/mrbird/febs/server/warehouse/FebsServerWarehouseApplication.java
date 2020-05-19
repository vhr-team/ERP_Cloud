package cc.mrbird.febs.server.warehouse;

import cc.mrbird.febs.common.security.starter.annotation.EnableFebsCloudResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableFebsCloudResourceServer
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FebsServerWarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(FebsServerWarehouseApplication.class, args);
    }

}