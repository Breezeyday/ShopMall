package com.ezen.persitence;

import org.springframework.data.repository.CrudRepository;

import com.ezen.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String> {

}
