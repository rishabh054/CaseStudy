package com.example.project.service;

import java.util.List;

import com.example.project.entities.Comment;
import com.example.project.entities.Post;

public interface ICommentService {
	public Comment addComment(Comment comment);
	public void deleteComment(Comment comment);
	public List<Comment> listAllCommentsByPost(Post post);
	public void upVote(boolean upVote);
	
}
