package com.ddedu.service;

import com.ddedu.entity.Staff;
import com.ddedu.vo.DeptCharts;

import java.util.List;

public interface StaffService {
    public void add(Staff staff);
    public List<Staff> selectStaffAll(Integer page, Integer limit);
	public List<Staff> selectStaffById(Integer id);
	public List<DeptCharts> groupByDept();
	void del(int id);
}
