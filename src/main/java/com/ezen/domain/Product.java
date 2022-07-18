package com.ezen.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
public class Product {

	@Id
	@GeneratedValue
	private Long	seq;
	private String	name;
	private int		price;
	private String	content;
	private boolean	use;
	@Temporal(TemporalType.TIMESTAMP)
	private Date	createDate;
}
