package fabiotavares.com.br.lifecountermtg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int totalOpponentLife = 20;
    private int totalOpponentPoison = 0;
    private int totalYourLife = 20;
    private int totalYourPoison = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given total Life for Opponent.
     */
    public void displayForOpponentLife(int score) {
        TextView scoreView = findViewById(R.id.opponentLife);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given total Poison for Opponent.
     */
    public void displayForOpponentPoison(int score) {
        TextView scoreView = findViewById(R.id.opponentPoison);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given total Life for Your.
     */
    public void displayForYourLife(int score) {
        TextView scoreView = findViewById(R.id.yourLife);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given total Poison for Your.
     */
    public void displayForYourPoison(int score) {
        TextView scoreView = findViewById(R.id.yourPoison);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase one the poison counter for Opponent.
     */
    public void addOnePoisonForOpponent(View view) {
        totalOpponentPoison = totalOpponentPoison + 1;
        displayForOpponentPoison(totalOpponentPoison);
    }

    /**
     * Decrease one the poison counter for Your.
     */
    public void removeOnePoisonForOpponent(View view) {
        totalOpponentPoison = totalOpponentPoison - 1;
        displayForOpponentPoison(totalOpponentPoison);
    }

    /**
     * Increase one the poison counter for Your.
     */
    public void addOnePoisonForYour(View view) {
        totalYourPoison = totalYourPoison + 1;
        displayForYourPoison(totalYourPoison);
    }

    /**
     * Decrease one the poison counter for Opponent.
     */
    public void removeOnePoisonForYour(View view) {
        totalYourPoison = totalYourPoison - 1;
        displayForYourPoison(totalYourPoison);
    }


    /**
     * Increase one Life for Opponent.
     */
    public void addOneLifeForOpponent(View view) {
        totalOpponentLife = totalOpponentLife + 1;
        displayForOpponentLife(totalOpponentLife);
    }

    /**
     * Decrease one Life for Your.
     */
    public void removeOneLifeForOpponent(View view) {
        totalOpponentLife = totalOpponentLife - 1;
        displayForOpponentLife(totalOpponentLife);
    }

    /**
     * Increase one Life for Your.
     */
    public void addOneLifeForYour(View view) {
        totalYourLife = totalYourLife + 1;
        displayForYourLife(totalYourLife);
    }

    /**
     * Decrease one Life for Your.
     */
    public void removeOneLifeForYour(View view) {
        totalYourLife = totalYourLife - 1;
        displayForYourLife(totalYourLife);
    }

    /**
     * Increase one Life for Your.
     */
    public void addFiveLifeForYour(View view) {
        totalYourLife = totalYourLife + 5;
        displayForYourLife(totalYourLife);
    }

    /**
     * Decrease five Life for Your.
     */
    public void removeFiveLifeForYour(View view) {
        totalYourLife = totalYourLife - 5;
        displayForYourLife(totalYourLife);
    }

    /**
     * Increase five Life for Opponent.
     */
    public void addFiveLifeForOpponent(View view) {
        totalOpponentLife = totalOpponentLife + 5;
        displayForOpponentLife(totalOpponentLife);
    }

    /**
     * Decrease five Life for Your.
     */
    public void removeFiveLifeForOpponent(View view) {
        totalOpponentLife = totalOpponentLife - 5;
        displayForOpponentLife(totalOpponentLife);
    }


    /**
     * Displays the reset the game.
     */
    public void resetGame(View view) {
        totalOpponentLife = 20;
        totalOpponentPoison = 0;
        totalYourLife = 20;
        totalYourPoison = 0;
        displayForOpponentLife(totalOpponentLife);
        displayForOpponentPoison(totalOpponentPoison);
        displayForYourLife(totalYourLife);
        displayForYourPoison(totalYourPoison);
    }
}
