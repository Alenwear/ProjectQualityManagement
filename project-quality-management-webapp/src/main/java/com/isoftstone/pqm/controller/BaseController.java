/**  
* @Project: baidu_ticket
* @Title: BaseController.java
* @Package: com.baidu.ticket.common.controller
* @Description: 
* @author: isoftstone 
* @date: 2016-7-4 23:14:53
* @Copyright: 2016 www.isoftstone.com Inc. All rights reserved.
* @version: V1.0  
*/
package com.isoftstone.pqm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


/**
 * <p>
 * 基础控制器
 * </p>.
 *
 * @author 
 * @Date 2016-04-13
 */
public class BaseController implements HandlerInterceptor {


    /* (non-Javadoc)
     * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
            Object handler) throws Exception {
        return true;
    }

    /* (non-Javadoc)
     * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        /*
         * 方法调用后调用该方法，返回数据给请求页
         */
        // if (isLegalView(modelAndView)) {
        // Member member=memberService.selectByPrimaryKey(getCurrentUserId());
        // modelAndView.addObject("currentUser",member );
        // modelAndView.addObject("menuList",
        // permissionService.selectPermissionByUser(member));
        // }
    }

    /* (non-Javadoc)
     * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
            Object handler, Exception ex) throws Exception {
    }

    /**
     * 判断是否为合法的视图地址
     * <p>.
     *
     * @param modelAndView spring 视图对象
     * @return boolean
     */
    protected boolean isLegalView(ModelAndView modelAndView) {
        boolean legal = false;
        if (modelAndView != null) {
            String viewUrl = modelAndView.getViewName();
            if (viewUrl != null && viewUrl.contains("redirect:")) {
                legal = false;
            } else {
                legal = true;
            }
        }
        return legal;
    }

    /**
     * Boolean to string.
     *
     * @param rlt the rlt
     * @return the string
     */
    protected String booleanToString(boolean rlt) {
        return rlt ? "true" : "false";
    }

}
