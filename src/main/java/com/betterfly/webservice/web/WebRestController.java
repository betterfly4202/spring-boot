package com.betterfly.webservice.web;

import com.betterfly.webservice.domain.posts.PostsRepository;
import com.betterfly.webservice.domain.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * Created by betterFLY on 2018. 1. 27.
 * Github : http://github.com/betterfly88
 */

@RestController
@AllArgsConstructor
public class WebRestController {
    private PostsRepository postsRepository;

    @GetMapping(value = "/hello")
    public String hello(){

        return "hello my world";
    }

    @PostMapping(value = "/posts")
    public void savePosts(
            @RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }

    @PostMapping(value = "/postsMan")
    public void savePostsMan(
            @RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }
}
