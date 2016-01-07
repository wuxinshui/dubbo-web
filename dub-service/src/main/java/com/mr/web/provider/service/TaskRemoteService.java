package com.mr.web.provider.service;

import com.mr.web.provider.api.ITaskRemoteService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/1/7.
 */
@Service
public class TaskRemoteService implements ITaskRemoteService {
    public String test() {
        return "SUCCESS";
    }
}
