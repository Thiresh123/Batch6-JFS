package com.springfirst.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Services 
{
	private List<Topic> topics = Arryas.as List(
			
			new Topic("spring","springvframework", "spring description"),
			new Topic("java" , "core java" , "java description")
									);
	
	public List<Topics> getalltopics()
	{
		return topics;
	}
			
	

}
