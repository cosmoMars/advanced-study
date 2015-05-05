package com.huasheng.study.entity.article;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by mars on 15/5/4.
 * 文章仓库
 */
@Entity
@Table(name = "lan_artcile_category")
public class ArticleCategory extends AbstractPersistable<Long>{

    private String title;

    private String familyPath;

    private int depth;

    private String description;

    private String imagePath;

    private boolean autoLock;

    private boolean autoDelete;

    private int sort;
}
