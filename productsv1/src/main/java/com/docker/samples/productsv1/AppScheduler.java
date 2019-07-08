package com.docker.samples.productsv1;

import java.util.List;
import java.util.ListIterator;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Display list of products
 *
 */
public class AppScheduler 
{
    public static void main( String[] args )
    {
    	int minute=51;
    	try {
    		 
            // specify the job' s details..
            JobDetail job = JobBuilder.newJob(ListProductJob.class)
                                      .withIdentity("testJob")
                                      .build();
    
            // specify the running period of the job
            CronTrigger cronTrigger = TriggerBuilder.newTrigger()
                    .withIdentity("crontrigger","crontriggergroup1").withSchedule(CronScheduleBuilder.cronSchedule("20 * * * * ? *")).build();
                    
                    //.withSchedule(CronScheduleBuilder.dailyAtHourAndMinute(16, minute)).build();
                    		
            //schedule the job
            SchedulerFactory schFactory = new StdSchedulerFactory();
            Scheduler sch = schFactory.getScheduler();
            sch.start();
            sch.scheduleJob(job, cronTrigger);
    
         } catch (SchedulerException e) {
            e.printStackTrace();
         }
   
    }
}
