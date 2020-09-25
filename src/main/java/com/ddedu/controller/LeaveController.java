package com.ddedu.controller;

import com.ddedu.common.JsonResult;
import com.ddedu.entity.AskForLeave;
import com.ddedu.entity.Student;
import com.ddedu.entity.User;
import com.ddedu.service.AskForLeaveService;
import com.ddedu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/AskForLeave")
public class LeaveController {

    @Autowired
    private AskForLeaveService leaveService;

    @Autowired
    private StudentService studentService;

    /**
     * 添加申请信息
     * @return json数据
     */
    @RequestMapping("/insertLeave.do")
    @ResponseBody
    public JsonResult insertLeave(AskForLeave askForLeave, String name, HttpSession session) {
        System.out.println(askForLeave);
        System.out.println(name);
        int sid = studentService.selectIdByName(name);
        askForLeave.setSid(sid);
        System.out.println("askForLeave ===============" + askForLeave);
        leaveService.insertAskForLeave(askForLeave);

        return new JsonResult(1,"提交成功！");
    }
}
