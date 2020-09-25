package com.ddedu.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimeInterceptor implements HandlerInterceptor {
    //创建ThreadLocal对象
   private ThreadLocal<Long> threadLocal =  new ThreadLocal<>();
//    private long beginTime;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("prehandle");
        long beginTime = System.currentTimeMillis();
        //多线程之间是互相独立的
        //设置值
        threadLocal.set(beginTime);
        Thread.sleep(5000);
        return true;
    }
//http://10.8.153.7:8080/bankSystem/login.do
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("posthandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
        long endTime = System.currentTimeMillis();
        Long  beginTime= threadLocal.get();
        long v = endTime - beginTime;
        System.out.println(v);
    }
}
