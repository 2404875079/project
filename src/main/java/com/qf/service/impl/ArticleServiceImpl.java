package com.qf.service.impl;

import com.qf.dao.ArticleDao;
import com.qf.domain.Article;
import com.qf.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;
    @Override
    public List<Article> getList(Integer a_uid) {
        List<Article> list = articleDao.getList(a_uid);
        return list;
    }

    @Override
    public List<Article> findAll(Integer c_uid) {
        List<Article> all = articleDao.findAll(1);
        return all;
    }
}
