package com.example.onetomanyuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetomanyuni.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
