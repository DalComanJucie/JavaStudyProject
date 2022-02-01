package hello.core.member;

//구현체가 하나일 경우 Impl 용어를 쓴다.
public class MemberServiceImpl implements MemberService {

    //MemberServiceImpl은 추상화에도 의존하고 구현체도 의존한다. MemberRepository , MemoryMemberRepository  모두 의존.
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
