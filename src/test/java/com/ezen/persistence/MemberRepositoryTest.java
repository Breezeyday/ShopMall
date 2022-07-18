package com.ezen.persistence;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ezen.domain.Member;
import com.ezen.domain.Role;
import com.ezen.persitence.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

	@Autowired
	private MemberRepository memberRepo;
	
	@Test
	@Ignore
	public void initTest() {
		assertNotNull(memberRepo);
		
		Member member = new Member();
		member.setId("admin");
		member.setName("관리자");
		member.setPassword("admin123");
		member.setRole(Role.ROLE_ADMIN);
		member.setCreateDate(new Date());

		memberRepo.save(member);
	}
	
	@Test
	public void getMemberTest() {
		assertNotNull(memberRepo);
		
		Optional<Member> optionalMember = memberRepo.findById("admin");
		assertNotNull(optionalMember);
		
		Member member = optionalMember.get();
		assertEquals("관리자", member.getName());
		assertEquals(Role.ROLE_ADMIN, member.getRole());
	}
}
