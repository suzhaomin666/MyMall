package pers.zhaominsu.mymall.coupon;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("pers.zhaominsu.mymall.coupon.dao")
@SpringBootApplication
public class MymallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymallCouponApplication.class, args);
    }

}
