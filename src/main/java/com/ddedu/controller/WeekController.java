package com.ddedu.controller;

import com.ddedu.common.JsonResult;
import com.ddedu.entity.User;
import com.ddedu.entity.Week;
import com.ddedu.service.WeekService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lenovo on 2020/9/1 21:24
 */
@Controller
@RequestMapping("/week")
public class WeekController {
    @Autowired
    private WeekService weekService;

    @RequestMapping("add.do")
    @ResponseBody
    public JsonResult add(String title, String content, HttpSession session) {
        User user = (User)session.getAttribute("loginUser");

        Week week = new Week();
        week.setTitle(title);
        week.setContent(content);
        week.setStatus(1);
        week.setU_no(user.getNo());
        System.out.println(week);
        weekService.add(week);

        return new JsonResult(1,"添加成功！");
    }

    @RequestMapping("queryWeek.do")
    @ResponseBody
    public Map<String, Object> queryWeek(Integer page, Integer limit) {
        List<Week> list = weekService.select(page, limit);

        // 获取总记录数
        long total = ((Page) list).getTotal();

        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        System.out.println(map);
        return map;
    }

    @RequestMapping("deleteById.do")
    @ResponseBody
    public JsonResult deleteWeekById(Integer id) {
        weekService.deleteById(id);
        return new JsonResult(1,"删除成功");
    }

    @RequestMapping("update.do")
    @ResponseBody
    public JsonResult updateWeek(String id, String title, String content, Integer status, String createTime, String u_no) {
        Week week = new Week();
        week.setId(Integer.parseInt(id));
        week.setTitle(title);
        week.setContent(content);
        week.setStatus(status);
        week.setCreateTime(createTime);
        week.setU_no(u_no);
        System.out.println(week);

        weekService.update(week);

        return new JsonResult(1,"修改成功");
    }

    @RequestMapping("queryWeekById.do")
    @ResponseBody
    public JsonResult queryWeekById(String id) {
        System.out.println(id);
        Week week = weekService.selectById(Integer.parseInt(id));

        return new JsonResult(1, week);
    }
}
