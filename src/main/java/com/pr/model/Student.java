package com.pr.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	private Integer sno;
	private String name;
	private String[] sub;
	private Map<String,Integer> marks;
	private List<String> friends;
	private LocalDateTime dob;
	
}
