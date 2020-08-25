package com.enterprise.service;

import com.enterprise.entity.Article;

/**
 * Created by admin on 2020/6/14.
 */
public interface ArticleService extends Services<Article>{
    Article selectPrevious(int id);
    Article selectNext(int id);
}
