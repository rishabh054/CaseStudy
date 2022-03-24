package com.example.project.service;

import java.util.List;

import com.example.project.entities.Blogger;
import com.example.project.entities.Post;

public interface IPostService {
	public Post addPost(Post post);
	public Post updatePost(Post post);
	public Post deletePost(int id);
	public List<Post> getPostBySearchString(String searchStr);
	public List<Post> getPostByBlogger(Blogger blogger);
	public void upVote(boolean upVote);
	
	
}
