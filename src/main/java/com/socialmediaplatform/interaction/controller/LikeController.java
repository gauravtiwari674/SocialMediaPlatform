package com.socialmediaplatform.interaction.controller;

import com.socialmediaplatform.interaction.entity.Like;
import com.socialmediaplatform.interaction.service.LikeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/likes")
public class LikeController {

    @Autowired
    private LikeService likeService;

    @GetMapping
    public List<Like> getAllLikes() {
        return likeService.getAllLikes();
    }

    @GetMapping("/post/{postID}")
    public List<Like> getLikesByPost(@PathVariable int postID) {
        return likeService.getLikesByPost(postID);
    }

    @PostMapping
    public Like addLike(@RequestBody Like like) {
        return likeService.addLike(like);
    }

    @DeleteMapping("/{likeID}")
    public String deleteLike(@PathVariable int likeID) {
        likeService.deleteLike(likeID);
        return "Like deleted successfully";
    }
}