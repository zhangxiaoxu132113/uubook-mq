package com.water.test;

import com.water.mq.MQProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangmiaojie on 2017/8/21.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestQueue {
    @Resource
    private MQProducer mqProducer;

    private final String queue_key = "test_queue_key";

    @Test
    public void send() {
        Map<String, Object> msg = new HashMap<>();
        msg.put("data", "hello,rabbmitmq!");
        mqProducer.sendDataToQueue(queue_key, msg);
    }
}