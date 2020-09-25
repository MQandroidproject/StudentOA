package com.ddedu.controller;

import com.ddedu.common.JsonResult;
import com.ddedu.entity.Exercises;
import com.ddedu.service.ExercisesService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname ExercisesController
 * @Description TODO
 * @Author Woods-sen
 * @Company XX公司
 * @CreateDate 2020-09-01 21:10
 */
@Controller
@RequestMapping("/exer")
public class ExercisesController {
    @Autowired
    private ExercisesService service;

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonResult add(Exercises exercises) {
        service.addExercises(exercises);
        return new JsonResult(1, "习题添加成功！");
    }

    @RequestMapping("/select.do")
    @ResponseBody
    public Map<String, Object> listExerciseInfo(Integer page, Integer limit) {
        List<Exercises> list = service.selectExercises(page, limit);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++" + list);
        //获取总记录数
        long total = ((Page) list).getTotal();

        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        System.out.println(map);
        return map;
    }

    @RequestMapping("/delete.do")
    @ResponseBody
    public JsonResult deleteByEid(int id) {
       service.deleteByEid(id);
        return new JsonResult(1, "删除成功");
    }
}
