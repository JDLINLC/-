package com.example.jdlin.cshelper;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondActivity extends AppCompatActivity {
    private String[] title = new String[]{
            "关于计算机学院2011级本科生专家组答辩的通知",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10"
    };
    private String[] content = new String[]{
            "计算机学院将于6月12日全天安排四组同学学院答辩，学生成员由随机抽取和各所（中心）答辩小组后三位组成，另外，拟申报学校和湖北省优秀毕业设计的同学集中一组答辩。答辩前请各位指导老师将该生的论文评语和成绩单独A4纸，报到学院教务科供专家组老师参考。请同学们准备好10分钟的PPT，主要阐述自己所做的工作；带上形式审查合格的毕业论文资料袋：包括文献译文原文、文献综述、开题报告、开题答辩记录、毕业设计（论文）学生日志和论文（含任务书）；另外再打印两本论文供答辩老师查阅，于6月12日（15周周五）上午7点50分到达指定的地点。具体学生名单将于6月5日和6月11日分2次公布",
            "content2",
            "content3",
            "content4",
            "content5",
            "content6",
            "content7",
            "content8",
            "content9",
            "content10"
    };
    private String[] time = new String[]{
            "2015-05-26",
            "2015.5",
            "2015.5",
            "2015.5",
            "2015.5",
            "2015.5",
            "2015.5",
            "2015.5",
            "2015.5",
            "2015.5"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        GridView gridView_news = (GridView) findViewById(R.id.gridview_news);
        List<Map<String, Object>> listItems = new ArrayList<>();
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
