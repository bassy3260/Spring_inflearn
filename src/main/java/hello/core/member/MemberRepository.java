package hello.core.member;
//DAO
public interface MemberRepository {
    void save(Member member); //회원 등록
    Member findById(Long memberId); //회원 찾기
}
