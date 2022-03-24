package com.example.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.dto.BloggerInputDto;
import com.example.project.dto.BloggerOutputDto;
import com.example.project.entities.Blogger;
import com.example.project.exception.IdNotFoundException;
import com.example.project.service.IBloggerService;

@RestController
public class BloggerController {

	@Autowired
	IBloggerService blogServ;

	// Add new blogger
	@PostMapping("/bloggers")
	ResponseEntity<Blogger> addBlogger(@RequestBody Blogger blogger) {
		Blogger newBlog = blogServ.addBlogger(blogger);
		return new ResponseEntity<>(newBlog, HttpStatus.CREATED);

	}

	// Get all Bloggers
	@GetMapping("/bloggers")
	List<Blogger> viewAllBloggers() {
		return blogServ.viewAllBloggers();
	}

	// Add new blogger with dto
	@PostMapping("/bloggers/dto")
	ResponseEntity<BloggerOutputDto> addBloggerDto(@Valid @RequestBody BloggerInputDto blogger) {
		BloggerOutputDto newDtoBlog = blogServ.addBloggerDto(blogger);
		return new ResponseEntity<>(newDtoBlog, HttpStatus.CREATED);

	}

	// Update blogger
	@PutMapping("/blogger")
	ResponseEntity<Blogger> updateBlogger(@RequestBody Blogger blogger) throws IdNotFoundException {
		Blogger updatedBlog = blogServ.updateBlogger(blogger);
		return new ResponseEntity<>(updatedBlog, HttpStatus.CREATED);

	}

	// Delete Blog
	@DeleteMapping("/blogger")
	ResponseEntity<Blogger> deleteBlogger(@RequestBody Blogger blogger) throws IdNotFoundException {
		Blogger deletedBlog = blogServ.deleteBlogger(blogger);
		return new ResponseEntity<>(deletedBlog, HttpStatus.CREATED);

	}
	//Get Blogger by Id
	@GetMapping("/blogger/{id}")
	Blogger viewBlogger(@PathVariable("id") int bloggerId) throws IdNotFoundException {
		return blogServ.viewBlogger(bloggerId);

	}

}
