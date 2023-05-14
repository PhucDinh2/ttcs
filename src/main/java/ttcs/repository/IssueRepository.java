package ttcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ttcs.model.Issue;
import ttcs.model.Member;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long> {
	public List<Issue> findByReturned(Integer returned);
	public Long countByMemberAndReturned(Member member, Integer returned);
}
