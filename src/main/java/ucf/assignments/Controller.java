/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 luis curtiellas
 */
package ucf.assignments;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    /************** General Management **************/
    @FXML
    private Label helpMessage;

    @FXML
    protected void setHelpMessage() {
        //set and display a help message depending on the last action of the user
        //e.g. when creating a new task, instruct to input all fields
        //e.g. when there is an error, state it
    }

    @FXML
    protected void exitGUI() {
        //exits the GUI
        Platform.exit();
    }

    /************** List Management **************/
    @FXML
    protected void addList() {
        //adds a new to-do list
    }

    @FXML
    protected void removeList() {
        //removes an existing to-do list
    }

    @FXML
    protected void editListTitle() {
        //edits the title of a to-do list
    }

    @FXML
    private Label displayListLabel;

    @FXML
    protected void displayList() {
        //display the tasks of an existing to-do list
        //a toggle option will filter the tasks shown by status:
            //all
            //incomplete
            //complete
    }

    @FXML
    protected void saveOneList() {
        //saves the information on an existing list to a file
    }

    @FXML
    protected void saveAllLists() {
        //saves the information on all existing lists to a file
    }

    @FXML
    protected void loadOneList() {
        //loads one list's information from a file
    }

    @FXML
    protected void loadAllLists() {
        //loads all list's information from a file/s
    }

    /************** Task Management **************/
    @FXML
    protected void addTask() {
        //adds a task to the list
    }

    @FXML
    protected void removeTask() {
        //removes an existing task from a list
    }

    @FXML
    protected void editDescription() {
        //edits the description of a task
    }

    @FXML
    protected void editDate() {
        //edits the due date of a task
    }

    @FXML
    protected void editStatus() {
        //edits the 'complete' status of a task
    }
}