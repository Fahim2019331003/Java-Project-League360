package com.example.league360;

public class FormChecker {

    public static String TournamentName;
    public static String SportName;
    public static int GroupNumber=0;
    public static int TeamNumber;
    public static int PlayerNumber;
    public static boolean checkform(String choiceSports)
    {
        if(TournamentName==null || choiceSports==null || GroupNumber==0){
            return false;
        }
        return true;
    }
}
