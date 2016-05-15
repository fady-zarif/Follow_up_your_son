package com.example.foda_.follow_your_son;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.backendless.Backendless;

public class MainActivity extends AppCompatActivity implements
       Teacher.OnFragmentInteractionListener ,Parent.OnFragmentInteractionListener{
    public static  final  String APP_ID="6EDD4F2D-E780-9B9C-FF5D-21F589050F00";
    public static  final  String SECRET_KEY="1080B66F-1977-2C4C-FF6D-AC073506E700";
    public static  final  String VERSION="V1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Backendless.initApp(this,APP_ID,SECRET_KEY,VERSION);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new MainActivityFragment()).commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }



}
