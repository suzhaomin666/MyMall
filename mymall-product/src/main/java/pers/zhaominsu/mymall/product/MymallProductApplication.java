package pers.zhaominsu.mymall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// MapperScan 或者直接到mapper里面写 @Mapper
@MapperScan("com.yxj.gulimall.product.dao")
@SpringBootApplication
public class MymallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymallProductApplication.class, args);
    }

}
