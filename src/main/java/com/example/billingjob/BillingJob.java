package com.example.billingjob;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;

public class BillingJob implements Job {
    @Override
    public String getName() {
        return "BillingJob";
    }

    @Override
    public void execute(JobExecution execution) {
        // TODO implement business logic
        System.out.println("Processing billing information");
    }
}
