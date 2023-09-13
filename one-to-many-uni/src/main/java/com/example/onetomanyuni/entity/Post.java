package com.example.onetomanyuni.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="post_table")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="ptitle")
	private String title;
	@Column(name="pdescription")
	private String description;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pfid",referencedColumnName ="id")
	List<Comment> com=new ArrayList<>();
	public Post() {
		super();
	}
	public Post(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Comment> getCom() {
		return com;
	}
	public void setCom(List<Comment> com) {
		this.com = com;
	}
	
	

}
