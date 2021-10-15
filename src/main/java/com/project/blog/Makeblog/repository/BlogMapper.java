package com.project.blog.Makeblog.repository;

import com.project.blog.Makeblog.domain.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlogMapper {

    //1. 게시물 목록 조회(페이지정보, 갯수정보 필요)
    // 매퍼 인터페이스는 웬만해서 하나를 넣어줘야한다. 두개는 골치아파진다.
    // => 하나를 포장해서 두개를 보내면 되겠다! => 도메인에서
    List<Blog> getArticles();


    //1-3. 검색 적용    (최종본. 1. 1-2 는 연습용)
    List<Blog> getSearchArticles();
    //총 겜시물 수 조회
    int getTotalCount();

    //2. 게시물 상세 조회
    Blog getContent(int serialNo);

    //3. 게시물 등록(게시물 등록 성공하면 트루)
    boolean insertArticle(Blog blog);

    //4. 게시물 삭제
    boolean deleteArticle(int serialNo);

    //5. 게시물 수정
    boolean modifyArticle(Blog blog);


    //6. 조회수 상승
    void upViewCount(int serialNo);
}



