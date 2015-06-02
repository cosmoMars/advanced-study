//package com.huasheng.study.controller.school;
//
//import com.huasheng.MyRepository;
//import com.huasheng.core.controller.AbstractBaseController;
//import com.huasheng.study.entity.school.University;
//import com.huasheng.study.repository.school.UniversityRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
///**
// * Created by mars on 15/6/1.
// */
//@RestController
//@RequestMapping("university")
//public class UniversityController extends AbstractBaseController<University, Long> {
//
//    @Autowired
//    private UniversityRepository universityRepository;
//
//    @Override
//    protected MyRepository<University, Long> getRepository() {
//        return universityRepository;
//    }
//
//
//    @RequestMapping("retrieveUniversity")
//    public @ResponseBody
//    List<University> retrieveUniversity() {
//
//
//
//
//        return null;
//    }
//
//}
