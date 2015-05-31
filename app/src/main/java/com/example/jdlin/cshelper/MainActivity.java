package com.example.jdlin.cshelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "更新中", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ArrayList<HashMap<String, Object>> IstImageItem = new ArrayList<HashMap<String, Object>>();

        HashMap<String, Object> map1 = new HashMap<String, Object>();
        map1.put("ItemImage", R.mipmap.part1);
        map1.put("ItemText", "校内新闻");
        IstImageItem.add(map1);
        HashMap<String, Object> map2 = new HashMap<String, Object>();
        map2.put("ItemImage", R.mipmap.part2);
        map2.put("ItemText", "院系通知");
        IstImageItem.add(map2);
        HashMap<String, Object> map3 = new HashMap<String, Object>();
        map3.put("ItemImage", R.mipmap.part3);
        map3.put("ItemText", "失物招领");
        IstImageItem.add(map3);
        HashMap<String, Object> map4 = new HashMap<String, Object>();
        map4.put("ItemImage", R.mipmap.part4);
        map4.put("ItemText", "扫码签到");
        IstImageItem.add(map4);
        HashMap<String, Object> map5 = new HashMap<String, Object>();
        map5.put("ItemImage", R.mipmap.part5);
        map5.put("ItemText", "吐槽水贴");
        IstImageItem.add(map5);
        HashMap<String, Object> map6 = new HashMap<String, Object>();
        map6.put("ItemImage", R.mipmap.part6);
        map6.put("ItemText", "更多反馈");
        IstImageItem.add(map6);

        SimpleAdapter saImageItems = new SimpleAdapter(this, IstImageItem, R.layout.item_main, new String[]{"ItemImage", "ItemText"}, new int[]{R.id.ItemImage, R.id.ItemText});
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
