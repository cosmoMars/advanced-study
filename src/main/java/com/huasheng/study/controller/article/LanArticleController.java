package com.huasheng.study.controller.article;

import com.huasheng.MyRepository;
import com.huasheng.core.controller.AbstractBaseController;
import com.huasheng.study.entity.article.LanArticle;
import com.huasheng.study.repository.article.LanArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mars on 15/6/2.
 */
@RestController
@RequestMapping("lanArticle")
public class LanArticleController extends AbstractBaseController<LanArticle, Long> {

    @Autowired
    private LanArticleRepository lanArticleRepository;

    @Override
    protected MyRepository<LanArticle, Long> getRepository() {
        return lanArticleRepository;
    }


    @RequestMapping("retrieveArticle")
    public
    @ResponseBody
    Map<String, Object> retrieveArticle(@RequestParam(required = false) String tags,
                                        Pageable pageable) {

        Map<String, Object> filters = new HashMap<>();
        filters.put("tags_like", tags);

        Page<LanArticle> articlePage = lanArticleRepository.findAll(filters, pageable);
        Map<String, Object> res = new HashMap<>();

        res.put("success", "1");

        if (articlePage == null) {
            return res;
        }
        List<LanArticle> lanArticles = articlePage.getContent();

        List<Map<String, Object>> data = new ArrayList<>();
        for (LanArticle la : lanArticles) {
            Map<String, Object> result  =  new HashMap<>();
            result.put("articleId", la.getArticleId());
            result.put("title", la.getTitle());

            data.add(result);
        }
        res.put("data", data);

        return res;
    }


    @RequestMapping("retrieveArticleDetial/{id}")
    public
    @ResponseBody
    LanArticle retrieveArticleDetial(@PathVariable String id) {

        LanArticle lanArticle = lanArticleRepository.findByArticleId(id);

        return lanArticle;

    }
}
