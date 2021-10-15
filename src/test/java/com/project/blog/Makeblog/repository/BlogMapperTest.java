package com.project.blog.Makeblog.repository;

import com.project.blog.Makeblog.domain.Blog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

    @Test
    @DisplayName("게시글을 수정")
    void modify() {
        Blog blog = new Blog();
        blog.setSerialNo(11);
        blog.setBoardNo(1);
        blog.setCategoryNo(2);
        blog.setBoardContent("121241241243");
        blog.setBoardTitle("123");
        blogMapper.modifyArticle(blog);
    }

    @Test
    @DisplayName("게시글 삭제")
    void delete() {
        blogMapper.deleteArticle(3);
    }

    @Test
    @DisplayName("게시글 상세 조회")
    void info() {
        blogMapper.getContent(3);
    }

    @Test
    @DisplayName("전체 게시물을 글번호 내림차순으로 조회해야 한다.")
    void selectAll() {
        List<Blog> articles = blogMapper.getSearchArticles();

        for (Blog article : articles) {
            System.out.println(article);
        }
        Assertions.assertTrue(articles.size() == 8);
    }
}