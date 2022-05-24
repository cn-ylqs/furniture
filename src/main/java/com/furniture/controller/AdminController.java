package com.furniture.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.furniture.common.lang.Result;

import com.furniture.entity.Admin;
import com.furniture.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author za
 * @since 2022-05-18
 */
/*日志方便调试*/
@Slf4j
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
     * 超级管理员登陆
     * @param req
     * @param admin
     * @return
     */
    @PostMapping("/login")
    /*添加HttpServletRequest，将登陆用户存放到session，随时获取当前用户信息*/
    public Result login(HttpServletRequest req,Admin admin){
        /*根据页面提交的用户名查询数据库*/
        LambdaQueryWrapper<Admin> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Admin::getTrueName,admin.getTrueName());
        Admin admin1 = adminService.getOne(queryWrapper);

        /*如果没有查到返回登陆失败*/
        if (admin1 == null){
//            System.out.println("登陆失败");
            return Result.fail("登陆失败");
        }
        /*用户存在进行密码校验*/
        /*如果密码不匹配，返回登陆失败*/
        if (!admin1.getPassword().equals(admin.getPassword())){
            return Result.fail("登陆失败");
        }
        /*密码比对成功，登陆成功*/
        req.getSession().setAttribute("admin",admin1.getUid());
//        System.out.println("登陆成功");
//        System.out.println(Result.succ(admin1));
        return Result.succ(admin1);
    }


    /**
     * 超级管理员退出
     * @param req
     * @return
     */
    @PostMapping("/logout")
    public Result logout(HttpServletRequest req){
        /*清除session中保存的当前登陆管理员的id*/
        req.getSession().removeAttribute("admin");
        return Result.succ("退出成功");
    }


}
