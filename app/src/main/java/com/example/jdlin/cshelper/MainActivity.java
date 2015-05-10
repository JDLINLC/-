package com.example.jdlin.cshelper;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends ActionBarActivity{
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setLogo(R.drawable.menu1);
        toolbar.setTitle(R.string.title);
        setSupportActionBar(toolbar);
        GridView gridView = (GridView)findViewById(R.id.gridview);
        ArrayList<HashMap<String,Object>>IstImageItem = new ArrayList<HashMap<String,Object>>();

        HashMap<String,Object> map1 =new HashMap<String,Object>();
        map1.put("ItemImage",R.mipmap.part1);
        map1.put("ItemText", "校内新闻");
        IstImageItem.add(map1);
        HashMap<String,Object> map2 =new HashMap<String,Object>();
        map2.put("ItemImage",R.mipmap.part2);
        map2.put("ItemText", "院系通知");
        IstImageItem.add(map2);
        HashMap<String,Object> map3 =new HashMap<String,Object>();
        map3.put("ItemImage",R.mipmap.part3);
        map3.put("ItemText", "失物招领");
        IstImageItem.add(map3);
        HashMap<String,Object> map4 =new HashMap<String,Object>();
        map4.put("ItemImage",R.mipmap.part4);
        map4.put("ItemText", "吐槽水贴");
        IstImageItem.add(map4);
        HashMap<String,Object> map5 =new HashMap<String,Object>();
        map5.put("ItemImage",R.mipmap.part5);
        map5.put("ItemText", "吐槽水贴");
        IstImageItem.add(map5);
        HashMap<String,Object> map6 =new HashMap<String,Object>();
        map6.put("ItemImage",R.mipmap.part6);
        map6.put("ItemText", "吐槽水贴");
        IstImageItem.add(map6);

        SimpleAdapter saImageItems = new SimpleAdapter(this,IstImageItem,R.layout.item,new String[]{"ItemImage","ItemText"},new int[]{R.id.ItemImage,R.id.ItemText});
        gridView.setAdapter(saImageItems);
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
