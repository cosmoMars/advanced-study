package com.huasheng.study.controller.school;

import com.huasheng.MyRepository;
import com.huasheng.core.controller.AbstractBaseController;
import com.huasheng.study.entity.school.*;
import com.huasheng.study.repository.base.StateRepository;
import com.huasheng.study.repository.school.HighSchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mars on 15/6/1.
 */
@RestController
@RequestMapping("highSchool")
public class HighSchoolController extends AbstractBaseController<HighSchool, Long> {

    @Autowired
    private HighSchoolRepository highSchoolRepository;

    @Autowired
    private StateRepository stateRepository;

    @Override
    protected MyRepository<HighSchool, Long> getRepository() {
        return highSchoolRepository;
    }

    /**
     * 获取学校列表
     * @param gender
     * @param grade
     * @param languageIdx
     * @param score
     * @param ssat
     * @param stateId
     * @param apCourse
     * @param ibCourse
     * @param religionIdx
     * @param residentialIdx
     * @param expenses
     * @param internationalRatio
     * @param averageSat
     * @param schoolPopulation
     * @param pageable
     * @return
     */
    @RequestMapping("retrieveHighSchool")
    public
    @ResponseBody
    Map<String, Object> retrieveHighSchool(@RequestParam int gender,
                                           @RequestParam int grade,
                                           @RequestParam int languageIdx,
                                           @RequestParam int score,
                                           @RequestParam boolean ssat,
                                           @RequestParam(required = false) Long stateId,
                                           @RequestParam(required = false) Integer apCourse,
                                           @RequestParam(required = false) Integer ibCourse,
                                           @RequestParam(required = false) Integer religionIdx,
                                           @RequestParam(required = false) Integer residentialIdx,
                                           @RequestParam(required = false) Integer expenses,
                                           @RequestParam(required = false) Integer internationalRatio,
                                           @RequestParam(required = false) Integer averageSat,
                                           @RequestParam(required = false) Integer schoolPopulation,
                                           Pageable pageable) {

        logger.trace("-- 获取高校信息 --");

        Map<String, Object> filters = new HashMap<>();
        filters.put("gender_equal", Gender.values()[gender]);
        filters.put("grade_equal", Grade.values()[grade]);
        switch (languageIdx) {
            case 0:
                filters.put("minToefl_lessThanOrEqualTo", score);
                filters.put("maxToefl_greaterThanOrEqualTo", score);
                break;
            case 1:
                filters.put("minSlep_lessThanOrEqualTo", score);
                filters.put("maxSlep_greaterThanOrEqualTo", score);
                break;
            case 2:
                filters.put("minItep_lessThanOrEqualTo", score);
                filters.put("maxItep_greaterThanOrEqualTo", score);
                break;
        }

        if (ssat) {
            filters.put("ssatSat_isTrue", null);
        } else {
            filters.put("ssatSat_isFalse", null);
        }

        if (stateId != null) {
            filters.put("state.id_equal", stateId);
        }
        if (apCourse != null) {
            filters.put("APCourse_greaterThanOrEqualTo", apCourse);
        }
        if (ibCourse != null) {
            filters.put("IBCourse_greaterThanOrEqualTo", ibCourse);
        }
        if (religionIdx != null) {
            filters.put("religion_equal", Religion.values()[religionIdx]);
        }
        if (residentialIdx != null) {
            filters.put("residential_equal", Residential.values()[residentialIdx]);
        }
        if (expenses != null) {
            filters.put("expenses_lessThanOrEqualTo", expenses);
        }
        if (internationalRatio != null) {
            filters.put("internationalStudentRatio_greaterThanOrEqualTo", internationalRatio);
        }
        if (averageSat != null) {
            filters.put("averageSat_greaterThanOrEqualTo", averageSat);
        }

        if (schoolPopulation != null) {
            filters.put("schoolPopulation_greaterThanOrEqualTo", schoolPopulation);
        }
        Page<HighSchool> hsPage = highSchoolRepository.findAll(filters, pageable);
        Map<String, Object> res = new HashMap<>();
        res.put("success", "1");
        if (hsPage == null) {
            return res;
        }
        List<HighSchool> highSchools = hsPage.getContent();

        List<Map<String, Object>> data = new ArrayList<>();
        for (HighSchool hs : highSchools) {
            Map<String, Object> result = new HashMap<>();
            result.put("id", hs.getId());
            result.put("title", hs.getTitle());
            result.put("titleEn", hs.getTitleEn());

            data.add(result);
        }


        res.put("data", data);

        return res;
    }

    /**
     * 获取学校详情
     * @param id
     * @return
     */
    @RequestMapping("retrieveHighSchoolDetial/{id}")
    public
    @ResponseBody
    Map<String, Object> retrieveHighSchoolDetial(@PathVariable long id) {

        HighSchool hs = highSchoolRepository.findOne(id);

        Map<String, Object> result = new HashMap<>();
        result.put("id", hs.getId());
        result.put("title", hs.getTitle());
        result.put("titleEn", hs.getTitleEn());
        result.put("imagePath", hs.getImagePath());
        result.put("stateName", hs.getState() == null ? "" : hs.getState().getName());
        result.put("website", hs.getWebsite());
        result.put("description", hs.getDescription());
        result.put("apCourse", hs.getAPCourse());
        result.put("ibCourse", hs.getIBCourse());
        result.put("religion", hs.getReligion().toString());
        result.put("residential", hs.getResidential().toString());
        result.put("gender", hs.getGender().toString());
        result.put("expenses", hs.getExpenses());
        result.put("grade", hs.getGrade().toString());
        result.put("establishDate", hs.getEstablishDate());
        result.put("acceptToefl", hs.isAcceptToefl());

        result.put("minToefl", hs.getMinToefl());
        result.put("maxToefl", hs.getMaxToefl());
        result.put("acceptSlep", hs.isAcceptSlep());
        result.put("minSlep", hs.getMinSlep());
        result.put("maxSlep", hs.getMaxSlep());
        result.put("ssatSat", hs.isSsatSat());
        result.put("averageSat", hs.getAverageSat());
        result.put("internationalStudentRatio", hs.getInternationalStudentRatio());
        result.put("speciality", hs.getSpeciality());
        result.put("schoolPopulation", hs.getSchoolPopulation());
        result.put("clicks", hs.getClicks());
        result.put("agencyReviews", hs.getAgencyReviews());
        return result;

    }

}
