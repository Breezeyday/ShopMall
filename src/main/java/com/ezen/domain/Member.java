package com.ezen.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Member {

	@Id
	private String	id;
	private String	name;
	private String	password;
	private Role	role;
	@Temporal(TemporalType.TIMESTAMP)
	private Date	createDate;
}
