package com.socialmediaplatform.interaction.controller;

import com.socialmediaplatform.interaction.entity.Comment;
import com.socialmediaplatform.interaction.service.CommentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @GetMapping("/post/{postID}")
    public List<Comment> getCommentsByPost(@PathVariable int postID) {
        return commentService.getCommentsByPost(postID);
    }

    @PostMapping
    public Comment addComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }

    @DeleteMapping("/{commentID}")
    public String deleteComment(@PathVariable int commentID) {
        commentService.deleteComment(commentID);
        return "Comment deleted successfully";
    }
}