package com.qf.dao;

import com.qf.domain.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleDao {
    List<Article> getList(Integer a_uid);

    List<Article> findAll(Integer c_uid);
}
