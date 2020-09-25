package com.ddedu.controller;

import com.ddedu.common.JsonResult;
import com.ddedu.entity.Staff;
import com.ddedu.entity.Student;
import com.ddedu.entity.User;
import com.ddedu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("login.do")
    @ResponseBody
    public JsonResult login(String no, String pass, HttpSession session){
        User user = loginService.login (no, pass);
        session.setAttribute ("loginUser",user);
        return new JsonResult (1,user.getIdentity ());
    }


/*
* 用来验证主页是否登录
* */
    @RequestMapping("LoginToJudge.do")
    @ResponseBody
    public JsonResult LoginToJudge(HttpSession session){
        User user = (User) session.getAttribute ("loginUser");
        if(user==null){
            return new JsonResult (0,"未登录");
        }else{
            return new JsonResult (1,user.getIdentity ());
        }
    }
    /*
    * 注销用户功能
    * */
    @RequestMapping("loginOut.do")
    @ResponseBody
    public JsonResult loginOut(HttpSession session){
        session.invalidate ();
        return new JsonResult (1,"注销成功");
    }
    /*
    * 查询登录用户的信息
    * */
    @RequestMapping("findByNo.do")
    @ResponseBody
    public JsonResult findByNo(HttpSession session){
        User user = (User) session.getAttribute ("loginUser");
        System.out.println (user);
        String no = user.getNo ();
        System.out.println (no);
        Staff staff = loginService.findByNo (no);
        System.out.println (staff);
        return new JsonResult (1,staff);
    }
    @RequestMapping("findByNoStu.do")
    @ResponseBody
    public JsonResult findByNoStu(HttpSession session){
        User user = (User) session.getAttribute ("loginUser");
        String no = user.getNo ();
        Student stu = loginService.findByNoStu (no);
        return new JsonResult (1,stu);
    }
}
