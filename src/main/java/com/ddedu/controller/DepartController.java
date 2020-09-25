package com.ddedu.controller;

import com.ddedu.common.JsonResult;
import com.ddedu.entity.Depart;
import com.ddedu.service.DepartService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class DepartController {
    @Autowired
    private DepartService departService;


    @ResponseBody
    @RequestMapping("/addDepart.do")
    public JsonResult addDepart(Date createtime, String name){

        Depart depart = new Depart();
        depart.setCreatetime(createtime);
        depart.setFlag(1);
        depart.setName(name);
        depart.setNum(1);
        departService.addDepart(depart);


        return new JsonResult(1,null);
    }


    @ResponseBody
    @RequestMapping("/departpage.do")
    public Map<String,Object> selectAll(Integer page,Integer limit){
        HashMap<String, Object> map = new HashMap<>();
        PageHelper.startPage(page, limit);

        List<Depart> list = departService.selectAll();
        long total = ((Page) list).getTotal();
        map.put("code",0);
        map.put("msg", "");
        map.put("count",total);
        map.put("data", list);

        return map;

    }
    @ResponseBody
    @RequestMapping("/departlist.do")
   public Map<String,Object> selectNameAndCount(){
        HashMap<String, Object> map = new HashMap<>();

        List<Depart> departs = departService.selectAll();

        String[] names = new String[departs.size()];
        int[] counts  = new int[departs.size()];


        for (int i=0;i < departs.size();i++){
            names[i]= departs.get(i).getName();
            counts[i]= departs.get(i).getNum();
        }
        map.put("code",1);
        map.put("name",names);
        map.put("count",counts);

        return map;


    }



    @ResponseBody
    @RequestMapping("/departdelete.do")
    public JsonResult deleteOne(Integer id){

        departService.deleteOne(id);
        return new JsonResult(1000,null);

    }
    @ResponseBody
    @RequestMapping("/departupdate.do")
    public JsonResult update(String id,String name){
        System.out.println("???"+id + name);
        Depart depart = new Depart();
        int i = Integer.parseInt(id);
        depart.setId(i);
        depart.setName(name);
        departService.updateOne(depart);

        return new JsonResult(1,null);
    }

}
