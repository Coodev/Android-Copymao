package don.com.flickresque;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import adapter.ExCardViewAdapter;


public class MainActivity extends ActionBarActivity {

    private RecyclerView exRecyclerView;
    private RecyclerView.Adapter exAdapter;
    private RecyclerView.LayoutManager exLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Material Design Toolbar(Actionbar)
        Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        if (toolbar != null)
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("Flickresque");

        // Dataset
        String[] dataset = { "Santa", "Clara", "University", "Flickresque", "Built", "By", "Don"
        , "Santa", "Clara", "University", "Flickresque", "Built", "By", "Don"};

        // Explore RecyclerView
        exRecyclerView = (RecyclerView)findViewById(R.id.explore_recycler_view);
        exLayoutManager = new LinearLayoutManager(this);
        exRecyclerView.setLayoutManager(exLayoutManager);

        exAdapter = new ExCardViewAdapter(dataset);
        exRecyclerView.setAdapter(exAdapter);

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
}