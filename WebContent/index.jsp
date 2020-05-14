<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator App</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<h1>SIMPLE CALCULATOR</h1>
	<form class="form" method="post" action="/calculator">
		<label>First Operand:</label><input type="text" name="op1" /></br> 
		<select name="operator">
			<option value="-">-</option>
			<option value="+">+</option>
			<option value="*">x</option>
			<option value="/">/</option>
		</select> 
		<label>Second Operand:</label><input type="text" name="op2" />
		 <input type="submit" value="Calculate"/>
	</form>
</body>
</html>