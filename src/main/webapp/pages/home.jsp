<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
    <fieldset>
    	<legend>Adding</legend>
		<form action="addAlien" align="center">
			Aname: <input type="text" name="aname"><br><br>
			Aid: <input type="text" style="margin-left:23px" name="aid"><br><br>
			Tech: <input type="text" style="margin-left:22px" name="aid"><br><br>
			<input type="submit" value="Send">	 
		</form><br><br>
	</fieldset><br><br>
	<fieldset>
		<legend>Fetching</legend>
		<form action="getAlien" align="center">
			Aid: <input type="text" style="margin-left:23px" name="aid"><br><br>
			<input type="submit" value="Send">	 
		</form>
	</fieldset>
</body>
</html>