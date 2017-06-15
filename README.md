# finereport
finereport  报表嵌入到自己的web项目中

1、详细步骤  http://blog.csdn.net/qq_30009669/article/details/54710492#reply  
2、![结果截图](https://github.com/yangyang5214/finereport/blob/master/src/main/resources/image/20170615093947.png)
3、配置信息
reportlets文件：放FineReport模板文件
resourseces文件：放datasourse.xml文件信息，该文件只要内容就是数据库的连接信息。
web.xml:文件添加servlet
 <servlet>
    <servlet-name>ReportServer</servlet-name>
    <servlet-class>com.fr.web.ReportServlet</servlet-class>
    <load-on-startup>0</load-on-startup>
  </servlet>

  <servlet-mapping>
    <servlet-name>ReportServer</servlet-name>
    <url-pattern>/ReportServer</url-pattern>
  </servlet-mapping>
  4、访问路径类似：
   http://localhost:8080/ReportServer?reportlet=user.cpt
