package com.project.blog.Makeblog.controller;


import com.project.blog.Makeblog.domain.Blog;
import com.project.blog.Makeblog.service.BlogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/board")
public class BlogController {

    private final BlogService blogService;


    @GetMapping("/movie-list")
    public String movieList(Model model) {
        log.info("/board/movie-list GET 요청 발생");
//        List<Blog> articles = blogService.getArticles();
//        model.addAttribute("articles", articles);

        return "board/movie";
    }

    @GetMapping("/restaurant-list")
    public String restaurantList(Model model) {
        log.info("/board/restaurant-list GET 요청 발생");
//        List<Blog> articles = blogService.getArticles();
//        model.addAttribute("articles", articles);

        return "board/movie";
    }

    @GetMapping("/daily-list")
    public String dailyList(Model model) {
        log.info("/board/daily-list GET 요청 발생");
//        List<Blog> articles = blogService.getArticles();
//        model.addAttribute("articles", articles);

        return "board/movie";
    }

    @GetMapping("/guest-book")
    public String list(Model model) {
        log.info("/board/guest-book GET 요청 발생");
        /*List<Blog> articles = blogService.getArticles();
        model.addAttribute("articles", articles);*/

        return "board/movie";
    }

    @GetMapping("/single")
    public String showSingle(Model model) {
        log.info("/board/guest-book GET 요청 발생");
        /*List<Blog> articles = blogService.getArticles();
        model.addAttribute("articles", articles);*/

        return "board/single";
    }
}
