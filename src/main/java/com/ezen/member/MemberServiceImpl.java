package com.ezen.member;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.domain.Member;
import com.ezen.persitence.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepo;
	
	@Override
	public Member getMember(Member member) {
		
		Optional<Member> optionalMember = memberRepo.findById(member.getId());
		
		if (optionalMember.isPresent())
			return optionalMember.get();
		
		return null;
	}
	
	@Override
	public void insertMember(Member member) {
		memberRepo.save(member);
	}
	
	@Override
	public void updateMember(Member member) {
		
		Optional<Member> optionalMember = memberRepo.findById(member.getId());
		
		Member update;
		
		if (optionalMember.isPresent()) {
			update = optionalMember.get();
			
			update.setName(member.getName());
			
			memberRepo.save(update);
		}
	}
	
	@Override
	public void deleteMember(Member member) {
		memberRepo.deleteById(member.getId());
	}
}
