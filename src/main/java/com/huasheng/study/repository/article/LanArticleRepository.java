package com.huasheng.study.repository.article;

import com.huasheng.MyRepository;
import com.huasheng.study.entity.article.LanArticle;

/**
 * Created by mars on 15/6/2.
 */
public interface LanArticleRepository extends MyRepository<LanArticle, Long> {

    LanArticle findByArticleId(String articleId);
}
