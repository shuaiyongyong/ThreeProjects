package com.yc.mybatis.mapper;

import java.util.Arrays;
import java.util.List;

public class test {
	
	public static void main(String[] args) {
		String tags = "a,b";
		String[] str= tags.split(",");
	    List  list = Arrays.asList(str);
	    for (Object t_name : list) {
	    	System.out.println(t_name);
	    }
	}
}
