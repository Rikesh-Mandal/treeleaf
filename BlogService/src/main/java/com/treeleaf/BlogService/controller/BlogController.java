package com.treeleaf.BlogService.controller;

import com.treeleaf.BlogService.model.Blog;
import com.treeleaf.BlogService.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @PostMapping("/addBlog")
    public Blog addBlog(@RequestBody Blog blog){
        return blogService.saveBlog(blog);
    }

    @GetMapping("/blogs")
    public List<Blog> findAllBlogs(){
        return blogService.getBlogs();
    }

    @GetMapping("/{id}")
    public Blog findBlogById(@PathVariable int id){
        return blogService.getBlogById(id);
    }

    @PutMapping("/update")
    public Blog updateBlog(@RequestBody Blog blog){
        return blogService.updateBlog(blog);
    }

    @DeleteMapping("/{id}")
    public String deleteBlog(@PathVariable int id){
        return blogService.deleteBlog(id);
    }


}
