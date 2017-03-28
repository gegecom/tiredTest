<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML>
<html>
<body>
	<h2>计算器</h2>
	<form action="<%=path%>/calculater/calculate">
	<input type="text" width="10px" placeholder="数值1" name="value1">
	<select name="flag">
		<option value="0">+</option>
		<option value="1">-</option>
		<option value="2">x</option>
		<option value="3">/</option>
	</select>
	<input type="text" placeholder="数值2" name="value2">
	<button type="submit">=</button>
	<span id="lastValue"></span>
	</select>
	</form>
</body>
</html>
