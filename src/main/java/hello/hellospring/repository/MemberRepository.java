package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member sava(Member member);
    Optional<Member> findBy(Long id);
    Optional<Member> findBy(String name);
    List<Member> findAll();
}
