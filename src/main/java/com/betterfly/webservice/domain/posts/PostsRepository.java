package com.betterfly.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by betterFLY on 2018. 1. 27.
 * Github : http://github.com/betterfly88
 */


/*
     myBatis에서 쓰던 Dao 객에 역할
     JpaRepository<Entity클래스, PK타입>를 상속하면 기본적인 CRUD 메소드가 자동생성
 */
@Repository
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
