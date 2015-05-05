package com.huasheng.study.entity.article;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by mars on 15/5/4.
 */
@Entity
@Table(name = "lan_artcile_in_category")
public class ArticleInCategory extends AbstractPersistable<Long> {

    @ManyToOne(fetch = FetchType.LAZY)
    private Article article;

    @ManyToOne(fetch = FetchType.LAZY)
    private ArticleCategory articleCategory;

    /**
     * 标题
     */
    private String categoryTitle;

    /**
     * 路径
     */
    private String categoryFamilyPath;

}
