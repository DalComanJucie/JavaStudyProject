package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//생성자를 통해서 주입한다.
//의존관계 주입한다 Dependency Injection
//디자인 패턴중 생성 패턴이네... 설정파일 이라는거잖아 ... ㄷ -> // App Config 를 통해서 사용영역과 구성 영역을 나누어 버렸다.
//구성을 바꾸기 위해서  App config 만 바꾸자.
@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository(),discountPolicy());
    }

    //Memory에서 DB로 바꾸면 여기만 바꾸면됨.
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy()
    {
        //return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}

