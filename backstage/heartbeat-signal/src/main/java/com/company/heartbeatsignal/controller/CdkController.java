package com.company.heartbeatsignal.controller;

import com.company.heartbeatsignal.service.CdkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liquid
 * @类名： CdkController
 * @描述：
 * @date 2019/5/8
 */
@RequestMapping("/cdk")
@RestController
public class CdkController {

    @Autowired
    private CdkService cdkService;
}
