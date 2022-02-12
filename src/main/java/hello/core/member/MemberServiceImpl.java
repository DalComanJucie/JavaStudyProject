package hello.core.member;

import hello.core.discount.DiscountPolicy;

//구현체가 하나일 경우 Impl 용어를 쓴다.
public class MemberServiceImpl implements MemberService {

    //MemberServiceImpl은 추상화에도 의존하고 구현체도 의존한다. MemberRepository , MemoryMemberRepository  모두 의존.
    //추상화에서만 의존한다. 구현은 제대로 모른다.
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public MemberServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
