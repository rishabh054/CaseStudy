package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entities.Blogger;
import com.example.project.entities.Community;
import com.example.project.exception.IdNotFoundException;

@Repository
public interface IBloggerRepository extends JpaRepository<Blogger, Integer> {
//	public Blogger addBlogger(Blogger blogger);
//	public Blogger updateBlogger(Blogger blogger) throws IdNotFoundException;
//	public Blogger deleteBlogger(Blogger blogger) throws IdNotFoundException;
//	public Blogger viewBlogger(int bloggerId) throws IdNotFoundException;
//	public List<Blogger> viewAllBloggers();
//	public List<Blogger> viewBloggerList(Community community);
	// public List<Customer> viewCustomerList(int theatreid);

}
