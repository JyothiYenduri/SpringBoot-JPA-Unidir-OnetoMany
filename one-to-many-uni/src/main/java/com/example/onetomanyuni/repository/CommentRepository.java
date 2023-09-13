package com.example.onetomanyuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetomanyuni.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
