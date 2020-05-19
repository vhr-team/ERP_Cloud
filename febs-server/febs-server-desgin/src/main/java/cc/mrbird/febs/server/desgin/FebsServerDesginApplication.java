package cc.mrbird.febs.server.desgin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cc.mrbird.febs.server.desgin.mapper")
public class FebsServerDesginApplication {

    public static void main(String[] args) {
        SpringApplication.run(FebsServerDesginApplication.class, args);
    }

}
