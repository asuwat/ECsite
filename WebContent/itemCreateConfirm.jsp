<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table >
	<s:form action="ItemCreateCompleteAction">
		<tr>
			<td>
				<label>商品名:</label>
			</td>
			<td>
				<s:property value="itemName"/>
			</td>
		</tr>
		<tr>
			<td>
				<label>価格:</label>
			</td>
			<td>
				<s:property value="itemPrice"/>
			</td>
		</tr>
		<tr>
			<td>
				<label>数量:</label>
			</td>
			<td>
				<s:property value="itemStock"/>
			</td>
		</tr>
		<s:submit value="登録"/>

	</s:form>
</table>
</body>
</html>