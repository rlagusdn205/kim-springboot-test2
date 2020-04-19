package com.test.kim.springboot;
import org.springframework.boot.SpringApplicaton;
import org.springframework.boot.autocofigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링 부트의 자동설정, 스프링 Bean읽기,생성을 모두 자동으로 설정하게 된다.
//@springBootApplication이 있는 위치부터 설정을 읽어가기 때문에 항상 프로젝트의 최상단에 위치해야 한다.
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);//내장 was(web application service)를 실행한다.
        //내장 was란 별도로 외부에 was를 두지 않고 애플리ㅔ이션을 실행할때 내부에서 was를 실행하는 것을 이야기 한다.

    }
}
