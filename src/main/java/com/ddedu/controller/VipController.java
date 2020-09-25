package com.ddedu.controller;

import com.ddedu.common.JsonResult;
import com.ddedu.entity.Student;
import com.ddedu.entity.User;
import com.ddedu.entity.Vip;
import com.ddedu.entity.Week;
import com.ddedu.service.VipService;
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
 * @author lenovo on 2020/9/2 16:34
 */
@Controller
@RequestMapping("/vip")
public class VipController {
    @Autowired
    private VipService vipService;

    @RequestMapping("add")
    @ResponseBody
    public JsonResult add(String content, HttpSession session) {
        User user = (User)session.getAttribute("loginUser");

        Vip vip = new Vip();
        vip.setContent(content);
        vip.setU_no(user.getNo());

        vipService.add(vip);
        return new JsonResult(1,"添加成功！");
    }

    @RequestMapping("queryVip.do")
    @ResponseBody
    public Map<String, Object> queryVip(Integer page, Integer limit) {
        List<Vip> list = vipService.select(page, limit);

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
