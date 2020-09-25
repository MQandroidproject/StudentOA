package com.ddedu.controller;

import com.ddedu.common.JsonResult;
import com.ddedu.entity.Depart;
import com.ddedu.entity.Staff;
import com.ddedu.service.DepartService;
import com.ddedu.service.StaffService;
import com.ddedu.vo.DeptCharts;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StaffController {
    @Autowired
    private StaffService staffService;
    @Autowired
    private DepartService departService;


    @RequestMapping("staffAdd.do")
    @ResponseBody
    public JsonResult add (Staff staff) {
        System.out.println (staff);
        String did = staff.getDid ();
        String d_name=null;
        List<Depart> departs = departService.selectAll ();
        for (Depart depart : departs) {
            if(depart.getId ()==Integer.parseInt (did)){
                d_name=depart.getName ();
            }
        }
        staff.setD_name (d_name);
        System.out.println (staff);
        staffService.add (staff);
        return new JsonResult (1,"添加成功");
    }
    @RequestMapping("staffAll.do")
    @ResponseBody
    public Map<String,Object> selectAll (Integer page, Integer limit) {
        HashMap<String, Object> map = new HashMap<> ();
        List<Staff> list = staffService.selectStaffAll(page,limit);
        long total = ((Page) list).getTotal();
        map.put("code",0);
        map.put("msg", "");
        map.put("count",total);
        map.put("data", list);
        return map;
    }
	
    @ResponseBody
    @RequestMapping("staffbydid.do")
    public Map<String,Object> selectStaffsById(String did,Integer page,Integer limit){
        int intdid = Integer.parseInt(did);
        HashMap<String, Object> map = new HashMap<>();

        PageHelper.startPage(page, limit);

        List<Staff> list = staffService.selectStaffById(intdid);
        long total = ((Page) list).getTotal();
        map.put("code",0);
        map.put("msg", "");
        map.put("count",total);
        map.put("data", list);
        return map;
    }
    @RequestMapping("groupByDept.do")
    @ResponseBody
    public Map<String,Object> groupByDept(){
        List<DeptCharts> deptCharts = staffService.groupByDept ();
        HashMap<String, Object> map = new HashMap<> ();
        List<String> list = new ArrayList<> ();
        List<Integer> list1 = new ArrayList<> ();
        for (int i = 0; i <deptCharts.size (); i++) {
            list.add (deptCharts.get (i).getName ());
            list1.add (deptCharts.get (i).getNum ());
        }
        map.put ("types",list);
        map.put ("num",list1);
        return map;
    }
    @RequestMapping("staffdelete.do")
    @ResponseBody
    public JsonResult staffDelete(String id){
        System.out.println (id);
        staffService.del (Integer.parseInt (id));
        return new JsonResult (1,"删除成功");
    }


}
