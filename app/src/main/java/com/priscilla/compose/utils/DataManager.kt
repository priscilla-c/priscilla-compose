package com.priscilla.compose.utils

import androidx.activity.ComponentActivity
import androidx.lifecycle.viewmodel.compose.viewModel
import com.priscilla.compose.R
import com.priscilla.compose.bean.URLGroupData
import com.priscilla.compose.bean.URLItemData
import com.priscilla.compose.bean.URLItemData_
import com.priscilla.compose.utils.Store.start
import com.priscilla.compose.viewmodel.MainViewModel

/**
 * Created by Priscilla Cheung on 2021年12月10日15:07:26
 * 用于数据的维护
 */
object DataManager {
    private var tabTitleList: List<String> = listOf("书籍", "收藏", "其他")
    private var tabResList: List<Int> =
        listOf(R.drawable.ic_book, R.drawable.ic_enshine, R.drawable.ic_custom)

    fun getTabTitleList(): List<String> = tabTitleList
    fun getTabResList(): List<Int> = tabResList
    fun createData() {
        if (Store.getAll<URLGroupData>().isEmpty())
            Store.put<URLGroupData>(
                listOf(
                    URLGroupData(title = "操作系统"),
                    URLGroupData(title = "智能系统"),
                    URLGroupData(title = "分布式系统"),
                    URLGroupData(title = "编译原理"),
                    URLGroupData(title = "函数式概念"),
                    URLGroupData(title = "计算机图形学"),
                    URLGroupData(title = "WEB服务器"),
                    URLGroupData(title = "版本控制"),
                    URLGroupData(title = "编辑器"),
                    URLGroupData(title = "NoSQL"),
                    URLGroupData(title = "PostgreSQL"),
                    URLGroupData(title = "MySQL"),
                    URLGroupData(title = "管理和监控"),
                    URLGroupData(title = "项目相关"),
                    URLGroupData(title = "设计模式"),
                    URLGroupData(title = "Web"),
                    URLGroupData(title = "大数据"),
                    URLGroupData(title = "编程艺术"),
                    URLGroupData(title = "Android"),
                    URLGroupData(title = "APP"),
                    URLGroupData(title = "AWK"),
                    URLGroupData(title = "C/C++"),
                    URLGroupData(title = "C#"),
                    URLGroupData(title = "Clojure"),
                    URLGroupData(title = "CSS/HTML"),
                    URLGroupData(title = "Dart"),
                    URLGroupData(title = "Elixir"),
                    URLGroupData(title = "Erlang"),
                    URLGroupData(title = "Fortran"),
                    URLGroupData(title = "Go"),
                    URLGroupData(title = "Groovy"),
                    URLGroupData(title = "Haskell"),
                    URLGroupData(title = "iOS"),
                    URLGroupData(title = "Java"),
                    URLGroupData(title = "JavaScript"),
                    URLGroupData(title = "Kotlin"),
                    URLGroupData(title = "LaTeX"),
                    URLGroupData(title = "LISP"),
                    URLGroupData(title = "Lua"),
                    URLGroupData(title = "OCaml"),
                    URLGroupData(title = "Perl"),
                    URLGroupData(title = "PHP"),
                    URLGroupData(title = "Prolog"),
                    URLGroupData(title = "Python"),
                    URLGroupData(title = "R"),
                    URLGroupData(title = "Ruby"),
                    URLGroupData(title = "Rust"),
                    URLGroupData(title = "Scala"),
                    URLGroupData(title = "Shell"),
                    URLGroupData(title = "Swift"),
                    URLGroupData(title = "读书笔记及其它")
                )
            )
        if (Store.getAll<URLItemData>().isEmpty())
            Store.put<URLItemData>(
                listOf(
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "开源世界旅行手册",
                        url = "http://i.linuxtoy.org/docs/guide/index.html"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "鸟哥的Linux私房菜",
                        url = "http://linux.vbird.org/"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "The Linux Command Line",
                        url = "http://billie66.github.io/TLCL/index.html"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "Linux 设备驱动",
                        url = "http://oss.org.cn/kernel-book/ldd3/index.html"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "UNIX TOOLBOX",
                        url = "http://cb.vu/unixtoolbox_zh_CN.xhtml"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "Docker中文指南",
                        url = "https://github.com/widuu/chinese_docker"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "Docker —— 从入门到实践",
                        url = "https://github.com/yeasy/docker_practice"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "Docker入门实战",
                        url = "http://yuedu.baidu.com/ebook/d817967416fc700abb68fca1"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "Docker Cheat Sheet",
                        url = "https://github.com/wsargent/docker-cheat-sheet/tree/master/zh-cn#docker-cheat-sheet"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "Mac 开发配置手册",
                        url = "https://aaaaaashu.gitbooks.io/mac-dev-setup/content/"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "FreeBSD 使用手册",
                        url = "https://www.freebsd.org/doc/zh_CN/books/handbook/index.html"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "Linux 命令行(中文版)",
                        url = "http://billie66.github.io/TLCL/book/"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "Linux 构建指南",
                        url = "http://works.jinbuguo.com/lfs/lfs62/index.html"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "Linux工具快速教程",
                        url = "https://github.com/me115/linuxtools_rst"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "Linux Documentation (中文版)",
                        url = "https://www.gitbook.com/book/tinylab/linux-doc/details"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "嵌入式 Linux 知识库 (eLinux.org 中文版)",
                        url = "https://www.gitbook.com/book/tinylab/elinux/details"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "理解Linux进程",
                        url = "https://github.com/tobegit3hub/understand_linux_process"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "命令行的艺术",
                        url = "https://github.com/jlevy/the-art-of-command-line/blob/master/README-zh.md"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "SystemTap新手指南",
                        url = "https://spacewander.gitbooks.io/systemtapbeginnersguide_zh/content/index.html"
                    ),
                    URLItemData(
                        groupTitle = "操作系统",
                        title = "操作系统思考",
                        url = "https://github.com/wizardforcel/think-os-zh"
                    ),
                    URLItemData(
                        groupTitle = "智能系统",
                        title = "一步步搭建物联网系统",
                        url = "https://github.com/phodal/designiot"
                    ),
                    URLItemData(
                        groupTitle = "分布式系统",
                        title = "走向分布式",
                        url = "http://dcaoyuan.github.io/papers/pdfs/Scalability.pdf"
                    ),
                    URLItemData(
                        groupTitle = "编译原理",
                        title = "《计算机程序的结构和解释》公开课 翻译项目",
                        url = "https://github.com/DeathKing/Learning-SICP"
                    ),
                    URLItemData(
                        groupTitle = "函数式概念",
                        title = "傻瓜函数编程",
                        url = "https://github.com/justinyhuang/Functional-Programming-For-The-Rest-of-Us-Cn"
                    ),
                    URLItemData(
                        groupTitle = "计算机图形学",
                        title = "OpenGL 教程",
                        url = "https://github.com/zilongshanren/opengl-tutorials"
                    ),
                    URLItemData(
                        groupTitle = "计算机图形学",
                        title = "《Real-Time Rendering 3rd》提炼总结",
                        url = "https://github.com/QianMo/Real-Time-Rendering-3rd-Summary-Ebook"
                    ),
                    URLItemData(
                        groupTitle = "WEB服务器",
                        title = "Nginx开发从入门到精通(淘宝团队出品)",
                        url = "http://tengine.taobao.org/book/index.html"
                    ),
                    URLItemData(
                        groupTitle = "WEB服务器",
                        title = "Nginx教程从入门到精通(PDF版本，运维生存时间出品)",
                        url = "http://www.ttlsa.com/nginx/nginx-stu-pdf/"
                    ),
                    URLItemData(
                        groupTitle = "WEB服务器",
                        title = "OpenResty最佳实践",
                        url = "https://www.gitbook.com/book/moonbingbing/openresty-best-practices/details"
                    ),
                    URLItemData(
                        groupTitle = "WEB服务器",
                        title = "Apache 中文手册",
                        url = "http://works.jinbuguo.com/apache/menu22/index.html"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "Git教程",
                        url = "http://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "git - 简易指南",
                        url = "http://rogerdudler.github.io/git-guide/index.zh.html"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "猴子都能懂的GIT入门",
                        url = "http://backlogtool.com/git-guide/cn/"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "Git 参考手册",
                        url = "http://gitref.justjavac.com"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "Pro Git",
                        url = "http://git-scm.com/book/zh/v2"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "Pro Git 中文版",
                        url = "https://www.gitbook.com/book/0532/progit/details"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "Git Magic",
                        url = "http://www-cs-students.stanford.edu/~blynn/gitmagic/intl/zh_cn/"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "GotGitHub",
                        url = "http://www.worldhello.net/gotgithub/index.html"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "Git权威指南",
                        url = "http://www.worldhello.net/gotgit/"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "Git Community Book 中文版",
                        url = "http://gitbook.liuhui998.com/index.html"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "Mercurial 使用教程",
                        url = "https://www.mercurial-scm.org/wiki/ChineseTutorial"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "HgInit (中文版)",
                        url = "http://bucunzai.net/hginit/"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "沉浸式学 Git",
                        url = "http://igit.linuxtoy.org"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "Git-Cheat-Sheet",
                        url = "https://github.com/flyhigher139/Git-Cheat-Sheet"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "GitHub秘籍",
                        url = "https://snowdream86.gitbooks.io/github-cheat-sheet/content/zh/index.html"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "GitHub帮助文档",
                        url = "https://github.com/waylau/github-help"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "git-flow 备忘清单",
                        url = "http://danielkummer.github.io/git-flow-cheatsheet/index.zh_CN.html"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "svn 手册",
                        url = "http://svnbook.red-bean.com/nightly/zh/index.html"
                    ),
                    URLItemData(
                        groupTitle = "版本控制",
                        title = "GitHub漫游指南",
                        url = "https://github.com/phodal/github-roam"
                    ),
                    URLItemData(
                        groupTitle = "编辑器",
                        title = "exvim--vim 改良成IDE项目",
                        url = "http://exvim.github.io/docs-zh/intro/"
                    ),
                    URLItemData(
                        groupTitle = "编辑器",
                        title = "Vim中文文档",
                        url = "https://github.com/vimcn/vimcdoc"
                    ),
                    URLItemData(
                        groupTitle = "编辑器",
                        title = "所需即所获：像 IDE 一样使用 vim",
                        url = "https://github.com/yangyangwithgnu/use_vim_as_ide"
                    ),
                    URLItemData(
                        groupTitle = "编辑器",
                        title = "vim 实操教程",
                        url = "https://github.com/dofy/learn-vim"
                    ),
                    URLItemData(
                        groupTitle = "编辑器",
                        title = "Atom飞行手册中文版",
                        url = "https://github.com/wizardforcel/atom-flight-manual-zh-cn"
                    ),
                    URLItemData(
                        groupTitle = "编辑器",
                        title = "Markdown·简单的世界",
                        url = "https://github.com/wizardforcel/markdown-simple-world"
                    ),
                    URLItemData(
                        groupTitle = "编辑器",
                        title = "一年成为 Emacs 高手",
                        url = "https://github.com/redguardtoo/mastering-emacs-in-one-year-guide/blob/master/guide-zh.org"
                    ),
                    URLItemData(
                        groupTitle = "编辑器",
                        title = "Emacs 生存指南",
                        url = "http://lifegoo.pluskid.org/upload/blog/152/Survive.in.Emacs.pdf"
                    ),
                    URLItemData(
                        groupTitle = "编辑器",
                        title = "Atom官方手册",
                        url = "https://atom-china.org/t/atom/62"
                    ),
                    URLItemData(
                        groupTitle = "NoSQL",
                        title = "NoSQL数据库笔谈",
                        url = "http://old.sebug.net/paper/databases/nosql/Nosql.html"
                    ),
                    URLItemData(
                        groupTitle = "NoSQL",
                        title = "Redis 设计与实现",
                        url = "http://redisbook.com/"
                    ),
                    URLItemData(
                        groupTitle = "NoSQL",
                        title = "Redis 命令参考",
                        url = "http://redisdoc.com/"
                    ),
                    URLItemData(
                        groupTitle = "NoSQL",
                        title = "带有详细注释的 Redis 3.0 代码",
                        url = "https://github.com/huangz1990/redis-3.0-annotated"
                    ),
                    URLItemData(
                        groupTitle = "NoSQL",
                        title = "带有详细注释的 Redis 2.6 代码",
                        url = "https://github.com/huangz1990/annotated_redis_source"
                    ),
                    URLItemData(
                        groupTitle = "NoSQL",
                        title = "The Little MongoDB Book",
                        url = "https://github.com/justinyhuang/the-little-mongodb-book-cn/blob/master/mongodb.md"
                    ),
                    URLItemData(
                        groupTitle = "NoSQL",
                        title = "The Little Redis Book",
                        url = "https://github.com/JasonLai256/the-little-redis-book/blob/master/cn/redis.md"
                    ),
                    URLItemData(
                        groupTitle = "NoSQL",
                        title = "Neo4j 简体中文手册 v1.8",
                        url = "http://docs.neo4j.org.cn/"
                    ),
                    URLItemData(
                        groupTitle = "NoSQL",
                        title = "Neo4j .rb 中文資源",
                        url = "http://neo4j.tw/"
                    ),
                    URLItemData(
                        groupTitle = "NoSQL",
                        title = "Disque 使用教程",
                        url = "http://disquebook.com"
                    ),
                    URLItemData(
                        groupTitle = "NoSQL",
                        title = "Apache Spark 设计与实现",
                        url = "https://github.com/JerryLead/SparkInternals/tree/master/markdown"
                    ),
                    URLItemData(
                        groupTitle = "PostgreSQL",
                        title = "PostgreSQL 8.2.3 中文文档",
                        url = "http://works.jinbuguo.com/postgresql/menu823/index.html"
                    ),
                    URLItemData(
                        groupTitle = "PostgreSQL",
                        title = "PostgreSQL 9.3.1 中文文档",
                        url = "http://www.postgres.cn/docs/9.3/index.html"
                    ),
                    URLItemData(
                        groupTitle = "PostgreSQL",
                        title = "PostgreSQL 9.5.3 中文文档",
                        url = "http://www.postgres.cn/docs/9.5/index.html"
                    ),
                    URLItemData(
                        groupTitle = "MySQL",
                        title = "MySQL索引背后的数据结构及算法原理",
                        url = "http://blog.codinglabs.org/articles/theory-of-mysql-index.html"
                    ),
                    URLItemData(
                        groupTitle = "MySQL",
                        title = "21分钟MySQL入门教程",
                        url = "http://www.cnblogs.com/mr-wid/archive/2013/05/09/3068229.html"
                    ),
                    URLItemData(
                        groupTitle = "管理和监控",
                        title = "ELKstack 中文指南",
                        url = "http://kibana.logstash.es"
                    ),
                    URLItemData(
                        groupTitle = "管理和监控",
                        title = "Mastering Elasticsearch(中文版)",
                        url = "http://udn.yyuap.com/doc/mastering-elasticsearch/"
                    ),
                    URLItemData(
                        groupTitle = "管理和监控",
                        title = "ElasticSearch 权威指南",
                        url = "https://www.gitbook.com/book/fuxiaopang/learnelasticsearch/details"
                    ),
                    URLItemData(
                        groupTitle = "管理和监控",
                        title = "Elasticsearch 权威指南（中文版）",
                        url = "http://es.xiaoleilu.com"
                    ),
                    URLItemData(
                        groupTitle = "管理和监控",
                        title = "Logstash 最佳实践",
                        url = "https://github.com/chenryn/logstash-best-practice-cn"
                    ),
                    URLItemData(
                        groupTitle = "管理和监控",
                        title = "Puppet 2.7 Cookbook 中文版",
                        url = "http://bbs.konotes.org/workdoc/puppet-27/"
                    ),
                    URLItemData(
                        groupTitle = "项目相关",
                        title = "持续集成-第二版",
                        url = "http://article.yeeyan.org/view/2251/94882"
                    ),
                    URLItemData(
                        groupTitle = "项目相关",
                        title = "让开发自动化系列专栏",
                        url = "http://www.ibm.com/developerworks/cn/java/j-ap/"
                    ),
                    URLItemData(
                        groupTitle = "项目相关",
                        title = "追求代码质量",
                        url = "http://www.ibm.com/developerworks/cn/java/j-cq/"
                    ),
                    URLItemData(
                        groupTitle = "项目相关",
                        title = "selenium 中文文档",
                        url = "https://github.com/fool2fish/selenium-doc"
                    ),
                    URLItemData(
                        groupTitle = "项目相关",
                        title = "Selenium Webdriver 简易教程",
                        url = "http://it-ebooks.flygon.net/selenium-simple-tutorial/"
                    ),
                    URLItemData(
                        groupTitle = "项目相关",
                        title = "約耳談軟體-Joel on Software",
                        url = "http://local.joelonsoftware.com/wiki/%E9%A6%96%E9%A0%81"
                    ),
                    URLItemData(
                        groupTitle = "项目相关",
                        title = "Gradle 2 用户指南",
                        url = "https://github.com/waylau/Gradle-2-User-Guide"
                    ),
                    URLItemData(
                        groupTitle = "项目相关",
                        title = "Gradle 中文使用文档",
                        url = "http://yuedu.baidu.com/ebook/f23af265998fcc22bcd10da2"
                    ),
                    URLItemData(
                        groupTitle = "项目相关",
                        title = "编码规范",
                        url = "https://github.com/ecomfe/spec"
                    ),
                    URLItemData(
                        groupTitle = "项目相关",
                        title = "开源软件架构",
                        url = "http://www.ituring.com.cn/book/1143"
                    ),
                    URLItemData(
                        groupTitle = "项目相关",
                        title = "GNU make 指南",
                        url = "http://docs.huihoo.com/gnu/linux/gmake.html"
                    ),
                    URLItemData(
                        groupTitle = "项目相关",
                        title = "GNU make 中文手册",
                        url = "http://www.yayu.org/book/gnu_make/"
                    ),
                    URLItemData(
                        groupTitle = "项目相关",
                        title = "The Twelve-Factor App",
                        url = "http://12factor.net/zh_cn/"
                    ),
                    URLItemData(
                        groupTitle = "设计模式",
                        title = "图说设计模式",
                        url = "https://github.com/me115/design_patterns"
                    ),
                    URLItemData(
                        groupTitle = "设计模式",
                        title = "史上最全设计模式导学目录",
                        url = "http://blog.csdn.net/lovelion/article/details/17517213"
                    ),
                    URLItemData(
                        groupTitle = "设计模式",
                        title = "design pattern 包教不包会",
                        url = "https://github.com/AlfredTheBest/Design-Pattern"
                    ),
                    URLItemData(
                        groupTitle = "设计模式",
                        title = "设计模式 Java 版",
                        url = "https://quanke.gitbooks.io/design-pattern-java/content/"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "关于浏览器和网络的 20 项须知",
                        url = "http://www.20thingsilearned.com/zh-CN/home"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "浏览器开发工具的秘密",
                        url = "http://jinlong.github.io/2013/08/29/devtoolsecrets/"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "Chrome 开发者工具中文手册",
                        url = "https://github.com/CN-Chrome-DevTools/CN-Chrome-DevTools"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "Chrome扩展开发文档",
                        url = "http://open.chrome.360.cn/extension_dev/overview.html"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "Grunt中文文档",
                        url = "http://www.gruntjs.net/"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "gulp中文文档",
                        url = "http://www.gulpjs.com.cn/docs/"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "Gulp 入门指南",
                        url = "https://github.com/nimojs/gulp-book"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "移动Web前端知识库",
                        url = "https://github.com/AlloyTeam/Mars"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "正则表达式30分钟入门教程",
                        url = "http://deerchao.net/tutorials/regex/regex.htm"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "前端开发体系建设日记",
                        url = "https://github.com/fouber/blog/issues/2"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "移动前端开发收藏夹",
                        url = "https://github.com/hoosin/mobile-web-favorites"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "JSON风格指南",
                        url = "https://github.com/darcyliu/google-styleguide/blob/master/JSONStyleGuide.md"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "HTTP 接口设计指北",
                        url = "https://github.com/bolasblack/http-api-guide"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "前端资源分享 一",
                        url = "https://github.com/hacke2/hacke2.github.io/issues/1"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "前端资源分享 二",
                        url = "https://github.com/hacke2/hacke2.github.io/issues/3"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "前端代码规范 及 最佳实践",
                        url = "http://coderlmn.github.io/code-standards/"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "前端开发者手册",
                        url = "https://www.gitbook.com/book/dwqs/frontenddevhandbook/details"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "前端工程师手册",
                        url = "https://www.gitbook.com/book/leohxj/front-end-database/details"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "w3school教程整理",
                        url = "https://github.com/wizardforcel/w3school"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "Wireshark用户手册",
                        url = "http://man.lupaworld.com/content/network/wireshark/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "一站式学习Wireshark",
                        url = "https://community.emc.com/thread/194901"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "HTTP 下午茶",
                        url = "https://ccbikai.gitbooks.io/http-book/content/"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "HTTP/2.0 中文翻译",
                        url = "http://yuedu.baidu.com/ebook/478d1a62376baf1ffc4fad99?pn=1"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "RFC 7540 - HTTP/2 中文翻译版",
                        url = "https://github.com/abbshr/rfc7540-translation-zh_cn"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "http2讲解",
                        url = "https://www.gitbook.com/book/ye11ow/http2-explained/details"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "3 Web Designs in 3 Weeks",
                        url = "https://www.gitbook.com/book/juntao/3-web-designs-in-3-weeks/details"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "站点可靠性工程",
                        url = "https://github.com/hellorocky/Site-Reliability-Engineering"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "Web安全学习笔记",
                        url = "https://websec.readthedocs.io"
                    ),
                    URLItemData(
                        groupTitle = "Web",
                        title = "Serverless 架构应用开发指南",
                        url = "https://github.com/phodal/serverless"
                    ),
                    URLItemData(
                        groupTitle = "大数据",
                        title = "大数据/数据挖掘/推荐系统/机器学习相关资源",
                        url = "https://github.com/Flowerowl/Big-Data-Resources"
                    ),
                    URLItemData(
                        groupTitle = "大数据",
                        title = "面向程序员的数据挖掘指南",
                        url = "https://github.com/egrcc/guidetodatamining"
                    ),
                    URLItemData(
                        groupTitle = "大数据",
                        title = "大型集群上的快速和通用数据处理架构",
                        url = "https://code.csdn.net/CODE_Translation/spark_matei_phd"
                    ),
                    URLItemData(
                        groupTitle = "大数据",
                        title = "数据挖掘中经典的算法实现和详细的注释",
                        url = "https://github.com/linyiqun/DataMiningAlgorithm"
                    ),
                    URLItemData(
                        groupTitle = "大数据",
                        title = "Spark 编程指南简体中文版",
                        url = "https://aiyanbo.gitbooks.io/spark-programming-guide-zh-cn/content/"
                    ),
                    URLItemData(
                        groupTitle = "编程艺术",
                        title = "程序员编程艺术",
                        url = "https://github.com/julycoding/The-Art-Of-Programming-by-July"
                    ),
                    URLItemData(
                        groupTitle = "编程艺术",
                        title = "每个程序员都应该了解的内存知识",
                        url = "http://www.oschina.net/translate/what-every-programmer-should-know-about-memory-part1?print"
                    ),
                    URLItemData(
                        groupTitle = "编程艺术",
                        title = "取悦的工序：如何理解游戏",
                        url = "http://read.douban.com/ebook/4972883/"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "OpenWrt智能、自动、透明翻墙路由器教程",
                        url = "https://www.gitbook.com/book/softwaredownload/openwrt-fanqiang/details"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "SAN 管理入门系列",
                        url = "https://community.emc.com/docs/DOC-16067"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "Sketch 中文手册",
                        url = "http://sketchcn.com/sketch-chinese-user-manual.html#introduce"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "深入理解并行编程",
                        url = "http://ifeve.com/perfbook/"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "程序员的自我修养",
                        url = "http://www.kancloud.cn/kancloud/a-programmer-prepares"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "Growth: 全栈增长工程师指南",
                        url = "https://github.com/phodal/growth-ebook"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "系统重构与迁移指南",
                        url = "https://github.com/phodal/migration"
                    ),
                    URLItemData(
                        groupTitle = "Android",
                        title = "Android Design 中文版",
                        url = "http://www.apkbus.com/design/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Android",
                        title = "Google Material Design 正體中文版 译本一",
                        url = "https://wcc723.gitbooks.io/google_design_translate/content/style-icons.html"
                    ),
                    URLItemData(
                        groupTitle = "Android",
                        title = "Google Material Design 正體中文版 译本二",
                        url = "https://github.com/1sters/material_design_zh"
                    ),
                    URLItemData(
                        groupTitle = "Android",
                        title = "Material Design 中文版",
                        url = "http://wiki.jikexueyuan.com/project/material-design/"
                    ),
                    URLItemData(
                        groupTitle = "Android",
                        title = "Google Android官方培训课程中文版",
                        url = "http://hukai.me/android-training-course-in-chinese/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Android",
                        title = "Android学习之路",
                        url = "http://www.stormzhang.com/android/2014/07/07/learn-android-from-rookie/"
                    ),
                    URLItemData(
                        groupTitle = "Android",
                        title = "Android开发技术前线(android-tech-frontier)",
                        url = "https://github.com/bboyfeiyu/android-tech-frontier"
                    ),
                    URLItemData(
                        groupTitle = "Android",
                        title = "Point-of-Android",
                        url = "https://github.com/FX-Max/Point-of-Android"
                    ),
                    URLItemData(
                        groupTitle = "Android",
                        title = "Android6.0新特性详解",
                        url = "http://leanote.com/blog/post/561658f938f41126b2000298"
                    ),
                    URLItemData(
                        groupTitle = "APP",
                        title = "Apache Cordova 开发指南",
                        url = "https://github.com/waylau/cordova-dev-guide"
                    ),
                    URLItemData(
                        groupTitle = "AWK",
                        title = "awk程序设计语言",
                        url = "https://github.com/wuzhouhui/awk"
                    ),
                    URLItemData(
                        groupTitle = "AWK",
                        title = "awk中文指南",
                        url = "http://awk.readthedocs.org/en/latest/index.html"
                    ),
                    URLItemData(
                        groupTitle = "AWK",
                        title = "awk实战指南",
                        url = "https://book.saubcy.com/AwkInAction/"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "C/C++ 中文参考手册",
                        url = "http://zh.cppreference.com/"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "C 语言编程透视",
                        url = "https://www.gitbook.com/book/tinylab/cbook/details"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "C++ 并发编程指南",
                        url = "https://github.com/forhappy/Cplusplus-Concurrency-In-Practice"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "Linux C编程一站式学习",
                        url = "http://akaedu.github.io/book/"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "CGDB中文手册",
                        url = "https://github.com/leeyiw/cgdb-manual-in-chinese"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "100个gdb小技巧",
                        url = "https://github.com/hellogcc/100-gdb-tips/blob/master/src/index.md"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "100个gcc小技巧",
                        url = "https://github.com/hellogcc/100-gcc-tips/blob/master/src/index.md"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "ZMQ 指南",
                        url = "https://github.com/anjuke/zguide-cn"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "How to Think Like a Computer Scientist",
                        url = "http://www.ituring.com.cn/book/1203"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "跟我一起写 Makefile",
                        url = "https://github.com/seisman/how-to-write-makefile"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "GNU make中文手册",
                        url = "https://free-online-ebooks.appspot.com/tools/gnu-make-cn/"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "GNU make 指南",
                        url = "http://docs.huihoo.com/gnu/linux/gmake.html"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "Google C++ 风格指南",
                        url = "http://zh-google-styleguide.readthedocs.org/en/latest/google-cpp-styleguide/contents/"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "C/C++ Primer",
                        url = "https://github.com/andycai/cprimer"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "简单易懂的C魔法",
                        url = "http://www.nowamagic.net/librarys/books/contents/c"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "C++ FAQ LITE-中文版",
                        url = "http://www.sunistudio.com/cppfaq/"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "C++ Primer 5th Answers",
                        url = "https://github.com/Mooophy/Cpp-Primer"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "C++ 并发编程(基于C++11)",
                        url = "https://www.gitbook.com/book/chenxiaowei/cpp_concurrency_in_action/details"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "QT 教程",
                        url = "http://www.kuqin.com/qtdocument/tutorial.html"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "DevBean的《Qt学习之路2》(Qt5)",
                        url = "http://www.devbean.net/category/qt-study-road-2/"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "中文版《QmlBook》",
                        url = "https://github.com/cwc1987/QmlBook-In-Chinese"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "C++ Template 进阶指南",
                        url = "https://github.com/wuye9036/CppTemplateTutorial"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "libuv中文教程",
                        url = "https://github.com/luohaha/Chinese-uvbook"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "Boost 库中文教程",
                        url = "http://zh.highscore.de/cpp/boost/"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "笨办法学C",
                        url = "https://github.com/wizardforcel/lcthw-zh"
                    ),
                    URLItemData(
                        groupTitle = "C/C++",
                        title = "高速上手 C++11/14/17",
                        url = "https://github.com/changkun/modern-cpp-tutorial"
                    ),
                    URLItemData(
                        groupTitle = "C#",
                        title = "Microsoft Docs C# 官方文档",
                        url = "https://docs.microsoft.com/zh-cn/dotnet/csharp/"
                    ),
                    URLItemData(
                        groupTitle = "C#",
                        title = "ASP.NET MVC 5 入门指南",
                        url = "http://www.cnblogs.com/powertoolsteam/p/aspnetmvc5-tutorials-grapecity.html"
                    ),
                    URLItemData(
                        groupTitle = "C#",
                        title = "超全面的 .NET GDI+ 图形图像编程教程",
                        url = "http://www.cnblogs.com/geeksss/p/4162318.html"
                    ),
                    URLItemData(
                        groupTitle = "C#",
                        title = ".NET控件开发基础",
                        url = "https://github.com/JackWangCUMT/customcontrol"
                    ),
                    URLItemData(
                        groupTitle = "C#",
                        title = ".NET开发要点精讲-初稿",
                        url = "https://github.com/sherlockchou86/-free-ebook-.NET-"
                    ),
                    URLItemData(
                        groupTitle = "Clojure",
                        title = "Clojure入门教程",
                        url = "https://wizardforcel.gitbooks.io/clojure-fpftj/"
                    ),
                    URLItemData(
                        groupTitle = "CSS/HTML",
                        title = "学习CSS布局",
                        url = "http://zh.learnlayout.com/"
                    ),
                    URLItemData(
                        groupTitle = "CSS/HTML",
                        title = "通用 CSS 笔记、建议与指导",
                        url = "https://github.com/chadluo/CSS-Guidelines/blob/master/README.md"
                    ),
                    URLItemData(
                        groupTitle = "CSS/HTML",
                        title = "CSS参考手册",
                        url = "http://css.doyoe.com/"
                    ),
                    URLItemData(
                        groupTitle = "CSS/HTML",
                        title = "Emmet 文档",
                        url = "http://yanxyz.github.io/emmet-docs/"
                    ),
                    URLItemData(
                        groupTitle = "CSS/HTML",
                        title = "前端代码规范",
                        url = "http://alloyteam.github.io/CodeGuide/"
                    ),
                    URLItemData(
                        groupTitle = "CSS/HTML",
                        title = "HTML和CSS编码规范",
                        url = "http://codeguide.bootcss.com/"
                    ),
                    URLItemData(
                        groupTitle = "CSS/HTML",
                        title = "Sass Guidelines 中文",
                        url = "http://sass-guidelin.es/zh/"
                    ),
                    URLItemData(
                        groupTitle = "CSS/HTML",
                        title = "CSS3 Tutorial 《CSS3 教程》",
                        url = "https://github.com/waylau/css3-tutorial"
                    ),
                    URLItemData(
                        groupTitle = "CSS/HTML",
                        title = "MDN HTML 中文文档",
                        url = "https://developer.mozilla.org/zh-CN/docs/Web/HTML"
                    ),
                    URLItemData(
                        groupTitle = "CSS/HTML",
                        title = "MDN CSS 中文文档",
                        url = "https://developer.mozilla.org/zh-CN/docs/Web/CSS"
                    ),
                    URLItemData(
                        groupTitle = "Dart",
                        title = "Dart 语言导览",
                        url = "http://dart.lidian.info/wiki/Language_Tour"
                    ),
                    URLItemData(
                        groupTitle = "Elixir",
                        title = "Elixir编程入门",
                        url = "https://github.com/straightdave/programming_elixir"
                    ),
                    URLItemData(
                        groupTitle = "Erlang",
                        title = "21天学通Erlang",
                        url = "http://xn--21erlang-p00o82pmp3o.github.io/"
                    ),
                    URLItemData(
                        groupTitle = "Fortran",
                        title = "Fortran77和90/95编程入门",
                        url = "http://micro.ustc.edu.cn/Fortran/ZJDing/"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go编程基础",
                        url = "https://github.com/Unknwon/go-fundamental-programming"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go入门指南",
                        url = "https://github.com/Unknwon/the-way-to-go_ZH_CN"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "学习Go语言",
                        url = "http://mikespook.com/learning-go/"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go Web 编程",
                        url = "https://github.com/astaxie/build-web-application-with-golang"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go实战开发",
                        url = "https://github.com/astaxie/Go-in-Action"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Network programming with Go 中文翻译版本",
                        url = "https://github.com/astaxie/NPWG_zh"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Effective Go",
                        url = "http://www.hellogcc.org/effective_go.html"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go 语言标准库",
                        url = "https://github.com/polaris1119/The-Golang-Standard-Library-by-Example"
                    ),
                    URLItemData(groupTitle = "Go", title = "Golang标准库文档", url = "http://godoc.ml/"),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Revel 框架手册",
                        url = "http://gorevel.cn/docs/manual/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Java程序员的Golang入门指南",
                        url = "http://blog.csdn.net/dc_726/article/details/46565241"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go命令教程",
                        url = "https://github.com/hyper-carrot/go_command_tutorial"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go语言博客实践",
                        url = "https://github.com/achun/Go-Blog-In-Action"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go 官方文档翻译",
                        url = "https://github.com/golang-china/golangdoc.translations"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "深入解析Go",
                        url = "https://github.com/tiancaiamao/go-internals"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go语言圣经-中文版",
                        url = "https://bitbucket.org/golang-china/gopl-zh/wiki/Home"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "golang runtime源码分析",
                        url = "https://github.com/sheepbao/golang_runtime_reading"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go语言实战: 编写可维护Go语言代码建议",
                        url = "https://github.com/llitfkitfk/go-best-practice"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Golang 系列教程",
                        url = "https://github.com/Tinywan/golang-tutorial"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go RPC 开发指南",
                        url = "https://github.com/smallnest/go-rpc-programming-guide"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go语言高级编程",
                        url = "https://books.studygolang.com/advanced-go-programming-book/"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go2编程指南",
                        url = "https://chai2010.cn/go2-book/"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go语言设计模式",
                        url = "https://github.com/senghoo/golang-design-pattern"
                    ),
                    URLItemData(
                        groupTitle = "Go",
                        title = "Go语言四十二章经",
                        url = "https://github.com/ffhelicopter/Go42"
                    ),
                    URLItemData(
                        groupTitle = "Groovy",
                        title = "实战 Groovy 系列",
                        url = "http://www.ibm.com/developerworks/cn/java/j-pg/"
                    ),
                    URLItemData(
                        groupTitle = "Haskell",
                        title = "Real World Haskell 中文版",
                        url = "http://rwh.readthedocs.org/en/latest/"
                    ),
                    URLItemData(
                        groupTitle = "Haskell",
                        title = "Haskell趣学指南",
                        url = "https://learnyoua.haskell.sg/content/zh-cn/"
                    ),
                    URLItemData(
                        groupTitle = "iOS",
                        title = "iOS开发60分钟入门",
                        url = "https://github.com/qinjx/30min_guides/blob/master/ios.md"
                    ),
                    URLItemData(
                        groupTitle = "iOS",
                        title = "iOS7人机界面指南",
                        url = "http://isux.tencent.com/ios-human-interface-guidelines-ui-design-basics-ios7.html"
                    ),
                    URLItemData(
                        groupTitle = "iOS",
                        title = "Google Objective-C Style Guide 中文版",
                        url = "http://zh-google-styleguide.readthedocs.org/en/latest/google-objc-styleguide/"
                    ),
                    URLItemData(
                        groupTitle = "iOS",
                        title = "iPhone 6 屏幕揭秘",
                        url = "http://wileam.com/iphone-6-screen-cn/"
                    ),
                    URLItemData(
                        groupTitle = "iOS",
                        title = "Apple Watch开发初探",
                        url = "http://nilsun.github.io/apple-watch/"
                    ),
                    URLItemData(
                        groupTitle = "iOS",
                        title = "马上着手开发 iOS 应用程序",
                        url = "https://developer.apple.com/library/ios/referencelibrary/GettingStarted/RoadMapiOSCh/index.html"
                    ),
                    URLItemData(
                        groupTitle = "iOS",
                        title = "网易斯坦福大学公开课：iOS 7应用开发字幕文件",
                        url = "https://github.com/jkyin/Subtitle"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Apache Shiro 用户指南",
                        url = "https://github.com/waylau/apache-shiro-1.2.x-reference"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Jersey 2.x 用户指南",
                        url = "https://github.com/waylau/Jersey-2.x-User-Guide"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Spring Framework 4.x参考文档",
                        url = "https://github.com/waylau/spring-framework-4-reference"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Spring Boot参考指南",
                        url = "https://github.com/qibaoguang/Spring-Boot-Reference-Guide"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "MyBatis中文文档",
                        url = "http://mybatis.org/mybatis-3/zh/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "MyBatis Generator 中文文档",
                        url = "http://mbg.cndocs.tk/"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "用jersey构建REST服务",
                        url = "https://github.com/waylau/RestDemo"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Activiti 5.x 用户指南",
                        url = "https://github.com/waylau/activiti-5.x-user-guide"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Google Java编程风格指南",
                        url = "http://www.hawstein.com/posts/google-java-style.html"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Netty 4.x 用户指南",
                        url = "https://github.com/waylau/netty-4-user-guide"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Netty 实战-精髓",
                        url = "https://github.com/waylau/essential-netty-in-action"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "REST 实战",
                        url = "https://github.com/waylau/rest-in-action"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Java 编码规范",
                        url = "https://github.com/waylau/java-code-conventions"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Apache MINA 2 用户指南",
                        url = "https://github.com/waylau/apache-mina-2.x-user-guide"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "H2 Database 教程",
                        url = "https://github.com/waylau/h2-database-doc"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Java Servlet 3.1 规范",
                        url = "https://github.com/waylau/servlet-3.1-specification"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "JSSE 参考指南",
                        url = "https://github.com/waylau/jsse-reference-guide"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Java开源实现及最佳实践",
                        url = "https://github.com/biezhi/jb"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Java 编程要点",
                        url = "https://github.com/waylau/essential-java"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Think Java",
                        url = "http://www.ituring.com.cn/minibook/69"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Java 8 简明教程",
                        url = "https://github.com/wizardforcel/modern-java-zh"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "On Java 8 中文版",
                        url = "https://github.com/LingCoder/OnJava8"
                    ),
                    URLItemData(
                        groupTitle = "Java",
                        title = "Effective Java 第3版中文版",
                        url = "https://github.com/sjsdfg/effective-java-3rd-chinese"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "现代 Javascript 教程",
                        url = "https://zh.javascript.info/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Google JavaScript 代码风格指南",
                        url = "http://bq69.com/blog/articles/script/868/google-javascript-style-guide.html"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Google JSON 风格指南",
                        url = "https://github.com/darcyliu/google-styleguide/blob/master/JSONStyleGuide.md"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Airbnb JavaScript 规范",
                        url = "https://github.com/adamlu/javascript-style-guide"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "JavaScript 标准参考教程-alpha",
                        url = "http://javascript.ruanyifeng.com/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Javascript编程指南",
                        url = "http://pij.robinqu.me/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "javascript 的 12 个怪癖",
                        url = "https://github.com/justjavac/12-javascript-quirks"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "JavaScript 秘密花园",
                        url = "http://bonsaiden.github.io/JavaScript-Garden/zh/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "JavaScript核心概念及实践",
                        url = "http://icodeit.org/jsccp/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "《JavaScript 模式》",
                        url = "https://github.com/jayli/javascript-patterns"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "JavaScript语言精粹",
                        url = "https://github.com/qibaoguang/Study-Step-by-Step/blob/master/%E8%AF%BB%E4%B9%A6%E7%AC%94%E8%AE%B0/javascript_the_good_parts.md"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "命名函数表达式探秘",
                        url = "http://justjavac.com/named-function-expressions-demystified.html"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "学用 JavaScript 设计模式",
                        url = "http://www.oschina.net/translate/learning-javascript-design-patterns"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "深入理解JavaScript系列",
                        url = "http://www.cnblogs.com/TomXu/archive/2011/12/15/2288411.html"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "ECMAScript 5.1 中文版",
                        url = "http://yanhaijing.com/es5"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "ECMAScript 6 入门",
                        url = "http://es6.ruanyifeng.com/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "JavaScript Promise迷你书",
                        url = "http://liubin.github.io/promises-book/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "You-Dont-Know-JS",
                        url = "https://github.com/getify/You-Dont-Know-JS"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "JavaScript 教程",
                        url = "http://www.liaoxuefeng.com/wiki/001434446689867b27157e896e74d51a89c25cc8b43bdb3000"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "MDN JavaScript 中文文档",
                        url = "https://developer.mozilla.org/zh-CN/docs/Web/JavaScript"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "jQuery 解构",
                        url = "http://www.cn-cuckoo.com/deconstructed/jquery.html"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "简单易懂的JQuery魔法",
                        url = "http://www.nowamagic.net/librarys/books/contents/jquery"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "How to write jQuery plugin",
                        url = "http://i5ting.github.io/How-to-write-jQuery-plugin/build/jquery.plugin.html"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "You Don't Need jQuery",
                        url = "https://github.com/oneuijs/You-Dont-Need-jQuery/blob/master/README.zh-CN.md"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "如何实现一个类jQuery？",
                        url = "https://github.com/MeCKodo/forchange"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Node入门",
                        url = "http://www.nodebeginner.org/index-zh-cn.html"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "七天学会NodeJS",
                        url = "http://nqdeng.github.io/7-days-nodejs/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Nodejs Wiki Book",
                        url = "https://github.com/nodejs-tw/nodejs-wiki-book"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "express.js 中文文档",
                        url = "http://expressjs.jser.us/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "koa 中文文档",
                        url = "https://github.com/guo-yu/koa-guide"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "一起学koa",
                        url = "http://base-n.github.io/koa-generator-examples/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "使用 Express + MongoDB 搭建多人博客",
                        url = "https://github.com/nswbmw/N-blog"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Express框架",
                        url = "http://javascript.ruanyifeng.com/nodejs/express.html"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Node.js 包教不包会",
                        url = "https://github.com/alsotang/node-lessons"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Learn You The Node.js For Much Win! -中文版",
                        url = "https://www.npmjs.com/package/learnyounode-zh-cn"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Node debug 三法三例",
                        url = "http://i5ting.github.io/node-debug-tutorial/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "nodejs中文文档",
                        url = "https://www.gitbook.com/book/0532/nodejs/details"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "orm2 中文文档",
                        url = "https://github.com/wizardforcel/orm2-doc-zh-cn"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "一起学 Node.js",
                        url = "https://github.com/nswbmw/N-blog"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Underscore.js中文文档",
                        url = "http://learningcn.com/underscore/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "backbone.js中文文档",
                        url = "http://www.css88.com/doc/backbone/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "backbone.js入门教程",
                        url = "http://www.the5fire.com/backbone-js-tutorials-pdf-download.html"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Backbone.js入门教程第二版",
                        url = "https://github.com/the5fire/backbonejs-learning-note"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Developing Backbone.js Applications-中文版",
                        url = "http://feliving.github.io/developing-backbone-applications/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "AngularJS最佳实践和风格指南",
                        url = "https://github.com/mgechev/angularjs-style-guide/blob/master/README-zh-cn.md"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "AngularJS中译本",
                        url = "https://github.com/peiransun/angularjs-cn"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "AngularJS入门教程",
                        url = "https://github.com/zensh/AngularjsTutorial_cn"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "构建自己的AngularJS",
                        url = "https://github.com/xufei/Make-Your-Own-AngularJS/blob/master/01.md"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "在Windows环境下用Yeoman构建AngularJS项目",
                        url = "http://www.waylau.com/build-angularjs-app-with-yeoman-in-windows/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Zepto.js 中文文档",
                        url = "http://mweb.baidu.com/zeptoapi/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Hello Sea.js",
                        url = "http://island205.github.io/HelloSea.js/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "React 学习之道",
                        url = "https://github.com/the-road-to-learn-react/the-road-to-learn-react-chinese"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "React.js 小书",
                        url = "https://github.com/huzidaha/react-naive-book"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "React.js 中文文档",
                        url = "https://doc.react-china.org/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "React webpack-cookbook",
                        url = "https://github.com/fakefish/react-webpack-cookbook"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "React 入门教程",
                        url = "http://fraserxu.me/intro-to-react/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "React 入门教程",
                        url = "https://hulufei.gitbooks.io/react-tutorial/content/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "React Native 中文文档-含最新Android内容",
                        url = "http://wiki.jikexueyuan.com/project/react-native/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Learn React & Webpack by building the Hacker News front page",
                        url = "https://github.com/theJian/build-a-hn-front-page"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "impress.js的中文教程",
                        url = "https://github.com/kokdemo/impress.js-tutorial-in-Chinese"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "CoffeeScript Cookbook",
                        url = "http://island205.com/coffeescript-cookbook.github.com/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "The Little Book on CoffeeScript中文版",
                        url = "http://island205.com/tlboc/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "CoffeeScript 编码风格指南",
                        url = "https://github.com/geekplux/coffeescript-style-guide"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "TypeScript Handbook",
                        url = "https://zhongsp.gitbooks.io/typescript-handbook/content/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Ext4.1.0 中文文档",
                        url = "http://extjs-doc-cn.github.io/ext4api/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Discover Meteor",
                        url = "http://zh.discovermeteor.com/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Meteor 中文文档",
                        url = "http://docs.meteorhub.org/#/basic/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Angular-Meteor 中文教程",
                        url = "http://angular.meteorhub.org/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "逐行剖析 Vue.js 源码",
                        url = "https://nlrx-wjc.github.io/Learn-Vue-Source-Code/"
                    ),
                    URLItemData(
                        groupTitle = "JavaScript",
                        title = "Chrome扩展及应用开发",
                        url = "http://www.ituring.com.cn/minibook/950"
                    ),
                    URLItemData(
                        groupTitle = "Kotlin",
                        title = "Kotlin 官方参考文档 中文版",
                        url = "https://hltj.gitbooks.io/kotlin-reference-chinese/content/"
                    ),
                    URLItemData(
                        groupTitle = "Kotlin",
                        title = "Kotlin 中文文档",
                        url = "https://huanglizhuo.gitbooks.io/kotlin-in-chinese/"
                    ),
                    URLItemData(
                        groupTitle = "Kotlin",
                        title = "Kotlin 参考文档",
                        url = "http://www.liying-cn.net/kotlin/docs/reference/"
                    ),
                    URLItemData(
                        groupTitle = "Kotlin",
                        title = "《Kotlin for android developers》中文版",
                        url = "https://wangjiegulu.gitbooks.io/kotlin-for-android-developers-zh/content/"
                    ),
                    URLItemData(
                        groupTitle = "LaTeX",
                        title = "一份其实很短的 LaTeX 入门文档",
                        url = "http://liam0205.me/2014/09/08/latex-introduction/"
                    ),
                    URLItemData(
                        groupTitle = "LaTeX",
                        title = "一份不太简短的 LATEX 2ε 介绍",
                        url = "http://www.mohu.org/info/lshort-cn.pdf"
                    ),
                    URLItemData(
                        groupTitle = "LISP",
                        title = "ANSI Common Lisp 中文翻譯版",
                        url = "http://acl.readthedocs.org/en/latest/"
                    ),
                    URLItemData(
                        groupTitle = "LISP",
                        title = "On Lisp 中文翻译版本",
                        url = "http://www.ituring.com.cn/minibook/862"
                    ),
                    URLItemData(
                        groupTitle = "LISP",
                        title = "Yet Another Scheme Tutorial Scheme入门教程",
                        url = "http://deathking.github.io/yast-cn/"
                    ),
                    URLItemData(
                        groupTitle = "LISP",
                        title = "Scheme语言简明教程",
                        url = "http://songjinghe.github.io/TYS-zh-translation/"
                    ),
                    URLItemData(
                        groupTitle = "LISP",
                        title = "Racket book",
                        url = "https://github.com/tyrchen/racket-book"
                    ),
                    URLItemData(
                        groupTitle = "Lua",
                        title = "Lua编程入门",
                        url = "https://github.com/andycai/luaprimer"
                    ),
                    URLItemData(
                        groupTitle = "Lua",
                        title = "Lua 5.1 参考手册 中文翻译",
                        url = "http://www.codingnow.com/2000/download/lua_manual.html"
                    ),
                    URLItemData(
                        groupTitle = "Lua",
                        title = "Lua 5.3 参考手册 中文翻译",
                        url = "http://cloudwu.github.io/lua53doc/"
                    ),
                    URLItemData(
                        groupTitle = "Lua",
                        title = "Lua源码欣赏",
                        url = "http://www.codingnow.com/temp/readinglua.pdf"
                    ),
                    URLItemData(
                        groupTitle = "OCaml",
                        title = "Real World OCaml",
                        url = "https://github.com/zforget/translation/tree/master/real_world_ocaml"
                    ),
                    URLItemData(
                        groupTitle = "Perl",
                        title = "Modern Perl 中文版",
                        url = "https://github.com/horus/modern_perl_book"
                    ),
                    URLItemData(
                        groupTitle = "Perl",
                        title = "Perl 程序员应该知道的事",
                        url = "http://perl.linuxtoy.org/"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "PHP 官方手册",
                        url = "http://php.net/manual/zh/"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "PHP调试技术手册",
                        url = "http://www.laruence.com/2010/06/21/1608.html"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "PHP之道：php-the-right-way wulijun版",
                        url = "http://wulijun.github.io/php-the-right-way/"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "PHP之道：php-the-right-way PHPHub版",
                        url = "http://laravel-china.github.io/php-the-right-way/"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "PHP 最佳实践",
                        url = "https://github.com/justjavac/PHP-Best-Practices-zh_CN"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "PHP 开发者实践",
                        url = "https://ryancao.gitbooks.io/php-developer-prepares/content/"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "深入理解PHP内核",
                        url = "https://github.com/reeze/tipi"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "PHP扩展开发及内核应用",
                        url = "http://www.walu.cc/phpbook/"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "Laravel5.1 中文文档",
                        url = "http://laravel-china.org/docs/5.1"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "Laravel 5.1 LTS 速查表",
                        url = "https://cs.phphub.org/"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "Symfony2 Cookbook 中文版",
                        url = "http://wiki.jikexueyuan.com/project/symfony-cookbook/"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "Symfony2中文文档",
                        url = "http://symfony-docs-chs.readthedocs.org/en/latest/"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "YiiBook几本Yii框架的在线教程",
                        url = "http://yiibook.com//doc"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "深入理解 Yii 2.0",
                        url = "http://www.digpage.com/"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "Yii 框架中文官网",
                        url = "http://www.yiichina.com/"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "简单易懂的PHP魔法",
                        url = "http://www.nowamagic.net/librarys/books/contents/php"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "swoole文档及入门教程",
                        url = "https://github.com/LinkedDestiny/swoole-doc"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "Composer 中文网",
                        url = "http://www.phpcomposer.com"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "Slim 中文文档",
                        url = "http://ww1.minimee.org/php/slim"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "Lumen 中文文档",
                        url = "http://lumen.laravel-china.org/"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "PHPUnit 中文文档",
                        url = "https://phpunit.de/manual/current/zh_cn/installation.html"
                    ),
                    URLItemData(
                        groupTitle = "PHP",
                        title = "PHP-LeetCode",
                        url = "https://github.com/wuqinqiang/leetcode-php"
                    ),
                    URLItemData(
                        groupTitle = "Prolog",
                        title = "笨办法学Prolog",
                        url = "http://fengdidi.github.io/blog/2011/11/15/qian-yan/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "廖雪峰 Python 2.7 中文教程",
                        url = "http://www.liaoxuefeng.com/wiki/001374738125095c955c1e6d8bb493182103fac9270762a000"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "廖雪峰 Python 3 中文教程",
                        url = "http://www.liaoxuefeng.com/wiki/0014316089557264a6b348958f449949df42a6d3a2e542c000"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "简明Python教程",
                        url = "http://www.kuqin.com/abyteofpython_cn/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "简明 Python 教程-Python 3",
                        url = "https://legacy.gitbook.com/book/lenkimo/byte-of-python-chinese-edition/details"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "零基础学 Python 第一版",
                        url = "http://www.kancloud.cn/kancloud/python-basic"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "零基础学 Python 第二版",
                        url = "http://www.kancloud.cn/kancloud/starter-learning-python"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "可爱的 Python",
                        url = "http://lovelypython.readthedocs.org/en/latest/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python 2.7 官方教程中文版",
                        url = "http://www.pythondoc.com/pythontutorial27/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python 3.3 官方教程中文版",
                        url = "http://www.pythondoc.com/pythontutorial3/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python Cookbook 中文版",
                        url = "http://www.kancloud.cn/thinkphp/python-cookbook"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python3 Cookbook 中文版",
                        url = "https://github.com/yidao620c/python3-cookbook"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "深入 Python",
                        url = "http://www.kuqin.com/docs/diveintopythonzh-cn-5.4b/html/toc/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "深入 Python 3",
                        url = "http://old.sebug.net/paper/books/dive-into-python3/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "PEP8 Python代码风格规范",
                        url = "https://code.google.com/p/zhong-wiki/wiki/PEP8"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Google Python 风格指南 中文版",
                        url = "http://zh-google-styleguide.readthedocs.org/en/latest/google-python-styleguide/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python入门教程",
                        url = "http://liam0205.me/2013/11/02/Python-tutorial-zh_cn/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "笨办法学 Python",
                        url = "http://old.sebug.net/paper/books/LearnPythonTheHardWay/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python自然语言处理中文版",
                        url = "http://pan.baidu.com/s/1qW4pvnY"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python 绘图库 matplotlib 官方指南中文翻译",
                        url = "http://liam0205.me/2014/09/11/matplotlib-tutorial-zh-cn/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Scrapy 0.25 文档",
                        url = "http://scrapy-chs.readthedocs.org/zh_CN/latest/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "ThinkPython",
                        url = "https://github.com/carfly/thinkpython-cn"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "ThinkPython 2ed",
                        url = "https://github.com/bingjin/ThinkPython2-CN"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python快速教程",
                        url = "http://www.cnblogs.com/vamei/archive/2012/09/13/2682778.html"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python 正则表达式操作指南",
                        url = "http://wiki.ubuntu.org.cn/Python正则表达式操作指南"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "python初级教程：入门详解",
                        url = "http://www.crifan.com/files/doc/docbook/python_beginner_tutorial/release/html/python_beginner_tutorial.html"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Twisted 与异步编程入门",
                        url = "https://www.gitbook.com/book/likebeta/twisted-intro-cn/details"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "TextGrocery 中文 API",
                        url = "http://textgrocery.readthedocs.org/zh/latest/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Requests: HTTP for Humans",
                        url = "http://requests-docs-cn.readthedocs.org/zh_CN/latest/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Pillow 中文文档",
                        url = "http://pillow-cn.readthedocs.org/en/latest/#"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "PyMOTW 中文版",
                        url = "http://pymotwcn.readthedocs.org/en/latest/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python 官方文档中文版",
                        url = "http://data.digitser.net/zh-CN/python_index.html"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Fabric 中文文档",
                        url = "http://fabric-chs.readthedocs.org"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Beautiful Soup 4.2.0 中文文档",
                        url = "http://beautifulsoup.readthedocs.org/zh_CN/latest/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python 中的 Socket 编程",
                        url = "https://legacy.gitbook.com/book/keelii/socket-programming-in-python-cn/details"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "用Python做科学计算",
                        url = "http://old.sebug.net/paper/books/scipydoc"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Sphinx 中文文档",
                        url = "http://www.pythondoc.com/sphinx/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "精通 Python 设计模式",
                        url = "https://github.com/cundi/Mastering.Python.Design.Patterns"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "python 安全编程教程",
                        url = "https://github.com/smartFlash/pySecurity"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "程序设计思想与方法",
                        url = "https://www.gitbook.com/book/wizardforcel/sjtu-cs902-courseware/details"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "知乎周刊·编程小白学Python",
                        url = "https://read.douban.com/ebook/16691849/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Scipy 讲义",
                        url = "https://github.com/cloga/scipy-lecture-notes_cn"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python 学习笔记 基础篇",
                        url = "http://www.kuqin.com/docs/pythonbasic.html"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python 学习笔记 模块篇",
                        url = "http://www.kuqin.com/docs/pythonmodule.html"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python 标准库 中文版",
                        url = "http://old.sebug.net/paper/books/python/%E3%80%8APython%E6%A0%87%E5%87%86%E5%BA%93%E3%80%8B%E4%B8%AD%E6%96%87%E7%89%88.pdf"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python进阶",
                        url = "https://www.gitbook.com/book/eastlakeside/interpy-zh/details"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python 核心编程 第二版",
                        url = "https://wizardforcel.gitbooks.io/core-python-2e/content/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python最佳实践指南",
                        url = "http://pythonguidecn.readthedocs.io/zh/latest/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python 精要教程",
                        url = "https://www.gitbook.com/book/wizardforcel/python-essential-tutorial/details"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Python 量化交易教程",
                        url = "https://www.gitbook.com/book/wizardforcel/python-quant-uqer/details"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Django 1.5 文档中文版",
                        url = "http://django-chinese-docs.readthedocs.org/en/latest/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Django 2.0 文档中文版",
                        url = "https://docs.djangoproject.com/zh-hans/2.0/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Django 最佳实践",
                        url = "https://github.com/yangyubo/zh-django-best-practices"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Django 2.1 搭建个人博客教程",
                        url = "https://www.dusaiphoto.com/article/detail/2/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Django搭建简易博客教程",
                        url = "https://www.gitbook.com/book/andrew-liu/django-blog/details"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "The Django Book 中文版",
                        url = "http://djangobook.py3k.cn/2.0/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Django 设计模式与最佳实践",
                        url = "https://github.com/cundi/Django-Design-Patterns-and-Best-Practices"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Django 网站开发 Cookbook",
                        url = "https://github.com/cundi/Web.Development.with.Django.Cookbook"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Django Girls 學習指南",
                        url = "https://www.gitbook.com/book/djangogirlstaipei/django-girls-taipei-tutorial/details"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Flask 文档中文版",
                        url = "http://docs.jinkan.org/docs/flask/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Jinja2 文档中文版",
                        url = "http://docs.jinkan.org/docs/jinja2/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Werkzeug 文档中文版",
                        url = "http://werkzeug-docs-cn.readthedocs.org/zh_CN/latest/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Flask之旅",
                        url = "http://spacewander.github.io/explore-flask-zh/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Flask 扩展文档汇总",
                        url = "https://www.gitbook.com/book/wizardforcel/flask-extension-docs/details"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Flask 大型教程",
                        url = "http://www.pythondoc.com/flask-mega-tutorial/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "SQLAlchemy 中文文档",
                        url = "http://docs.jinkan.org/docs/flask-sqlalchemy/"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Flask 入门教程",
                        url = "https://read.helloflask.com"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "web.py 0.3 新手指南",
                        url = "http://webpy.org/tutorial3.zh-cn"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Web.py Cookbook 简体中文版",
                        url = "http://webpy.org/cookbook/index.zh-cn"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Introduction to Tornado 中文翻译",
                        url = "http://demo.pythoner.com/itt2zh/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Tornado源码解析",
                        url = "http://www.nowamagic.net/academy/detail/13321002"
                    ),
                    URLItemData(
                        groupTitle = "Python",
                        title = "Tornado 4.3 文档中文版",
                        url = "https://tornado-zh.readthedocs.org/zh/latest/"
                    ),
                    URLItemData(
                        groupTitle = "R",
                        title = "R语言忍者秘笈",
                        url = "https://github.com/yihui/r-ninja"
                    ),
                    URLItemData(
                        groupTitle = "Ruby",
                        title = "Ruby 风格指南",
                        url = "https://github.com/JuanitoFatas/ruby-style-guide/blob/master/README-zhCN.md"
                    ),
                    URLItemData(
                        groupTitle = "Ruby",
                        title = "Rails 风格指南",
                        url = "https://github.com/JuanitoFatas/rails-style-guide/blob/master/README-zhCN.md"
                    ),
                    URLItemData(
                        groupTitle = "Ruby",
                        title = "笨方法學 Ruby",
                        url = "http://lrthw.github.io/"
                    ),
                    URLItemData(
                        groupTitle = "Ruby",
                        title = "Ruby on Rails 指南",
                        url = "http://guides.ruby-china.org/"
                    ),
                    URLItemData(
                        groupTitle = "Ruby",
                        title = "Ruby on Rails 實戰聖經",
                        url = "https://ihower.tw/rails4/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Ruby",
                        title = "Ruby on Rails Tutorial 原书第 3 版",
                        url = "http://railstutorial-china.org/"
                    ),
                    URLItemData(
                        groupTitle = "Ruby",
                        title = "Rails 实践",
                        url = "http://rails-practice.com/content/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Ruby",
                        title = "Rails 5 开发进阶-Beta",
                        url = "https://www.gitbook.com/book/kelby/rails-beginner-s-guide/details"
                    ),
                    URLItemData(
                        groupTitle = "Ruby",
                        title = "Rails 102",
                        url = "https://www.gitbook.com/book/rocodev/rails-102/details"
                    ),
                    URLItemData(
                        groupTitle = "Ruby",
                        title = "编写Ruby的C拓展",
                        url = "https://wusuopu.gitbooks.io/write-ruby-extension-with-c/content/"
                    ),
                    URLItemData(
                        groupTitle = "Ruby",
                        title = "Ruby 源码解读",
                        url = "https://ruby-china.org/topics/22386"
                    ),
                    URLItemData(
                        groupTitle = "Ruby",
                        title = "Ruby中的元编程",
                        url = "http://deathking.github.io/metaprogramming-in-ruby/"
                    ),
                    URLItemData(
                        groupTitle = "Rust",
                        title = "Rust编程语言 中文翻译",
                        url = "https://kaisery.github.io/trpl-zh-cn/"
                    ),
                    URLItemData(
                        groupTitle = "Rust",
                        title = "Rust Primer",
                        url = "https://github.com/rustcc/RustPrimer"
                    ),
                    URLItemData(
                        groupTitle = "Scala",
                        title = "Scala课堂",
                        url = "http://twitter.github.io/scala_school/zh_cn/index.html"
                    ),
                    URLItemData(
                        groupTitle = "Scala",
                        title = "Effective Scala",
                        url = "http://twitter.github.io/effectivescala/index-cn.html"
                    ),
                    URLItemData(
                        groupTitle = "Scala",
                        title = "Scala指南",
                        url = "http://zh.scala-tour.com/"
                    ),
                    URLItemData(
                        groupTitle = "Shell",
                        title = "Shell脚本编程30分钟入门",
                        url = "https://github.com/qinjx/30min_guides/blob/master/shell.md"
                    ),
                    URLItemData(
                        groupTitle = "Shell",
                        title = "Bash脚本15分钟进阶教程",
                        url = "http://blog.sae.sina.com.cn/archives/3606"
                    ),
                    URLItemData(
                        groupTitle = "Shell",
                        title = "Linux工具快速教程",
                        url = "https://github.com/me115/linuxtools_rst"
                    ),
                    URLItemData(
                        groupTitle = "Shell",
                        title = "shell十三问",
                        url = "https://github.com/wzb56/13_questions_of_shell"
                    ),
                    URLItemData(
                        groupTitle = "Shell",
                        title = "Shell编程范例",
                        url = "https://www.gitbook.com/book/tinylab/shellbook/details"
                    ),
                    URLItemData(
                        groupTitle = "Shell",
                        title = "Linux命令搜索引擎",
                        url = "https://wangchujiang.com/linux-command/"
                    ),
                    URLItemData(
                        groupTitle = "Swift",
                        title = "The Swift Programming Language 中文版",
                        url = "http://numbbbbb.github.io/the-swift-programming-language-in-chinese/"
                    ),
                    URLItemData(
                        groupTitle = "Swift",
                        title = "Swift 语言指南",
                        url = "http://dev.swiftguide.cn"
                    ),
                    URLItemData(
                        groupTitle = "Swift",
                        title = "Stanford 公开课，Developing iOS 8 Apps with Swift 字幕翻译文件",
                        url = "https://github.com/x140yu/Developing_iOS_8_Apps_With_Swift"
                    ),
                    URLItemData(
                        groupTitle = "Swift",
                        title = "C4iOS - COSMOS",
                        url = "http://c4ios.swift.gg"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "编译原理-紫龙书-中文第2版习题答案",
                        url = "https://github.com/fool2fish/dragon-book-exercise-answers"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "把《编程珠玑》读薄",
                        url = "http://hawstein.com/2013/08/11/make-thiner-programming-pearls/"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "Effective C++读书笔记",
                        url = "https://github.com/XiaolongJason/ReadingNote/blob/master/Effective%20C%2B%2B/Effective%20C%2B%2B.md"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "Golang 学习笔记、Python 学习笔记、C 学习笔记",
                        url = "https://github.com/qyuhen/book"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "Jsoup 学习笔记",
                        url = "https://github.com/code4craft/jsoup-learning"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "学习笔记: Vim、Python、memcached",
                        url = "https://github.com/lzjun567/note"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "图灵开放书翻译计划--C++、Python、Java等",
                        url = "http://www.ituring.com.cn/activity/details/2004"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "蒂姆·奥莱利随笔",
                        url = "http://g.yeeyan.org/books/2095"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "SICP 解题集",
                        url = "http://sicp.readthedocs.org/en/latest/"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "精彩博客集合",
                        url = "https://github.com/hacke2/hacke2.github.io/issues/2"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "中文文案排版指北",
                        url = "https://github.com/sparanoid/chinese-copywriting-guidelines"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "Standard C 语言标准函数库速查 Cheat Sheet",
                        url = "http://ganquan.info/standard-c/"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "Git Cheatsheet Chs",
                        url = "http://gh.amio.us/git-cheatsheet-chs/"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "GitBook简明教程",
                        url = "http://www.chengweiyang.cn/gitbook/index.html"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "制造开源软件",
                        url = "http://producingoss.com/zh/"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "提问的智慧",
                        url = "http://www.dianbo.org/9238/stone/tiwendezhihui.htm"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "Markdown 入门参考",
                        url = "https://github.com/LearnShare/Learning-Markdown"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "AsciiDoc简明指南",
                        url = "https://github.com/stanzgy/wiki/blob/master/markup/asciidoc-guide.asciidoc"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "背包问题九讲",
                        url = "http://love-oriented.com/pack/"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "老齐的技术资料",
                        url = "https://github.com/qiwsir/ITArticles"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "前端技能汇总",
                        url = "https://github.com/JacksonTian/fks"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "借助开源项目，学习软件开发",
                        url = "https://github.com/zhuangbiaowei/learn-with-open-source"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "前端工作面试问题",
                        url = "https://github.com/h5bp/Front-end-Developer-Interview-Questions/tree/master/Translations/Chinese"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "leetcode/lintcode题解/算法学习笔记",
                        url = "https://www.gitbook.com/book/yuanbin/algorithm/details"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "前端开发笔记本",
                        url = "https://github.com/li-xinyang/FEND_Note"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "LeetCode题解",
                        url = "https://siddontang.gitbooks.io/leetcode-solution/content/"
                    ),
                    URLItemData(
                        groupTitle = "读书笔记及其它",
                        title = "《不可替代的团队领袖培养计划》",
                        url = "https://leader.js.cool/#/"
                    )
                )
            )

    }

    fun getGroupData(): List<URLGroupData> {
        return Store.getAll<URLGroupData>()
    }

    fun getItemData(groupTitle: String): List<URLItemData> {
         return Store.queryCreate(URLItemData_.groupTitle.equal(groupTitle)).build().start()
    }
}