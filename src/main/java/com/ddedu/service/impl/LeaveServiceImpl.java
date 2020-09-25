package com.ddedu.service.impl;

import com.ddedu.dao.AskForLeaveDao;
import com.ddedu.entity.AskForLeave;
import com.ddedu.service.AskForLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class LeaveServiceImpl implements AskForLeaveService {

    @Autowired
    private AskForLeaveDao leaveDao;

    /**
     * 请假申请
     * @param askForLeave 页面的信息
     */
    @Override
    public void insertAskForLeave(AskForLeave askForLeave) {
        // TODO 垃圾时间对比功能未完成
        /*Date startTime = askForLeave.getStartTime();
        Date endTime = askForLeave.getEndTime();
        System.out.println("startTime ==========" + startTime);
        System.out.println("endTime ============= " + endTime);
        int i = startTime.compareTo(endTime);*/

        if (askForLeave == null) {
            throw new RuntimeException("数据异常");
        }
        leaveDao.insertAskForLeave(askForLeave);
    }
}
