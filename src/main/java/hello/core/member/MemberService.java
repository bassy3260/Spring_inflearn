package hello.core.member;

//회원가입, 조회
public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
