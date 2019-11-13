package com.qf.service;

import com.qf.domain.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getList(Integer a_uid);
    List<Article> findAll(Integer c_uid);
}
