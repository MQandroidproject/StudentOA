//package com.ddedu.interceptor;
//
//import com.qfedu.entity.User;
//import com.qfedu.utils.StrUtils;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
////登录拦截器         handlerInterceptor    拦截器处理者
//public class LoginInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//
//        String requestURI = request.getRequestURI();
//        /*
//        * 获取session存储得对象如果有就存储进去
//        * */
//        User user = (User)request.getSession().getAttribute(StrUtils.LOGIN_USER);
//        if (user == null) {
//            //证明没有登录需要跳转到登录页面
//            //1.在jquery中使用了ajax 会有特殊的请求头  带有  .do
//            String header = request.getHeader("X-Requested-With");
//            if (header != null && header.equals("XMLHttpRequest")) {
//                response.getWriter().write("{\"code\":0, \"info\":\"未登录\"}");
//            } else {
//                response.sendRedirect(request.getContextPath()+"/login.html");
//            }
//            return false;
//
//            //2.非ajax请求的   index.html   transform.html
//        } else {
//            return true;
//        }
//
//    }
//}
