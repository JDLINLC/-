package com.example.jdlin.cshelper;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondActivity extends ActionBarActivity {
    private String[] title = new String[]{"1[置顶]", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private String[] content = new String[]{"content1", "content2", "content3", "content4", "content5", "content6", "content7", "content8", "content9", "content10"};
    private String[] time = new String[]{"2015.5", "2015.5", "2015.5", "2015.5", "2015.5", "2015.5", "2015.5", "2015.5", "2015.5", "2015.5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        GridView gridView_news = (GridView) findViewById(R.id.gridview_news);
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < title.length; i++) {
            Map<String, Object> listItem = new HashMap<>();
            listItem.put("title", title[i]);
            listItem.put("content", content[i]);
            listItem.put("time", time[i]);
            listItems.add(listItem);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems, R.layout.item_news, new String[]{"title", "content", "time"}, new int[]{R.id.news_text_title, R.id.news_text_content, R.id.news_text_time});
        gridView_news.setAdapter(simpleAdapter);
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
