package com.example.project.service;

import java.util.List;

import com.example.project.dto.BloggerInputDto;
import com.example.project.dto.BloggerOutputDto;
import com.example.project.entities.Blogger;
import com.example.project.entities.Community;
import com.example.project.exception.IdNotFoundException;

public interface IBloggerService {
	public Blogger addBlogger(Blogger blogger);

	public Blogger updateBlogger(Blogger blogger) throws IdNotFoundException;

	public Blogger deleteBlogger(Blogger blogger) throws IdNotFoundException;

	public Blogger viewBlogger(int bloggerId) throws IdNotFoundException;

	public List<Blogger> viewAllBloggers();

	public List<Blogger> viewBloggerList(Community community);

	// public List<Customer> viewCustomerList(int theatreid);
	public BloggerOutputDto addBloggerDto(BloggerInputDto blogger);

}
