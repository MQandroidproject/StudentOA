package com.ddedu.controller;

import com.alibaba.excel.EasyExcel;
import com.ddedu.common.JsonResult;
import com.ddedu.entity.Student;
import com.ddedu.entity.User;
import com.ddedu.service.UserService;
import com.ddedu.vo.Sex;
import com.ddedu.vo.VoStudent;
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
 * @author lenovo on 2020/9/1 15:30
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("query.do")
    @ResponseBody
    public JsonResult query(HttpSession session) {
        User user = (User)session.getAttribute("loginUser");
        System.out.println(user);
        String name = userService.selectNameByNo(user.getNo());

        return new JsonResult(1,name);
    }

    @RequestMapping("queryStudent.do")
    @ResponseBody
    public JsonResult query2(HttpSession session) {
        User user = (User)session.getAttribute("loginUser");
        VoStudent voStudent = userService.selectStudentByNo(user.getNo());
        System.out.println(voStudent);
        return new JsonResult(1,voStudent);
    }

    @RequestMapping("querystudentbycno.do")
    @ResponseBody
    public Map<String, Object> query3(HttpSession session, Integer page, Integer limit) {
        User user = (User)session.getAttribute("loginUser");
        Student student = userService.selectStudentByNo2(user.getNo());
        List<Student> list = userService.selectStudentByCno(student.getCno(), page, limit);
        System.out.println(list);
        /**
         * write:1.文件路径和名称 2.要生成的数据的Class对象 com.ddedu.test.User.class
         * sheet：设置Sheet的名称
         * doWrite：写出内容 传递要写出的集合*/
        EasyExcel.write("students.xlsx", com.ddedu.entity.Student.class).sheet("第一个").doWrite(list);

        //解析excel
        List<com.ddedu.entity.Student> list1=EasyExcel.read("students.xlsx").sheet().head(com.ddedu.entity.Student.class).doReadSync();
        System.out.println(list1);

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

    @RequestMapping("echarts.do")
    @ResponseBody
    public JsonResult sexScale(HttpSession session){
        //ArrayList<SexEcharts> list = new ArrayList<>();
        User user = (User)session.getAttribute("loginUser");
        Student student = userService.selectStudentByNo2(user.getNo());
        List<Sex> sexList = userService.sexScale(student.getCno());
        System.out.println(sexList);

        /*SexEcharts sexEcharts = new SexEcharts();
        HashMap<String, Object> map = new HashMap<>();
        for (Sex sex : sexList) {
            System.out.println(sex.getName());
            map.put("name", sex.getName());
            sexEcharts.setMapName(map);
            //map.clear();

            System.out.println(sex.getValue());
            map.put("value",sex.getValue());
            sexEcharts.setMapValue(map);
            //map.clear();
            System.out.println(sexEcharts);
            list.add(sexEcharts);
        }

        System.out.println(list);*/
        return new JsonResult(1,sexList);
    }


}
