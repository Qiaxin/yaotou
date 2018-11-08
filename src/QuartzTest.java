import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleTrigger;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;

import java.util.Date;

/**
 * @Author: Qiaxin
 * @description:
 * @Date: Create in 14:13 2017-12-27
 * @Modified:
 */

public class QuartzTest
    {
        public static void main(String[] args)
        {
            QuartzTest test = new QuartzTest();
            try
            {
                test.startSchedule();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    public void startSchedule() throws Exception
    {
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        JobDetail jobDetail =
                new JobDetailImpl("testJob", Scheduler.DEFAULT_GROUP, TestJob.class);
        //结束时间
        long end = System.currentTimeMillis() + 90000L;
        //执行10次，每3秒执行一次，到9秒后结束
        SimpleTrigger trigger = new SimpleTriggerImpl("test",null,new Date(),null,-1,1000L);
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();
    }

}
