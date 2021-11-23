package com.pro.coloso.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlayLists {

	@Id
	private Long id;
	
	@Column(name = "LECTURE_NAME") 
	private String lectureName;
	
	
}
