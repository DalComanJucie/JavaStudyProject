package hello.core;

import hello.JavaStudy.JavaStudyApplication;
import hello.JavaStudy.StandardJava.StandardJava;
import hello.core.member.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args)
    {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L,"memberA" ,Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = " + member.getName());
        System.out.println("find Member =" + findMember.getName());
        return;
    }
}
