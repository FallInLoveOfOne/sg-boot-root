package qjsh.sg.bootdao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BootDaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootDaoApplication.class, args);
    }

}
