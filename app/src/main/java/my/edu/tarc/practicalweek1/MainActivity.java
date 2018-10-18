package my.edu.tarc.practicalweek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMsg;  //TextView = a class
    //textViewMsg = instance
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate() = main() function
        super.onCreate(savedInstanceState);
        //Display UI
        //R = resource class
        //layout = is a folder
        setContentView(R.layout.activity_main);

        //Link UI to program
        textViewMsg = findViewById(R.id.textViewMessage);

    }

    public void showMessage(View view){
        textViewMsg.setText("Hello, Bakugo young boy");
    }

    public void clearMessage(View view){
        textViewMsg.setText("");
    }
}
