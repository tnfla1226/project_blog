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

    @GetMapping("/restaurant-list")
    public String list(Model model) {
        log.info("/board/restaurnat-list GET 요청 발생");
        /*List<Blog> articles = blogService.getArticles();
        model.addAttribute("articles", articles);*/

        return "board/single";
    }
}
