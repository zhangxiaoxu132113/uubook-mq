package com.water.mq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhangmiaojie on 2017/8/21.
 */
@Component("queueListenter")
public class QueueListenter implements MessageListener {
    private static Log logger = LogFactory.getLog(QueueListenter.class);

    @Override
    public void onMessage(Message msg) {
        try{
            logger.info(msg.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
