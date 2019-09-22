package tech.bigtheta.springpersistencemybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.bigtheta.springpersistencemybatis.mapper.CityMapper;

@SpringBootApplication
public class SpringPersistenceMybatisApplication implements CommandLineRunner {


    private final CityMapper cityMapper;

    @Autowired
    public SpringPersistenceMybatisApplication(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringPersistenceMybatisApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.cityMapper.findByState("LA"));
    }
}
