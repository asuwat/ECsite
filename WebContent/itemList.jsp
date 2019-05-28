<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{
margin: auto;
}
</style>
</head>
<body>
<table border="1">
<tr>
    <th>商品名</th>
    <th>価格</th>
    <th>数量</th>
</tr>
<s:iterator value="itemList">
    <tr>
        <td><s:property value="itemName"/></td>
        <td><s:property value="itemPrice"/></td>
        <td><s:property value="itemStock"/></td>
    </tr>
</s:iterator>
</table>
</body>
</html>