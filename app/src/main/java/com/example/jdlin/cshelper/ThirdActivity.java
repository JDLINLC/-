package com.example.jdlin.cshelper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThirdActivity extends ActionBarActivity {
    private Toolbar toolbar;

    public static void actionStart(Context context, String newsTitle, String newsContent, String newsTime) {
        Intent intent = new Intent(context, ThirdActivity.class);
        intent.putExtra("news_title", newsTitle);
        intent.putExtra("news_content", newsContent);
        intent.putExtra("news_time", newsTime);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String newsTitle = getIntent().getStringExtra("news_title");
        String newsContent = getIntent().getStringExtra("news_content");
        String newsTime = getIntent().getStringExtra("news_time");
        final GridView gridView_news = (GridView) findViewById(R.id.gridview_news);
        List<Map<String, Object>> listItems = new ArrayList<>();

        Map<String, Object> listItem = new HashMap<>();
        listItem.put("title", newsTitle);
        listItem.put("content", newsContent);
        listItem.put("time", newsTime);
        listItems.add(listItem);

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems, R.layout.item_content, new String[]{"title", "content", "time"}, new int[]{R.id.news_text_title, R.id.news_text_content, R.id.news_text_time});
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