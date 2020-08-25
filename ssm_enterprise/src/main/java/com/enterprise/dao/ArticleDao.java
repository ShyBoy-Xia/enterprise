package com.enterprise.dao;


import com.enterprise.entity.Article;

/**
 * Created by admin on 2020/6/14.
 */
public interface ArticleDao extends DaoManage<Article>{
    Article selectPrevious(int id);
    Article selectNext(int id);
}
