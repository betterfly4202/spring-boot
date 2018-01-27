package com.betterfly.webservice.service;

import com.betterfly.webservice.domain.posts.Posts;
import com.betterfly.webservice.domain.posts.PostsRepository;
import com.betterfly.webservice.domain.posts.PostsSaveRequestDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by betterFLY on 2018. 1. 27.
 * Github : http://github.com/betterfly88
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsServiceTest {

    @Autowired
    private PostsRepository postsRepository;

    @Autowired
    private PostsService postsService;

    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void Dto데이터가_Posts테이블에_저장(){
        //given
        PostsSaveRequestDto dto = PostsSaveRequestDto.builder()
                .title("DTO데이터를 테이블에 넣기")
                .author("betterFLY")
                .content("스프링부트는 재미있고 신기하다")
                .build();

        //When
        postsService.save(dto);

        //then
        Posts posts =postsRepository.findAll().get(0);
        assertThat(posts.getTitle()).isEqualTo(dto.getTitle());
        assertThat(posts.getContent()).isEqualTo(dto.getContent());
        assertThat(posts.getAuthor()).isEqualTo(dto.getAuthor());
    }
}
