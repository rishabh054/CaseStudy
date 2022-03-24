package com.example.project.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.project.dto.BloggerInputDto;
import com.example.project.dto.BloggerOutputDto;
import com.example.project.entities.Blogger;
import com.example.project.exception.IdNotFoundException;
import com.example.project.repository.IBloggerRepository;
import org.mockito.BDDMockito;
import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
class BloggerServiceMockitoTest {
	
	@InjectMocks
	BloggerServiceImpl blogSer;
	
	@MockBean
	IBloggerRepository blogRepo;
	
	@BeforeEach
	void init() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void addBloggerDtoTest() {
		BloggerInputDto bloggerInput = new BloggerInputDto("Mockadd",4);
		
		Blogger blogger = new Blogger();
		blogger.setBloggerName(bloggerInput.getBloggerName());
		blogger.setKarma(bloggerInput.getKarma());
		
		Mockito.when(blogRepo.save(blogger)).thenReturn(blogger);
		
		BloggerOutputDto blogOutput=blogSer.addBloggerDto(bloggerInput);
		assertEquals("Mockadd",blogOutput.getBloggerName());
		assertEquals(4,blogOutput.getKarma());
		
	}
	
	
	@Test
	void viewBloggerTest() throws IdNotFoundException {
		Blogger blogger = new Blogger(37, "Rish", 3);
		Mockito.when(blogRepo.findById(37)).thenReturn(Optional.of(blogger));
		Blogger blg = blogSer.viewBlogger(37);
		assertEquals(37, blg.getUserId());
		assertEquals("Rish", blg.getBloggerName());
		assertEquals(3, blg.getKarma());
		
	}
	
	@Test
    public void viewAllBloggers() {
        List<Blogger> bloggers = new ArrayList();
        bloggers.add(new Blogger());

        BDDMockito.given(blogRepo.findAll()).willReturn(bloggers);

        List<Blogger> expected = blogSer.viewAllBloggers();

        assertEquals(expected, bloggers);
        verify(blogRepo).findAll();
    }

	

}
