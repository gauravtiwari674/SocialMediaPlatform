package com.socialmediaplatform.interaction.service;

import com.socialmediaplatform.interaction.entity.Like;
import com.socialmediaplatform.interaction.repository.LikeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    public List<Like> getAllLikes() {
        return likeRepository.findAll();
    }

    public List<Like> getLikesByPost(int postID) {
        return likeRepository.findByPostID(postID);
    }

    public Like addLike(Like like) {
        return likeRepository.save(like);
    }

    public void deleteLike(int likeID) {
        likeRepository.deleteById(likeID);
    }
}