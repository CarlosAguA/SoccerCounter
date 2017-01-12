package carlosdeveloper.com.soccercounter;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0 ;
    int foulsTeamA = 0 ;
    int foulsTeamB = 0 ;

    EditText et1 ;
    EditText et2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1) ;
        et2 = (EditText) findViewById(R.id.et2) ;
    }

    /*
     Displays the given score for Team A.
     */
    public void displayForTeamA(int score){
        TextView tv1 = (TextView) findViewById(R.id.score_a_tv);
        tv1.setText(String.valueOf(score));

    }

    /*
     Displays the given score for Team B.
     */
    public void displayForTeamB(int score){
        TextView tv2 = (TextView) findViewById(R.id.score_b_tv);
        tv2.setText(String.valueOf(score));

    }

    /*
     Change the score to +1 for Team A
     */
    public void addGoalA (View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }

    /*
     Change the score to +1 for Team B
     */
    public void addGoalB (View view){
        scoreTeamB = scoreTeamB + 1 ;
        displayForTeamB(scoreTeamB);

    }


   /*
    Add a foul to foulsTeamB
  */
    public void addFoulTeamB (View view){
        foulsTeamB= foulsTeamB+ 1 ;
        displayFoulForTeamB(foulsTeamB);
    }

    /*
     Add a foul to foulsTeamA
   */
    public void addFoulTeamA (View view){
        foulsTeamA= foulsTeamA+ 1 ;
        displayFoulForTeamA(foulsTeamA);
    }

    /*
     Displays fouls to foulsTeamA
   */
    public void displayFoulForTeamA(int foulsNumber){
        TextView foulsA = (TextView)findViewById(R.id.tv_fouls_a);
        foulsA.setText("Fouls: " + String.valueOf(foulsNumber));
    }

    /*
     Displays fouls to foulsTeamB
   */
    public void displayFoulForTeamB(int foulsNumber){
        TextView foulsB = (TextView)findViewById(R.id.tv_fouls_b);
        foulsB.setText("Fouls: " + String.valueOf(foulsNumber));
    }


    /*
     Creates a Match object and gets as an argument the inputs from EditText to show the team names
     @param view from onClickListener for button start.
     */
    public void start (View view){
        Match match = new Match (et1.getText().toString(), et2.getText().toString()) ;
        TextView tv1 = (TextView) findViewById(R.id.tv_teamA) ;
        TextView tv2 = (TextView) findViewById(R.id.tv_team_b) ;
        tv1.setText(match.getTeamA());
        tv2.setText(match.getTeamB());
        et1.setVisibility(View.GONE); // Hide editText 2
        et2.setVisibility(View.GONE); // Hide editText 1

    }

    /*
     Sets and displays the scores to zero and shows the inputs to show the team names again
      @param view
     */
    public void reset (View view){

        scoreTeamA = 0 ;
        scoreTeamB = 0 ;
        foulsTeamB = 0 ;
        foulsTeamA = 0 ;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulForTeamA(foulsTeamA);
        displayFoulForTeamB(foulsTeamB);
        et1.setVisibility(View.VISIBLE); // Show editText 1
        et2.setVisibility(View.VISIBLE);// Show editText 2

    }


}
