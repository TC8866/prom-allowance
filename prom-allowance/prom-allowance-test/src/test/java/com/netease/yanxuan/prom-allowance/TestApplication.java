package com.netease.yanxuan.prom-allowance;

import com.netease.yanxuan.prom-allowance.assembly.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by youzhihao on 2018/4/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ActiveProfiles("dev")
public class TestApplication {

    @Test
    public void test() {
        System.out.println("测试");
    }

}
