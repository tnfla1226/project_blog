package com.project.blog.Makeblog.service;

import com.project.blog.Makeblog.domain.Blog;
import com.project.blog.Makeblog.repository.BlogMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogMapper blogMapper;

    //게시물 목록 가져오기
    public List<Blog> getArticles() {
        List<Blog> articles = blogMapper.getArticles();

        //3분 이내 신규글 new마크 붙이기
        for (Blog article : articles) {
            //각 게시물들의 등록시간 읽어오기(밀리초)
            long regTime = article.getBoardDate().getTime();

            //현재시간 읽어오기(밀리초)
            long now = System.currentTimeMillis();

            if (now - regTime < 60 * 3 * 1000) {
                article.setNewFlag(true);
            }
        }

        return articles;
    }
}


