//Matthew Whalley
//Summer 2016
//CS1301
//Skinner
//Lab_14_2

import java.util.Calendar;

public class Time{

   private int hour;
   private int minute;
   private int second;
   
   public Time(){
      //Creates calendar and gets hour minute and second
      Calendar calendar = Calendar.getInstance();
      hour = calendar.get(Calendar.HOUR_OF_DAY);
      minute = calendar.get(Calendar.MINUTE);
      second = calendar.get(Calendar.SECOND);
   }
   //Calculate the hour minute and second
   public Time(long time){
      long timeInSec = time / 1000L;
      second = (int)(timeInSec % 60);
      timeInSec = timeInSec / 60L;
      minute = (int)(timeInSec % 60);
      timeInSec = timeInSec / 60L;
      hour = (int)(timeInSec % 24);
   }
   //gets the hour
   public int getHour(){
      return hour;
   }
   //gets the minute
   public int getMinute(){
      return minute;
   }
   //gets the second
   public int getSecond(){
      return second;
   }
   //Same as above
   public void setTime(long elapseTime){
       long timeInSec = elapseTime / 1000L;
      second = (int)(timeInSec % 60);
      timeInSec = timeInSec / 60L;
      minute = (int)(timeInSec % 60);
      timeInSec = timeInSec / 60L;
      hour = (int)(timeInSec % 24);
   }
   //ToString method so everything looks nice
   public String toString(){
      return hour + ":" + minute + ":" + second;
   }
}