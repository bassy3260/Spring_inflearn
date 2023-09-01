package hello.core.member;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        //given 주어진게 이럴 때
        Member member = new Member(1L,"memberA", Grade.VIP);

        //when 이렇게 동작하면
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then 이렇게 결과가 나온다
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
