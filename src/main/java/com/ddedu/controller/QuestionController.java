package com.ddedu.controller;


import com.alibaba.excel.EasyExcel;
import com.ddedu.common.JsonResult;
import com.ddedu.entity.Question;
import com.ddedu.entity.User;
import com.ddedu.service.QuestionService;
import com.ddedu.util.StrUtil;
import com.ddedu.vo.QuestionCharts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/OaNew")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @RequestMapping("/savequestion.do")
    @ResponseBody
    public JsonResult addQuestion(HttpSession session, Integer type, String question, String answer, Integer star) {

        User user = (User)session.getAttribute(StrUtil.LOGIN_USER);
        String no = user.getNo();

        Question q1 = new Question();

        if(1 == type) {
            q1.setQtype("基础面试");
        }
        if(2 == type) {
            q1.setQtype("进阶面试");
        }
        if(3 == type) {
            q1.setQtype("核心算法");
        }
        if(4 == type) {
            q1.setQtype("底层原理");
        }

        q1.setU_no(no);
        q1.setFlag("资源");
        q1.setQuestion(question);
        q1.setAnswer(answer);
        q1.setStar(star);

        questionService.addQuestion(q1);

        return new JsonResult(1,"添加成功");
    }

    @RequestMapping("/queryquestionbyno.do")
    @ResponseBody
    public Map<String, Object> findAll(Integer page, Integer limit) {
        Map<String, Object> map = new HashMap<>();
        List<Question> list = questionService.findAll(page, limit);
        int count = questionService.findCount();

        List<Object> listExcel = new ArrayList<>();
        List<Question> excels = questionService.findExcel();
        for (Question qe : excels) {
            Question question = new Question();
            question.setId(qe.getId());
            question.setU_no(qe.getU_no());
            question.setQuestion(qe.getQuestion());
            question.setAnswer(qe.getAnswer());
            question.setQtype(qe.getQtype());
            question.setFlag(qe.getFlag());
            question.setStar(qe.getStar());
            listExcel.add(question);
        }
        EasyExcel.write("question.xlsx", Question.class).sheet("第一页").doWrite(listExcel);


        map.put("code", 0);
        map.put("msg", "");
        map.put("count", count);
        map.put("data", list);
        return map;
    }

    @RequestMapping("/questiondelete.do")
    @ResponseBody
    public JsonResult deleteById(Integer id) {
        questionService.deleteById(id);
        return new JsonResult(1,"删除成功");
    }

    @RequestMapping("/questionupdate.do" )
    @ResponseBody
    public JsonResult updateQuestion(Integer id, Integer type, String question, String answer) {

        Question q1 = new Question();
        if(1 == type) {
            q1.setQtype("基础面试");
        }
        if(2 == type) {
            q1.setQtype("进阶面试");
        }
        if(3 == type) {
            q1.setQtype("核心算法");
        }
        if(4 == type) {
            q1.setQtype("底层原理");
        }

        q1.setId(id);
        q1.setQuestion(question);
        q1.setAnswer(answer);

        questionService.updateById(q1);

        return new JsonResult(1,"修改成功");
    }

    @RequestMapping("/addNote.do")
    @ResponseBody
    public JsonResult addNote(HttpSession session, String question, String answer) {
        Question q1 = new Question();
        User user = (User)session.getAttribute(StrUtil.LOGIN_USER);
        String no = user.getNo();
        q1.setU_no(no);
        q1.setFlag("笔记");
        q1.setQtype("笔记");
        q1.setQuestion(question);
        q1.setAnswer(answer);
        questionService.addNote(q1);
        return new JsonResult(1, "添加成功");
    }

    @RequestMapping("/addCode.do")
    @ResponseBody
    public JsonResult addCode(HttpSession session, String question, String answer) {
        Question q1 = new Question();
        User user = (User)session.getAttribute(StrUtil.LOGIN_USER);
        String no = user.getNo();
        q1.setU_no(no);
        q1.setFlag("代码");
        q1.setQtype("代码");
        q1.setQuestion(question);
        q1.setAnswer(answer);
        questionService.addNote(q1);
        return new JsonResult(1, "添加成功");
    }

    @RequestMapping("/echarts.do")
    @ResponseBody
    public QuestionCharts getCharts() {
        return questionService.findCharts();
}

}
