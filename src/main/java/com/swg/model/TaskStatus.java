package com.swg.model;

import org.springframework.scheduling.config.Task;

public enum TaskStatus {


    PENDING(  "PENDING"),

    ASSIGNED("ASSIGNED"),

    DONE("DONE");


    TaskStatus(String done ){

    }

}
