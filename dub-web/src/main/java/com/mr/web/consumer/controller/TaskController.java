package com.mr.web.consumer.controller;

import com.mr.web.provider.api.ITaskRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/1/7.
 */
@Controller
public class TaskController {

    @Autowired
    private ITaskRemoteService taskRemoteService;

    @RequestMapping("task")
    public String task(Model model) {
        String status = "FAIL";
        status = taskRemoteService.test();
        model.addAttribute("status", status);
        model.addAttribute("dto", "aa");
        return "task";
    }
}
