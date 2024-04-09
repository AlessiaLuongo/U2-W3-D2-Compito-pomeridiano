package alessia.U2W3D2Compitopomeridiano.controllers;

import alessia.U2W3D2Compitopomeridiano.entities.BlogPost;
import alessia.U2W3D2Compitopomeridiano.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog-posts")
public class BlogPostController {

    @Autowired
    BlogPostService blogPostService;

    @GetMapping
    private List<BlogPost> getAllBlogPosts(){
        return this.blogPostService.getBlogPostList();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    private BlogPost saveBlogPost(@RequestBody BlogPost body){
        return this.blogPostService.saveBlogPost(body);
    }

    @PutMapping("/put-blog-post")
    public String putBlogPost(){
        return "PUT";
    }
    @DeleteMapping("/put-blog-post")
    public String deleteBlogPost(){
        return "DELETE";
    }

}
