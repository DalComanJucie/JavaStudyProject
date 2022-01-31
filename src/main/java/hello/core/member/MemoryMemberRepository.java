package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository  implements MemberRepository{

    //쓰레드에 동시성 이슈를 막아주는 ConcurrentHashMap 이 존재한다. 하지만 이건 예제이기 때문에 해당 부분은 고려하지 않는다.
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
