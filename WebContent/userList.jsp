<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table{
margin: auto;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" >
<tr>
    <th>ID</th>
    <th>ログインID</th>
    <th>名前</th>
    <th>登録日</th>
</tr>
<s:iterator value="dto">
    <tr>
        <td><s:property value="id"/></td>
        <td><s:property value="loginId"/></td>
        <td><s:property value="userName"/></td>
        <td><s:property value="insertDate"/></td>
    </tr>
</s:iterator>
</table>
</body>
</html>