package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    //구체적인 클래스에 대해서 모른다. 추상 객체만 알고 있다.
    //현재 orderServiceImpl이 해당 정책을 선택하고 구현까지 맡아버린다.
    //역활과 구현을 분리 해야 한다.
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);                //조회.
        int discountPrice = discountPolicy.discount(member, itemPrice);     //할인 정책을 넘김.
        return new Order(memberId,itemName,itemPrice, discountPrice);
    }


}

//AppConfig 구현객체를 설정하고 연결하는 녀석.