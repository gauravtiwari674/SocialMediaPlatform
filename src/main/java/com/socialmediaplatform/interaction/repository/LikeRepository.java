package com.socialmediaplatform.interaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialmediaplatform.interaction.entity.Like;

import java.util.List;

public interface LikeRepository extends JpaRepository<Like, Integer> {
    List<Like> findByPostID(int postID);
    List<Like> findByUserID(int userID);
}