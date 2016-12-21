package com.yc.mybatis.entity;

public class Tag {

	private Integer t_id;
	private String t_name;
	private String t_count;

	public Tag() {
		// TODO Auto-generated constructor stub
	}

	public Tag(String t_name, String t_count) {
		super();
		this.t_name = t_name;
		this.t_count = t_count;
	}

	public Integer getT_id() {
		return t_id;
	}

	public void setT_id(Integer t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_count() {
		return t_count;
	}

	public void setT_count(String t_count) {
		this.t_count = t_count;
	}

	@Override
	public String toString() {
		return "Tag [t_id=" + t_id + ", t_name=" + t_name + ", t_count=" + t_count + "]";
	}
	
	
}
