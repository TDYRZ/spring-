package com.wisely.highlight_springmvc4.domain;

import lombok.Data;

@Data
public class DemoObj {
	private Long id;
	private String name;
	 
	public DemoObj(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	 
	
	

}
