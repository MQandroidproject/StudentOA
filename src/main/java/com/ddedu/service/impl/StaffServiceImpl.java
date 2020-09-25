package com.ddedu.service.impl;

import com.ddedu.dao.StaffDao;
import com.ddedu.entity.Staff;
import com.ddedu.service.StaffService;
import com.ddedu.vo.DeptCharts;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffDao staffDao;
    @Override
    public void add (Staff staff) {
        staffDao.add (staff);
    }

    @Override
    public List<Staff> selectStaffAll (Integer page, Integer limit) {
        PageHelper.startPage (page,limit);
        List<Staff> staff = staffDao.selectStaffAll ();
        return staff;
    }
	 @Override
    public List<Staff> selectStaffById(Integer id) {
        return staffDao.selectStaffById(id);
    }

    @Override
    public List<DeptCharts> groupByDept () {
        List<DeptCharts> deptCharts = staffDao.groupByDept ();
        return deptCharts;
    }

    @Override
    public void del (int id) {
        staffDao.del (id);
    }
}
