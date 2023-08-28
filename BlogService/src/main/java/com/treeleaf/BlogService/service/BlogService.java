package com.treeleaf.BlogService.service;

import com.treeleaf.BlogService.model.Blog;
import com.treeleaf.BlogService.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;

    //query to Post a blog
    public Blog saveBlog(Blog blog){
        return blogRepository.save(blog);
    }

    //query to get all blogs
    public List<Blog> getBlogs(){
        return blogRepository.findAll();
    }

    //query to get blog by id
    public Blog getBlogById(int id){
        return blogRepository.findById(id).orElseThrow();
    }

    //query to delete blog by id
    public String deleteBlog(int id){
        blogRepository.deleteById(id);
        return "Blog Deleted. Id: " +  String.valueOf(id);

    }

    //query to update an existing blog
    public Blog updateBlog(Blog blog){
        Blog existingBlog = blogRepository.findById(blog.getId()).orElseThrow();
        existingBlog.setTitle(blog.getTitle());
        existingBlog.setContent(blog.getContent());
        return blogRepository.save(existingBlog);
    }

}
