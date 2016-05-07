package jforde.mynanodegreeapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AppLauncher{
    //These fields are for my toast
    private int duration = Toast.LENGTH_SHORT;
    private Toast toast;

    private TextView myNanodegreeTxt;
    private Button popularMoviesBtn;
    private Button stockHawkBtn;
    private Button buildItBiggerBtn;
    private Button materialBtn;
    private Button ubiquitousBtn;
    private Button capstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        popularMoviesBtn = (Button) findViewById(R.id.popular_movies);
        stockHawkBtn = (Button) findViewById(R.id.stock_hawk);
        buildItBiggerBtn = (Button)findViewById(R.id.build_it_bigger);
        materialBtn = (Button)findViewById(R.id.make_your_app_material);
        ubiquitousBtn = (Button) findViewById(R.id.go_ubiquitous);
        capstoneBtn = (Button)findViewById(R.id.capstone);

        setSupportActionBar(toolbar);
        myNanodegreeTxt = (TextView) findViewById(R.id.my_nanodegree_apps);

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
    public void openCapstoneApp(View v) {
        CharSequence placeholderText = "Stay tuned for my Capstone app!";
        toast = Toast.makeText(getApplicationContext(), placeholderText, duration);
        toast.show();
    }

    @Override
    public void openUbiqApp(View v) {
        CharSequence placeholderText = "Stay tuned for my Go Ubiquitous app!";
        toast = Toast.makeText(getApplicationContext(), placeholderText, duration);
        toast.show();
    }

    @Override
    public void openMaterialApp(View v) {
        CharSequence placeholderText = "Stay tuned for my Material app!";
        toast = Toast.makeText(getApplicationContext(), placeholderText, duration);
        toast.show();
    }

    @Override
    public void openBiggerApp(View v) {
        CharSequence placeholderText = "Stay tuned for my Build it Bigger app!";
        toast = Toast.makeText(getApplicationContext(), placeholderText, duration);
        toast.show();
    }

    @Override
    public void openStockApp(View v) {
        CharSequence placeholderText = "Stay tuned for my Stock Hawk app!";
        toast = Toast.makeText(getApplicationContext(), placeholderText, duration);
        toast.show();
    }

    @Override
    public void openMovieApp(View v) {
        CharSequence placeholderText = "Stay tuned for my Popular Movies app!";
        toast = Toast.makeText(getApplicationContext(), placeholderText, duration);
        toast.show();
    }
}
