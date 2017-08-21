package com.water.mq;

/**
 * Created by zhangmiaojie on 2017/8/21.
 */
public interface MQProducer {
    /**
     * 发送消息到指定队列
     * @param queueKey
     * @param object
     */
    public void sendDataToQueue(String queueKey, Object object);
}
