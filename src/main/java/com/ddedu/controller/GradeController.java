package com.ddedu.controller;

import com.ddedu.common.JsonResult;
import com.ddedu.entity.Grade;
import com.ddedu.service.GradeService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    /**
     * 添加一个新班级
     * @param grade 页面获取新开班级的数据
     * @return 成功 返回json数据 code ==> 1      失败 返回json数据 code ==> 0
     */
    @RequestMapping("/insertGrade.do")
    @ResponseBody
    public JsonResult insertGrade(Grade grade) {
        gradeService.insertGrade(grade);
        return new JsonResult(1, "添加成功！");
    }

    /**
     * 展示班级列表
     * @param page  分页
     * @param limit 分页
     * @return 返回所有的班级信息
     */
    @RequestMapping("/selectGradeAll.do")
    @ResponseBody
    public Map<String, Object> selectGradeAll(Integer page, Integer limit) {
        List<Grade> list = gradeService.selectGradeAll(page, limit);
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg", "");
        map.put("count",total);
        map.put("data", list);
        return map;
    }

    /**
     * 表格选中根据id删除班级信息
     * @param id 页面选中的id
     * @return json数据
     */
    @RequestMapping("/deleteGradeById.do")
    @ResponseBody
    public JsonResult deleteGradeById(int id) {
        gradeService.deleteGradeById(id);
        return new JsonResult(1, "删除成功！");
    }

    /**
     * 修改班级信息
     * @param grade 修改过的信息
     * @return json数据
     */
    @RequestMapping("/updateGrade.do")
    @ResponseBody
    public JsonResult updateGrade(Grade grade) {
        gradeService.updateGrade(grade);
        return new JsonResult(1, "修改成功！");
    }
}
