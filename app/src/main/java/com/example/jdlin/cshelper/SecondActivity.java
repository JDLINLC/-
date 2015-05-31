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
            "阿里集团副总裁涂子沛报告会",
            "Dennis K. Peters学术报告",
            "关于举办计算机科学前沿高端学术论坛的通知",
            "新加坡国立大学苏州研究院陈朝成教授学术报告通知",
            "新加坡管理大学朱飞达教授学术报告",
    };
    private String[] content = new String[]{
            "计算机学院将于6月12日全天安排四组同学学院答辩，学生成员由随机抽取和各所（中心）答辩小组后三位组成，另外，拟申报学校和湖北省优秀毕业设计的同学集中一组答辩。答辩前请各位指导老师将该生的论文评语和成绩单独A4纸，报到学院教务科供专家组老师参考。请同学们准备好10分钟的PPT，主要阐述自己所做的工作；带上形式审查合格的毕业论文资料袋：包括文献译文原文、文献综述、开题报告、开题答辩记录、毕业设计（论文）学生日志和论文（含任务书）；另外再打印两本论文供答辩老师查阅，于6月12日（15周周五）上午7点50分到达指定的地点。具体学生名单将于6月5日和6月11日分2次公布",
            "应计算机学院邀请，我院校友涂子沛，现为阿里集团副总裁，《大数据》、《数据之巅》等畅销书的作者，今天回母校交流。分享其18年中美职业生涯，畅聊大数据的前世今生，解密阿里数据战略，寻找时代的数据英雄。欢迎各位老师参加！\n" +
                    "\n" +
                    "题目：万众创新：寻找数据时代的英\n" +
                    "\n" +
                    "时间：2015年04月16日19:00～21:30\n" +
                    "\n" +
                    "地点：华中科技大学机械学院报告厅\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "涂子沛简介\n" +
                    "\n" +
                    "著名信息管理专家，《大数据》、《数据之巅》作者现任阿里巴巴集团副总裁。\n" +
                    "\n" +
                    "本科毕业于华中科技大学计算机系，曾在广东省武警边防部队、广州市政府工作10年，期间开发过全国第一个反偷渡遣返信息管理系统，担任过边防巡逻艇的指挥官，多次立功受奖。2006 年赴美留学，获卡内基梅隆大学公共管理硕士、信息科学硕士学位。在美期间，历任软件公司的数据仓库程序员、数据部门经理、数据中心主任、亚太事务总监、首席研究员等职务。\n" +
                    "\n" +
                    "2014 年12月从硅谷回国，出任阿里巴巴集团副总裁，是阿里巴巴大数据创新机构IDST的主要负责人。\n" +
                    "\n" +
                    "2012 年7 月出版的《大数据》是中国大数据领域第一本著作，引领了中国社会对大数据战略、数据治国和开放数据的讨论。该书先后获得国家图书馆文津图书奖、第四届中国软科学前沿探索奖、2012 年度十大好书等奖项。现任国务院副总理汪洋先生曾发表长篇讲话推荐《大数据》。\n" +
                    "\n" +
                    "2014 年5 月出版的《数据之巅》一书对大数据追根溯源，全面回顾了数据文明和数据技术兴起的历史，并提出中国社会要将大数据这个科技符号转变为文化符号。该书被评价为“为华文世界开创一个重要的话题、开拓一片新的文化园地”。2014 年8 月，被中央国家机关工委列为中央国家机关“强素质 作表率”读书活动推荐书目，并获得2014 年度中信出版社最佳畅销书奖。另担任上海真爱梦想公益基金会理事、中国旅美科技协会副主席、中国旅美科技协会匹兹堡分会主席等社会职务。",
            "学术报告\n" +
                    "题目: Parallel and Distributed Systems for High Performance Computing with applications in Marine Simulation\n" +
                    "报告人：Dennis K. Peters\n" +
                    "时间：2015年4月2日（星期四）下午3：15－4：30\n" +
                    "地点：南一楼433计算机学院会议室\n" +
                    "\n" +
                    "欢迎参加!\n" +
                    "\n" +
                    "计算机学院\n" +
                    "                                                                                                二o一五年三月三十日\n" +
                    "\n" +
                    "报告摘要：Memorial University has an international reputation as a leader in ocean technology research and development, particularly as it applies to harsh environments, and a key element of this success is the Faculty of Engineering and Applied Science. One important aspect of our research is the use of advanced computer simulations for design analysis, real-time training systems and for scenario exploration, which requires that the simulations run much faster than real-time. This talk will present some of the unique computing challenges involved in these systems and discuss how we solve them using parallel and distributed architectures, including multi-core CPU, workstation clusters and general purpose computing on graphics processing units (GPGPU). The talk will also include some information about academic study opportunities at Memorial University.\n" +
                    "\n" +
                    "报告人简介：Dennis K. Peters, P.Eng., Ph.D., FEC is an Associate Professor and Head of Electrical and Computer Engineering at Memorial University in St. John’s, NL, Canada where he has been a member of Faculty since 1998. He earned the B.Eng. (Electrical) degree at Memorial University in 1990, before going to work in the high-tech industry at Newbridge Networks (now Alcatel) in Ottawa, Ontario. After two years in industry he returned to school, this time at McMaster University in Hamilton, Ontario where he completed the M.Eng. (Electrical & Computer) in 1995 and Ph.D. (Electrical & Computer Engineering) in 2000. His research involves techniques for design and verification of software and computer systems, with particular focus on high performance computing, simulation, real-time applications and parallel or distributed processing.\n" +
                    " \n" +
                    "Dr. Peters is an active volunteer in the professional engineering community in Canada. He is currently the Chair of the Board of Directors of the Professional Engineers and Geoscientists of Newfoundland and Labrador (PEGNL), and serves (2008-present) on the Canadian Engineering Qualifications Board (CEQB), where he chairs committees on Good Character Assessment and Software Engineering and participates in several others. He was a member (2002-13) of the Registration Committee for PEGNL, including the last 7 years as chair. He is a member (1999-present) of the executive committee for the Newfoundland and Labrador Section of the IEEE, including a term as Chair and currently serving as Student Branch Counselor. He has participated in accreditation visits for the Canadian Engineering Accreditation Board (CEQB) and has served on the organizational committees for local, national and international conferences.\n" +
                    " \n" +
                    "His teaching activity is primarily in the area of software, ranging from introductory programming courses to advanced topics such as software engineering and concurrent programming.\n" +
                    "\n" +
                    "Here is a brief introduction of our Faculty of Engineering and Applied Science at Memorial:\n" +
                    "The faculty provides the highest quality of education, through teaching and research excellence, vibrant educational environment and innovative programs. Many faculty members are internationally renowned and award-winning professors in their respective fields of research. Our faculty offers accredited undergraduate, master's and doctoral programs in civil, computer, electrical, mechanical, oceans and naval architectural engineering (unique in Canada) and process engineering. Further course-based graduate programs are offered in oil and gas, environmental systems, computer engineering and engineering management. In total, these programs are offered to approximately 1,600 undergraduate and graduate students…more details in www.engr.mun.ca.",
            "学院全体教师、研究生：\n" +
                    "应计算机学院的邀请北京大学高文教授，将于10月29日来我院作计算机科学前沿高端学术论坛学术报告，欢迎大家参加。\n" +
                    "\n" +
                    "一、题目：监控视频处理技术\n" +
                    "\n" +
                    "二、会议时间\n" +
                    "2014年10月29日（周三）15：00\n" +
                    "三、会议地点\n" +
                    "八号楼三楼学术报告厅\n" +
                    "\n" +
                    "四、参加人员\n" +
                    "1、全体院领导；\n" +
                    "\n" +
                    "2、各团队负责人；\n" +
                    "3、各所负责人、支部书记、分管教学、科研的副所长；\n" +
                    "4、有关教师和研究生；\n" +
                    "\n" +
                    "五、有关说明\n" +
                    "\n" +
                    "欢迎有兴趣的全院教职员工参加，各所按照会议布置的要求安排参加人员。\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "计算机学院\n" +
                    "\n" +
                    "2014年10月27日\n" +
                    "\n" +
                    "报告内容：\n" +
                    "\n" +
                    "视频分析与视频编码是城市视频监控系统中的核心关键技术，前者可以帮助交通调度智慧、探知事故和突发事件等，后者可以节省视频数据网络传输和存储成本等。本报告将讨论视频分析与视频编码技术主要挑战以及最新进展。\n" +
                    "\n" +
                    "高文教授简介：\n" +
                    "\n" +
                    "        高文，1991年毕业于日本东京大学，获电子工程学博士学位。1991年至1995年，哈尔滨工业大学教授；1996年至2005年，中国科学院计算技术研究所研究员；2006年至今，北京大学教授；2013年起，兼任国家自然科学基金委员会副主任。\n" +
                    "\n" +
                    "长期从事计算机应用技术研究，在高效视频编解码算法与标准化、图像检索技术、视频分析技术、人脸识别技术、手语识别技术等方面做出重要贡献，先后获国家技术发明二等奖1项、国家科技进步二等奖5项。2010年，因“音视频编解码理论、标准及应用的突出成就”被授予中国计算机学会王选奖。中国工程院院士，IEEE Fellow，ACM Fellow。\n" +
                    "\n" +
                    "\n",
            " 应计算机学院邀请，新加坡国立大学苏州研究院陈朝成教授来我院讲学，欢迎大家参加。\n" +
                    " 题目：图形处理及几何学\n" +
                    "\n" +
                    " 时间：2014年10月13日9：30分\n" +
                    "\n" +
                    " 地点：计算机学院会议室（南一楼西433）\n" +
                    "\n" +
                    "\n" +
                    "概要：GPU图形处理器现已不仅局限于其原有的功能，在显卡上也得到了广泛的运用。在商业应用上，它执行了综合的并行计算，从而可以以低成本最大化的提升处理速度。计算几何学研究几何对象的运算，应用于科学计算及娱乐（例如在游戏中的地形模型及冲突检测）方面。此次讲座将首先回顾GPU编程及计算几何学的基础知识，其次探讨运用图形处理器来解决及加速处理几何方面的难题（如凸核、泰森多边形、狄洛尼三角剖分等等），还将探讨运用图形处理器在解决几何问题时面临的主要挑战。\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "主讲人简介:陈朝成教授，新加坡国立大学苏州研究院（新国大苏研院）常务副院长。他所主管的教育与培训部门为新加坡国立大学和世界各地的大学生举办学术交流活动，为中国大学生开展短期培训课程，并为高校、政府和企业提供高端培训项目（包括公共行政、社会管理、城镇规划建设、房地产分析等课程）。\n" +
                    "\n" +
                    "陈教授也是新国大计算机学院的一名教授，博导。先后两次获得新国大优秀教学奖。长期以来，他积极帮助学生扩展视野和提高能力，例如与计算机学院校友会合作开展学生课外活动，以及为学生参与学院教研工作提供机会。在他近年任职计算机学院副院长（主管研究生教育）期间，陈教授负责管理研究生的学习和福利，并为招收研究生和深入了解他国教育系统而频繁访问亚洲及欧洲地区。\n" +
                    "\n" +
                    "陈教授在美国伊利诺伊大学香槟分校获得博士学位。他的研究小组致力于几何算法，交互式图形，图形处理器编程以及游戏应用程序；其研究成果多次发表于国际顶级计算机会议和期刊上。小组关于实时阴影和图形处理器的软件技术被广泛应用于科研和工业中。陈教授拥有五项美国及新加坡专利。由于他对数字媒体的突出贡献，陈教授目前担任新加坡媒体发展管理局小组成员，对数字媒体项目的拨款进行评估。",
            "学术报告通知\n" +
                    "应学院邀请，新加坡管理大学信息系统学院朱飞达教授将于9月19号上午9点在学院会议室做学术报告，热忱欢迎参加。\n" +
                    "\n" +
                    "报告题目: Social media mining and analysis for business, consumer and social insights\n" +
                    "\n" +
                    "主要内容: The recent blossom of social network services has provided every one with an unprecedented level of ease and fun of sharing information of all sorts.  These public social data therefore reveal a surprisingly large amount of information about an individual which is otherwise unavailable. Moreover, the real-time nature of platforms such as Twitter has made them the most important and timely sources to capture viral topics of mass interest, or even the lifeline for millions in midst of natural disasters. The business, consumer and social insights attainable from this big and dynamic social data are critically important and immensely valuable in a wide range of applications for both private and public sectors. Central to this task are two research challenges of equal importance which complement and inform each other: user profiling and event profiling.  In this talk, we will explore a few important topics in this task including network-based user modeling, cross-platform user identity linkage, real-time event detection and profiling.",
    };
    private String[] time = new String[]{
            "2015-05-26",
            "2015-04-16",
            "2015-03-30",
            "2015-02-06",
            "2014-10-10",
            "2014-09-16",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
