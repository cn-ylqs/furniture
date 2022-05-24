package com.furniture.controller;


import java.time.LocalDateTime;
import java.util.List;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.furniture.common.lang.Result;
import com.furniture.entity.Notice;
import com.furniture.service.NoticeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 * 公告管理
 * @author za
 * @since 2022-05-18
 */
@Slf4j
@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    NoticeService noticeService;



    public List<Notice> findAllNotice(){


        return null;
    }

    /**
     * 新增公告
     * @param notice
     * @return
     */
    @PostMapping("/addNotice")
    public Result addNotice(HttpServletRequest req,Notice notice){

        /*获取当前时间*/
        notice.setCreateTime(LocalDateTime.now());
        /*获取当前登陆管理员id*/
        Integer adminId = (Integer) req.getSession().getAttribute("admin");
        notice.setAuthorId(adminId);

        noticeService.save(notice);
//        System.out.println("新增成功");
        return Result.succ("新增公告成功");

    }

}
