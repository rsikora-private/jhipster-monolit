package pl.sikorasoftware.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by robertsikora on 28.08.2016.
 */

@Configuration
@AutoConfigureAfter(DatabaseConfiguration.class)

public class MyConfig {

    public interface IConfig {}

    private class A implements IConfig {}

    @Bean
    public IConfig myObject(){
        return new A();
    }

    @Bean
    public String test(DataSource dataSource){
        return new String("dd");
    }
}
