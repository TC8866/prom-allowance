package com.netease.yanxuan.prom-allowance.interfaces.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Consul健康检查服务
 *
 * @author hzwangliyuan.
 * @date 2018/5/3.
 */
@RestController
public class HealthCheckController {

    /**
     * 健康检查接口
     *
     * @return HttpStatus.OK 表示成功
     */
    @RequestMapping("/i/health")
    public ResponseEntity checkHealth() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
