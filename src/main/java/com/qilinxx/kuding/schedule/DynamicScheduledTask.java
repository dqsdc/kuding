package com.qilinxx.kuding.schedule;

import com.qilinxx.kuding.domain.mapper.GrantMapper;
import com.qilinxx.kuding.util.DateKit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Description: 动态修改定时任务cron参数
 */
@Component
public class DynamicScheduledTask implements SchedulingConfigurer {

    //每天12点和19点进行课程状态检测
    private static final String DEFAULT_CRON = "0 0 12,19 * * ?";

    private String cron = DEFAULT_CRON;

    @Autowired
    GrantMapper grantMapper;

    //定时任务具体实现
    private void executeTask() {
        Integer time = DateKit.getUnixTimeByDate(new Date());
        grantMapper.updateDoneGrant(time);
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.addTriggerTask(() -> {
            executeTask();
        }, new Trigger() {
            @Override
            public Date nextExecutionTime(TriggerContext triggerContext) {
                // 定时任务触发，可修改定时任务的执行周期
                CronTrigger trigger = new CronTrigger(cron);
                Date nextExecDate = trigger.nextExecutionTime(triggerContext);
                return nextExecDate;
            }
        });
    }

    public void setCron(String cron) {
        this.cron = cron;
    }
}