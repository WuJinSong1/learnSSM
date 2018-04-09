<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style type="text/css">
table {
    width: 80%;
    border: 1px solid #ccc;
    margin-left: 10%;
    text-align: center;
}
table thead tr{
    border: 1px solid #ccc;
    background: yellow;
    height: 30px;
}
table tbody td{
    border: 1px solid #ccc;
    height: 25px;
}
</style>
</head>

<body>
    <br />
    <h1 style="text-align: center;width:100%;">SSM_DEMO By Advance</h1>
    <br />
    <br />
    <hr />
    <br />
    <br />
    <br />
    <table>
        <thead>
            <tr>
                <td>sId</td>
                <td>sName</td>
                <td>sText</td>
                <td>sAge</td>
            </tr>
        </thead>
        <c:forEach items="${beans }" var="bean">
            <tbody>
                <tr>
                    <td>${bean.sId }</td>
                    <td>${bean.sName }</td>
                    <td>${bean.sText }</td>
                    <td>${bean.sAge }</td>
                </tr>
            </tbody>
        </c:forEach>
    </table>
</body>
</html>