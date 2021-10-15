package com.project.blog.Makeblog.repository;

import com.project.blog.Makeblog.domain.Blog;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BlogMapperTest {

    @Autowired
    BlogMapper blogMapper;

    @Test
    @DisplayName("10개의 게시물을 등록해야 한다.")
    void bulkInsert() {
        for (int i = 1; i <= 5; i++) {
            Blog blog = new Blog();
            blog.setBoardTitle("테스트 제목 " + i);
            blog.setBoardContent("테스트 내용 " + i);
            blog.setCategoryNo(i);
            blog.setBoardNo(i);

            blogMapper.insertArticle(blog);
        }
        System.out.println("게시물 등록 성공!");
    }

}