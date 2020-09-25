package com.ddedu.controller;

import com.ddedu.common.JsonResult;
import com.ddedu.entity.Anonymity;
import com.ddedu.entity.Student;
import com.ddedu.entity.User;
import com.ddedu.entity.Vip;
import com.ddedu.service.AnonymityService;
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
 * @author lenovo on 2020/9/2 19:09
 */
@Controller
@RequestMapping("/anonymity")
public class AnonymityController {
    @Autowired
    private AnonymityService anonymityService;

    @RequestMapping("add.do")
    @ResponseBody
    public JsonResult add(String content, HttpSession session) {
        User user = (User)session.getAttribute("loginUser");

        Anonymity anonymity = new Anonymity();
        anonymity.setContent(content);
        anonymity.setU_no(user.getNo());

        anonymityService.add(anonymity);
        return new JsonResult(1,"添加成功！");
    }

    @RequestMapping("queryAnonymity.do")
    @ResponseBody
    public Map<String, Object> queryAnonymity(HttpSession session, Integer page, Integer limit) {
        List<Anonymity> list = anonymityService.select(page, limit);

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
}
