/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 luis curtiellas
 */
package ucf.assignments;

import java.util.List;

public class SaveLoad {
    //to save ONE list to file (overloaded method)
    public static boolean saveFile(toDoList list) {
        //refining the file path
        String fileName = "toDoListsInfo/" + list.getTitle() + ".csv";

        //build a string in the format of a .csv file

        //create a file and store the formatted information

        //return true when success (file created and written to)
        return true;
    }

    //to save ALL lists to files (overloaded method)
    public static boolean saveFile(toDoList[] list) {
        //repead process for every to-do list in the array
        for (int a = 0; a < list.length; a++) {
            //refining the file path
            String fileName = "toDoListsInfo/" + list[a].getTitle() + ".csv";

            //build a string in the format of a .csv file

            //create a file and store the formatted information
        }

        //return true when success (files created and written to)
        return true;
    }

    //to load ONE list from file (overloaded method)
    public static toDoList loadFile(String fileName) {
        //refining the file path
        fileName = "toDoListsInfo/" + fileName + ".csv";

        //store the .csv file info in toDoList object

        //set the title of the toDoList object = fileName

        //read and save, in order and separated by commas:
        //description
        //due date
        //status

        //return the object with its title, description, due date, and status filled
        return null;
    }

    //to load ALL lists from all files (overloaded method)
    public static toDoList[] loadFile() {
        //get a list of file paths to load
        List<String> fileList = getFilePaths(Global.saveDirectory);

        //for each .csv file in the folder toDoListsInfo/, repeat the loading process
        for (int a = 0; a < fileList.size(); a++) {
            //store the .csv file info in toDoList object

            //set the title of the toDoList object = fileName

            //read and save, in order and separated by commas:
            //description
            //due date
            //status
        }

        //return the object with its title, description, due date, and status filled
        return null;
    }

    //returns a list of the file names
    public static List<String> getFilePaths(String folderName) {
        //create a list of <strings> with the file paths
        List<String> fileList = null;

        //return list of .csv file directories
        return fileList;
    }
}
