package Blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MyFirstBlog {
    public static void main(String[] args){
        SpringApplication.run(MyFirstBlog.class,args);
    }
}