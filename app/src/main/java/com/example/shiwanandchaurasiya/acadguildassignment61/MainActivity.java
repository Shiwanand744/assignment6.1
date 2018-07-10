package com.example.shiwanandchaurasiya.acadguildassignment61;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
/*
  This is the main Activity means the launcher activity of our Application.And through this activity we are showing the UI
*/
/*
 * This activity is extending AppCompatActivity to make this activity compatible with backword
 * */
public class MainActivity extends AppCompatActivity {
    /*
     * Creating object of EditText
     * */
    EditText userName,password;

    /*
   @Override means this is an overrriden method of the Activity LifeCycle and this call back is used to create the UI of the Acivity.
   @return This method is not returning anything as it's return type is void.
   @Param This method is taking the Bundle's instance as an arguement named as savedInstanceState used to fetch the details sent by another activity or method.
   This method is responsible for initializing all the views and setting the content view through the layout file.

   */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
         * setContentView is method to bind layout xml file with activity
         * */
        setContentView(R.layout.activity_main);

        //initializing edit texts using findViewById
        userName = (EditText)findViewById(R.id.user_email);
        password = (EditText)findViewById(R.id.user_pass);
    }
//Definition of method which will be called on Button clicked
    public void performLogin(View view) {
        if(userName.getText().toString().equals("shiwanand744@gmail.com") && password.getText().toString().equals("shiwanand")){
            Toast.makeText(this, "LogIn successfully!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "LogIn failed!", Toast.LENGTH_SHORT).show();
        }
    }
}
