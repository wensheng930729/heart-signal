package com.company.heartbeatsignal.controller;

import com.company.heartbeatsignal.service.AttentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liquid
 * @类名： AttentionController
 * @描述：
 * @date 2019/5/8
 */
@RequestMapping("/attention")
@RestController
public class AttentionController {

    @Autowired
    private AttentionService attentionService;
}
