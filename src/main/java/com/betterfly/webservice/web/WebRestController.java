package com.betterfly.webservice.web;

import com.betterfly.webservice.domain.posts.PostsRepository;
import com.betterfly.webservice.domain.posts.PostsSaveRequestDto;
import com.betterfly.webservice.service.PostsService;
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
    private PostsService postsService;

    @GetMapping(value = "/hello")
    public String hello(){

        return "hello my world";
    }

    @PostMapping(value = "/posts")
    public Long savePosts(
            @RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }

    @PostMapping(value = "/postsMan")
    public void savePostsMan(
            @RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }
}
