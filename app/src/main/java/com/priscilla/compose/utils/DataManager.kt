package com.priscilla.compose.utils

import com.priscilla.compose.bean.UrlData

/**
 * Created by Priscilla Cheung on 2021年12月10日15:07:26
 */
object DataManager {
    private var titleList: ArrayList<UrlData> = ArrayList()
    fun createData() {
        if (Store.getAll<URLGroupData>().isEmpty())
            Store.put<URLGroupData>(
                listOf(
                    URLGroupData(title = "非编程类"),
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
                    URLGroupData(title = "读书笔记及其它"),
                    URLGroupData(title = "测试相关"),
                )
            )
        if (titleList.isEmpty())
            titleList.addAll(
                listOf<UrlData>(
                    UrlData(
                        "操作系统", listOf(
                            UrlData.UrlItemData(
                                "开源世界旅行手册",
                                "http://i.linuxtoy.org/docs/guide/index.html"
                            ),
                            UrlData.UrlItemData("鸟哥的Linux私房菜", "http://linux.vbird.org/"),
                            UrlData.UrlItemData(
                                "The Linux Command Line",
                                "http://billie66.github.io/TLCL/index.html"
                            ),
                            UrlData.UrlItemData(
                                "Linux 设备驱动",
                                "http://oss.org.cn/kernel-book/ldd3/index.html"
                            ),
                            UrlData.UrlItemData(
                                "深入分析Linux内核源码",
                                "http://www.kerneltravel.net/kernel-book/%E6%B7%B1%E5%85%A5%E5%88%86%E6%9E%90Linux%E5%86%85%E6%A0%B8%E6%BA%90%E7%A0%81.html"
                            ),
                            UrlData.UrlItemData(
                                "UNIX TOOLBOX",
                                "http://cb.vu/unixtoolbox_zh_CN.xhtml"
                            ),
                            UrlData.UrlItemData(
                                "Docker中文指南",
                                "https://github.com/widuu/chinese_docker"
                            ),
                            UrlData.UrlItemData(
                                "Docker —— 从入门到实践",
                                "https://github.com/yeasy/docker_practice"
                            ),
                            UrlData.UrlItemData(
                                "Docker入门实战",
                                "http://yuedu.baidu.com/ebook/d817967416fc700abb68fca1"
                            ),
                            UrlData.UrlItemData(
                                "Docker Cheat Sheet",
                                "https://github.com/wsargent/docker-cheat-sheet/tree/master/zh-cn#docker-cheat-sheet"
                            ),
                            UrlData.UrlItemData("FreeRADIUS新手入门", "http://freeradius.akagi201.org"),
                            UrlData.UrlItemData(
                                "Mac 开发配置手册",
                                "https://aaaaaashu.gitbooks.io/mac-dev-setup/content/"
                            ),
                            UrlData.UrlItemData(
                                "FreeBSD 使用手册",
                                "https://www.freebsd.org/doc/zh_CN/books/handbook/index.html"
                            ),
                            UrlData.UrlItemData(
                                "Linux 命令行(中文版)",
                                "http://billie66.github.io/TLCL/book/"
                            ),
                            UrlData.UrlItemData(
                                "Linux 构建指南",
                                "http://works.jinbuguo.com/lfs/lfs62/index.html"
                            ),
                            UrlData.UrlItemData(
                                "Linux工具快速教程",
                                "https://github.com/me115/linuxtools_rst"
                            ),
                            UrlData.UrlItemData(
                                "Linux Documentation (中文版)",
                                "https://www.gitbook.com/book/tinylab/linux-doc/details"
                            ),
                            UrlData.UrlItemData(
                                "嵌入式 Linux 知识库 (eLinux.org 中文版)",
                                "https://www.gitbook.com/book/tinylab/elinux/details"
                            ),
                            UrlData.UrlItemData(
                                "理解Linux进程",
                                "https://github.com/tobegit3hub/understand_linux_process"
                            ),
                            UrlData.UrlItemData(
                                "命令行的艺术",
                                "https://github.com/jlevy/the-art-of-command-line/blob/master/README-zh.md"
                            ),
                            UrlData.UrlItemData(
                                "SystemTap新手指南",
                                "https://spacewander.gitbooks.io/systemtapbeginnersguide_zh/content/index.html"
                            ),
                            UrlData.UrlItemData(
                                "操作系统思考",
                                "https://github.com/wizardforcel/think-os-zh"
                            ),
                        )
                    ),
                    UrlData(
                        "智能系统", listOf(
                            UrlData.UrlItemData(
                                "一步步搭建物联网系统",
                                "https://github.com/phodal/designiot"
                            ),
                        )
                    ),
                    UrlData(
                        "分布式系统", listOf(
                            UrlData.UrlItemData(
                                "走向分布式",
                                "http://dcaoyuan.github.io/papers/pdfs/Scalability.pdf"
                            ),
                        )
                    ),
                    UrlData(
                        "编译原理", listOf(
                            UrlData.UrlItemData(
                                "《计算机程序的结构和解释》公开课 翻译项目",
                                "https://github.com/DeathKing/Learning-SICP"
                            ),
                        )
                    ),
                    UrlData(
                        "函数式概念", listOf(
                            UrlData.UrlItemData(
                                "傻瓜函数编程",
                                "https://github.com/justinyhuang/Functional-Programming-For-The-Rest-of-Us-Cn"
                            ),
                        )
                    ),
                    UrlData(
                        "计算机图形学", listOf(
                            UrlData.UrlItemData(
                                "OpenGL 教程",
                                "https://github.com/zilongshanren/opengl-tutorials"
                            ),
                            UrlData.UrlItemData(
                                "WebGL自学网",
                                "http://html5.iii.org.tw/course/webgl/"
                            ),
                            UrlData.UrlItemData(
                                "《Real-Time Rendering 3rd》提炼总结",
                                "https://github.com/QianMo/Real-Time-Rendering-3rd-Summary-Ebook"
                            )
                        )
                    ),
                    UrlData(
                        "WEB服务器", listOf(
                            UrlData.UrlItemData(
                                "Nginx开发从入门到精通(淘宝团队出品)",
                                "http://tengine.taobao.org/book/index.html"
                            ),
                            UrlData.UrlItemData(
                                "Nginx教程从入门到精通(PDF版本，运维生存时间出品)",
                                "http://www.ttlsa.com/nginx/nginx-stu-pdf/"
                            ),
                            UrlData.UrlItemData(
                                "OpenResty最佳实践",
                                "https://www.gitbook.com/book/moonbingbing/openresty-best-practices/details"
                            ),
                            UrlData.UrlItemData(
                                "Apache 中文手册",
                                "http://works.jinbuguo.com/apache/menu22/index.html"
                            ),
                        )

                    ),
                    UrlData(
                        "版本控制", listOf(
                            UrlData.UrlItemData(
                                "Git教程",
                                "http://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000"
                            ),
                            UrlData.UrlItemData(
                                "git - 简易指南",
                                "http://rogerdudler.github.io/git-guide/index.zh.html"
                            ),
                            UrlData.UrlItemData(
                                "猴子都能懂的GIT入门",
                                "http://backlogtool.com/git-guide/cn/"
                            ),
                            UrlData.UrlItemData(
                                "Git 参考手册",
                                "http://gitref.justjavac.com"
                            ),
                            UrlData.UrlItemData(
                                "Pro Git",
                                "http://git-scm.com/book/zh/v2"
                            ),
                            UrlData.UrlItemData(
                                "Pro Git 中文版",
                                "https://www.gitbook.com/book/0532/progit/details"
                            ),
                            UrlData.UrlItemData(
                                "Git Magic",
                                "http://www-cs-students.stanford.edu/~blynn/gitmagic/intl/zh_cn/"
                            ),
                            UrlData.UrlItemData(
                                "GotGitHub",
                                "http://www.worldhello.net/gotgithub/index.html"
                            ),
                            UrlData.UrlItemData(
                                "Git权威指南",
                                "http://www.worldhello.net/gotgit/"
                            ),
                            UrlData.UrlItemData(
                                "Git Community Book 中文版",
                                "http://gitbook.liuhui998.com/index.html"
                            ),
                            UrlData.UrlItemData(
                                "Mercurial 使用教程",
                                "https://www.mercurial-scm.org/wiki/ChineseTutorial"
                            ),
                            UrlData.UrlItemData(
                                "HgInit (中文版)",
                                "http://bucunzai.net/hginit/"
                            ),
                            UrlData.UrlItemData(
                                "沉浸式学 Git",
                                "http://igit.linuxtoy.org"
                            ),
                            UrlData.UrlItemData(
                                "Git-Cheat-Sheet",
                                "https://github.com/flyhigher139/Git-Cheat-Sheet"
                            ),
                            UrlData.UrlItemData(
                                "GitHub秘籍",
                                "https://snowdream86.gitbooks.io/github-cheat-sheet/content/zh/index.html"
                            ),
                            UrlData.UrlItemData(
                                "GitHub帮助文档",
                                "https://github.com/waylau/github-help"
                            ),
                            UrlData.UrlItemData(
                                "git-flow 备忘清单",
                                "http://danielkummer.github.io/git-flow-cheatsheet/index.zh_CN.html"
                            ),
                            UrlData.UrlItemData(
                                "svn 手册",
                                "http://svnbook.red-bean.com/nightly/zh/index.html"
                            ),
                            UrlData.UrlItemData(
                                "GitHub漫游指南",
                                "https://github.com/justinyhuang/Functional-Programming-For-The-Rest-of-Us-Cn"
                            ),
                        )
                    ),
                    UrlData(
                        "编辑器", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "NoSQL", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "PostgreSQL", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "MySQL", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "管理和监控", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "项目相关", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "设计模式", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Web", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "大数据", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "编程艺术", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "其它", listOf(
                            UrlData.UrlItemData(
                                "前端工程师的入门与进阶",
                                "https://shenbao.github.io/2017/04/22/justjavac-live/"
                            ),
                            UrlData.UrlItemData(
                                "如何正确的学习 Node.js",
                                "https://github.com/i5ting/How-to-learn-node-correctly"
                            ),
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Android", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "APP", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "AWK", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "C/C++", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        ".Net/C#", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Clojure", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "CSS/HTML", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Dart", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Elixir", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Erlang", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Fortran", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Go", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Groovy", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Haskell", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "iOS", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Java", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "JavaScript", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "jQuery", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Node.js", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "underscore.js", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "backbone.js", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "AngularJS", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Zepto.js", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Sea.js", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "React.js", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "impress.js", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "CoffeeScript", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "TypeScript", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "ExtJS", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Meteor", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "VueJS", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Kotlin", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "LaTeX", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "LISP", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Lua", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "OCaml", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Perl", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "PHP", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Prolog", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Python", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Django", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Flask", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "web.py", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Tornado", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "R", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Ruby", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Rust", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Scala", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Shell", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "Swift", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                    UrlData(
                        "读书笔记及其它", listOf(
                            UrlData.UrlItemData(
                                "",
                                ""
                            ),
                        )
                    ),
                ),

                )
    }

    fun getGroupData(): List<URLGroupData> {
        return Store.getAll<URLGroupData>()
    }
}