import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @Author: Qiaxin
 * @description:
 * @Date: Create in 13:41 2017-12-27
 * @Modified:
 */

public class TestJob implements Job
{
    public TestJob(){}
    public void execute(JobExecutionContext arg0) throws JobExecutionException
    {
        //String name = context.getJobDetail().getJobDataMap().getString("name");
        System.out.println("job executing..."+new Date());   }
}