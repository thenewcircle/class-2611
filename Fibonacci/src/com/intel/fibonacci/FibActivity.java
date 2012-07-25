package com.intel.fibonacci;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FibActivity extends Activity {
	EditText input;
	TextView output;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fib);
        
        input = (EditText) findViewById(R.id.input);
        output = (TextView) findViewById(R.id.output);
    }

    public void onButtonClick(View v) {
    		long n = Long.parseLong( input.getText().toString() );

/*
    		// Java Recursive
    		long start = System.currentTimeMillis();
    		long resultJ = FibLib.fibJ(n);
    		long timeJ = System.currentTimeMillis() - start;
    		output.append( String.format("\nfibJ(%d)=%d (%d ms)", n, resultJ, timeJ) );

    		// Native Recursive
    		start = System.currentTimeMillis();
    		long resultN = FibLib.fibN(n);
    		long timeN = System.currentTimeMillis() - start;
    		output.append( String.format("\nfibN(%d)=%d (%d ms)", n, resultN, timeN) );
*/
    		
    		// Java Iterative
    		long start = System.nanoTime();
    		long resultJI = FibLib.fibJI(n);
    		long timeJI = System.nanoTime() - start;
    		output.setText( String.format("\nfibJI(%d)=%d (%d ms)", n, resultJI, timeJI) );

    		// Native Iterative
    		start = System.nanoTime();
    		long resultNI = FibLib.fibNI(n);
    		long timeNI = System.nanoTime() - start;
    		output.append( String.format("\nfibNI(%d)=%d (%d ms)", n, resultNI, timeNI) );

    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_fib, menu);
        return true;
    }

    
}
