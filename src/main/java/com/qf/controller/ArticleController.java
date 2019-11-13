package com.qf.controller;

import com.qf.domain.Article;
import com.qf.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/findById")
    @ResponseBody
    public List<Article> findById(){
        List<Article> list = articleService.getList(1);
        return list;
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Article> findAll(){
        List<Article> all = articleService.findAll(1);
        System.out.println(all);
        return all;
    }
}
