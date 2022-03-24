package com.example.project.service;

import java.util.List;

import com.example.project.entities.Blogger;
import com.example.project.entities.Community;

public interface ICommunityService {
	public Community addCommunity(Community community);
	public Community updateCommunity(Community community);
	public Community deleteCommunity(Community community);
	public List<Community> listAllCommunities(String searchString);
	public List<Community> listAllCommunitiesByBlogger(Blogger blogger);
}
