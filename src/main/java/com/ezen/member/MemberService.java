package com.ezen.member;

import com.ezen.domain.Member;

public interface MemberService {

	Member getMember(Member member);

	void insertMember(Member member);

	void updateMember(Member member);

	void deleteMember(Member member);

}