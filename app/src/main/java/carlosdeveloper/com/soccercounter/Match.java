package carlosdeveloper.com.soccercounter;

import android.content.SharedPreferences;

/**
 * Created by Paviliondm4 on 1/12/2017.
 */

public class Match {

    private String teamA ;
    private String teamB ;

    /*
    Constructs a match with two given teams
     */
    public Match (String teamA , String teamB) {

        this.teamA = teamA ;
        this.teamB = teamB ;
    }

    /*
      gets the name of Team A
     */
    public String getTeamA (){
        return teamA;
    }


    /*
    gets the name of Team B
     */
    public String getTeamB(){
        return teamB;
    }
}
