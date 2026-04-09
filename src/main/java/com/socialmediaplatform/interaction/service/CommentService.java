package com.socialmediaplatform.interaction.service;

import com.socialmediaplatform.interaction.entity.Comment;
import com.socialmediaplatform.interaction.repository.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public List<Comment> getCommentsByPost(int postID) {
        return commentRepository.findByPostID(postID);
    }

    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(int commentID) {
        commentRepository.deleteById(commentID);
    }
}