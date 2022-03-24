package com.example.project.repository;

import java.util.List;

import com.example.project.entities.Blogger;
import com.example.project.entities.Community;

public interface ICommunityRepository {
	public Community addCommunity(Community community);
	public Community updateCommunity(Community community);
	public Community deleteCommunity(Community community);
	public List<Community> listAllCommunities(String searchString);
	public List<Community> listAllCommunitiesByBlogger(Blogger blogger);
}
