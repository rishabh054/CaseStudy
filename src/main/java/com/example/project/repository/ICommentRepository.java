package com.example.project.repository;

import java.util.List;

import com.example.project.entities.Comment;
import com.example.project.entities.Post;

public interface ICommentRepository {
	public Comment addComment(Comment comment);
	public void deleteComment(Comment comment);
	public List<Comment> listAllCommentsByPost(Post post);
	public void upVote(boolean upVote);
	
}
