package com.bo.primary.controller;

import com.bo.primary.threadPool.ThreadPoolBuilder;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: supermanYB
 * @Date: 2019/9/14 08:02
 * @Version 1.0
 */
public class ContentSwitchTest {
    private static final  long COUNT = 10000000000L;

    private static ThreadPoolExecutor threadPoolExecutor = ThreadPoolBuilder.fixedPool().setPoolSize(1).build();
}
