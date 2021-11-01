/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 luis curtiellas
 */
package ucf.assignments;

public class toDoList {
    private String title;       //arbitrary string from user
    private Task[] taskList;    //array of the tasks in the specific to-do list

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Task[] getTaskList() {
        return taskList;
    }

    public void setTaskList(Task[] taskList) {
        this.taskList = taskList;
    }
}
