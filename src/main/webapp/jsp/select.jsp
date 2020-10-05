<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/10/1
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/doselect" method="post">
    <table border="1" align="center" class="tableb" width="550px">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>等级</th>
            <th>部门</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${persons}" var="per">
            <tr>

                <td>${per.id}</td>
                <td>${per.name}</td>
                <td><c:if test="${per.gender==0}">
                    女
                </c:if><c:if test="${per.gender==1}">
                    男
                </c:if></td>
                <td>${per.age}</td>
                <td><c:if test="${per.rank==1}">
                    1级
                </c:if><c:if test="${per.rank==2}">
                    2级
                </c:if><c:if test="${per.rank==3}">
                    3级
                </c:if><c:if test="${per.rank==4}">
                    4级
                </c:if><c:if test="${per.rank==5}">
                    5级
                </c:if><c:if test="${per.rank==6}">
                    6级
                </c:if></td>
                <td>${per.department}</td>
                <td><a href="/del/${per.id}">删除</a></td>
            </tr>
        </c:forEach>

    </table>
    <p  align="center" ><a  href="/toadd"  style="text-align: center">考勤登记</a></p>
</form>
<script>
    $(function () {
        $("tr:first").css("background-color", "red");
        $("tr:odd").css("background-color", "pink");

    })
</script>
</body>
</html>
