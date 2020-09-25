package com.ddedu.dao;

import com.ddedu.entity.Staff;
import com.ddedu.vo.DeptCharts;

import java.util.List;

public interface StaffDao {
    public void add(Staff staff);
    public List<Staff> selectStaffAll();
	public List<Staff> selectStaffById(Integer id);
	public List<DeptCharts> groupByDept();
	void del(int id);
}
