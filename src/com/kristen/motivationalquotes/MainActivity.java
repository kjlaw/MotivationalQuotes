package com.kristen.motivationalquotes;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private MotivationalQuote mMotivationalQuote = new MotivationalQuote();
	private TextView mQuoteText;
	private Button mButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Assign the Views from the layout file
        mQuoteText = (TextView) findViewById(R.id.textView1);
        mButton = (Button) findViewById(R.id.button1);
        
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                handleNewQuote();
            }
        });
	}
	
	private void animateQuote() {
		//Create some Animations
    	AlphaAnimation fadeInAnimation = new AlphaAnimation(0, 1);
    	fadeInAnimation.setDuration(1500);
    	fadeInAnimation.setFillAfter(true);
    	
    	ScaleAnimation zoomOutAnimation = new ScaleAnimation((float)0.3, (float)1.0, (float)0.3, (float)1.0);
    	zoomOutAnimation.setDuration(1500);
    	zoomOutAnimation.setFillAfter(true);
    	
    	TranslateAnimation moveAnimation = new TranslateAnimation((float)0, (float)0, (float)-1000, (float)0);
    	moveAnimation.setDuration(1500);
    	moveAnimation.setFillAfter(true);
    	
    	RotateAnimation hingeAnimation = new RotateAnimation(-720, 0);
    	hingeAnimation.setDuration(1500);
    	hingeAnimation.setFillAfter(true);
    	
    	//Add Animations to an array
    	Animation[] animationArray = {fadeInAnimation, zoomOutAnimation, moveAnimation, hingeAnimation};

    	//Randomly choose one of the animations in the array to execute
    	Random randomGenerator = new Random(); // Construct a new Random number generator
    	int randomNumber = randomGenerator.nextInt(animationArray.length);
    	mQuoteText.setAnimation(animationArray[randomNumber]);
	}
	
	private void handleNewQuote() {
	
		String quote = mMotivationalQuote.getAQuote();
					
		// Update the label with our dynamic answer
		mQuoteText.setText(quote);
					
		animateQuote();					
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
