/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fet;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author admin
 */
public class Exam {
    public String courseCode;
    public int duration;
    public Timer timer;
    public boolean acceptanceStatus;
    public String releaseDate;
    public String instructorName;
    public int totalGrades;
    public ArrayList<Question> questions;
    public ArrayList<Announcement> announcements;
    

    public Exam(int duration, Timer timer, boolean acceptanceStatus, String releaseDate, String instructorName, int totalGrades, ArrayList<Question> questions, ArrayList<Announcement> announcements) {
        this.duration = duration;
        this.timer = timer;
        this.acceptanceStatus = acceptanceStatus;
        this.releaseDate = releaseDate;
        this.instructorName = instructorName;
        this.totalGrades = totalGrades;
        this.questions= questions;
        this.announcements= announcements;
    }

   
    }
    
    
    
     
    
    
    
    

