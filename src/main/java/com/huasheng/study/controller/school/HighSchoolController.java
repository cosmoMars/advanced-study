package com.huasheng.study.controller.school;

import com.huasheng.MyRepository;
import com.huasheng.core.controller.AbstractBaseController;
import com.huasheng.study.entity.school.Gender;
import com.huasheng.study.entity.school.Grade;
import com.huasheng.study.entity.school.HighSchool;
import com.huasheng.study.repository.base.StateRepository;
import com.huasheng.study.repository.school.HighSchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
                                           @RequestParam(required = false) Integer schoolPopulation) {

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
//
//        filters.put("ssatSat_equal", ssat);

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
            filters.put("religion_equalTo", religionIdx);
        }
        if (residentialIdx != null) {
            filters.put("residential_equalTo", residentialIdx);
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
        List<HighSchool> highSchools = highSchoolRepository.findAll(filters);

        List<Map<String, Object>> data = new ArrayList<>();
        for (HighSchool hs : highSchools) {
            Map<String, Object> result = new HashMap<>();
            result.put("schoolId", hs.getId());
            result.put("title", hs.getTitle());
            result.put("titleEn", hs.getTitleEn());
            result.put("imagePath", hs.getImagePath());
            result.put("stateName", hs.getState() == null ? "" : hs.getState().getName());
            result.put("website", hs.getWebsite());
            result.put("description", hs.getDescription());
            result.put("apCourse", hs.getAPCourse());
            result.put("ibCourse", hs.getIBCourse());
            result.put("religion", hs.getReligion());
            result.put("residential", hs.getResidential());
            result.put("gender", hs.getGender());
            result.put("expenses", hs.getExpenses());
            result.put("grade", hs.getGrade());
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

            data.add(result);
        }


        Map<String, Object> res = new HashMap<>();
        res.put("success", "1");
        res.put("data", data);

        return res;
    }

    @RequestMapping("retrieveHighSchoolDetial/{id}")
    public
    @ResponseBody
    Map<String, Object> retrieveHighSchoolDetial(@PathVariable long id) {

        HighSchool highSchool = highSchoolRepository.findOne(id);

        Map<String, Object> result = new HashMap<>();
        result.put("id", highSchool.getId());
        result.put("title", highSchool.getTitle());
        result.put("titleEn", highSchool.getTitleEn());
        result.put("imagePath", highSchool.getImagePath());
        result.put("stateName", highSchool.getState() == null ? "" : highSchool.getState().getName());
        result.put("website", highSchool.getWebsite());
        result.put("description", highSchool.getDescription());
        result.put("apCourse", highSchool.getAPCourse());
        result.put("ibCourse", highSchool.getIBCourse());
        result.put("religion", highSchool.getReligion().toString());
        result.put("residential", highSchool.getResidential().toString());
        result.put("gender", highSchool.getGender().toString());
        result.put("expenses", highSchool.getExpenses());
        result.put("grade", highSchool.getGrade().toString());
        result.put("establishDate", highSchool.getEstablishDate());
        result.put("acceptToefl", highSchool.isAcceptToefl());

        result.put("minToefl", highSchool.getMinToefl());
        result.put("maxToefl", highSchool.getMaxToefl());
        result.put("acceptSlep", highSchool.isAcceptSlep());
        result.put("minSlep", highSchool.getMinSlep());
        result.put("maxSlep", highSchool.getMaxSlep());
        result.put("ssatSat", highSchool.isSsatSat());
        result.put("averageSat", highSchool.getAverageSat());
        result.put("internationalStudentRatio", highSchool.getInternationalStudentRatio());
        result.put("speciality", highSchool.getSpeciality());
        result.put("schoolPopulation", highSchool.getSchoolPopulation());
        result.put("clicks", highSchool.getClicks());
        return result;

    }

}
