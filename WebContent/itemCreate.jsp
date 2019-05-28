<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理画面</title>
<style type="text/css">
    .main{
        padding: 40px;
        margin-left: 100px;
        margin-right: 100px;
        border-style: solid;
        text-align: center;



    }
    .box{
        border-style: solid;
        display: inline-block;
        height: 300px;
        width: 200px;
        margin: 30px;
    }

</style>
</head>
<body>

<table >
	<s:form action="ItemCreateConfirmAction">
		<tr>
			<td>
				<label>商品名:</label>
			</td>
			<td>
				<input type=text name="itemName"/>
			</td>
		</tr>
		<tr>
			<td>
				<label>価格:</label>
			</td>
			<td>
				<input type=text name="itemPrice"/>
			</td>
		</tr>
		<tr>
			<td>
				<label>数量:</label>
			</td>
			<td>
				<input type=text name="itemStock"/>
			</td>
		</tr>
		<s:submit value="登録"/>

	</s:form>
</table>
</body>
</html>