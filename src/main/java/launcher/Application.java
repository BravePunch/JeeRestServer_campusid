package launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(
        exclude = // Configuration Hibernate dans hibernate.cfg.xml
                {
                        DataSourceAutoConfiguration.class,
                        HibernateJpaAutoConfiguration.class
                } ,
        scanBasePackages = "controllers")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}