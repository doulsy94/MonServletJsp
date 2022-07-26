<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Connection</title>
</head>
<body>
<fieldset style="width:25%;">
<table>
	<form method="post" action="/MonServletJsp/Monservlet2">
	
	<h2>Connectez-vous</h2>
		<tr>
		<td>Pseudo: </td><td><input type="text" placeholder="Votre pseudo" name="pseudo" required/><br></td>
		</tr>
		
		<tr>
		<td>Password: </td><td><input type="password" placeholder="Votre mot de passe" name="pass" required/><br></td>
		</tr>
		<td colpsan="2"><input type="submit" name="" value="Sinscrire"></td>
		<td colpsan="2"><input type="reset" name="" value="Annuler"></td>
		<table>	
	</form>
	</fieldset>
</body>
</html>