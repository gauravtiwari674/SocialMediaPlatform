package com.socialmediaplatform.interaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialmediaplatform.interaction.entity.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findByPostID(int postID);
    List<Comment> findByUserID(int userID);
}