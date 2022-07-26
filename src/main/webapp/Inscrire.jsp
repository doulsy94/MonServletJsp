<%@ page pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<title>Inscription</title>
</head>
<body>

<fieldset style="width:25%;">

	<form method="post" action="Accueil">
	<h2>Inscrivez-vous</h2>
	<table>
		<tr>
		<td>Nom: </td><td><input type="text" placeholder="Votre nom" name="nom" required/><br></td>
		</tr>
		
		<tr>
		<td>Prenom: </td><td><input type="text" placeholder="Votre prenom" name="prenom" required /><br></td>
		</tr>
		
		<tr>
		<td>Pseudo: </td><td><input type="text" placeholder="Votre pseudo" name="pseudo" required/><br></td>
		</tr>
		
		<tr>
		<td>Email: </td><td><input type="email" placeholder="Votre email" name="email"><br></td>
		</tr>
		
		<tr>
		<td>Mot de passe: </td><td><input type="password" placeholder="Mot de passe" name="pass"><br></td>
		</tr>
		
		<tr>
		<td>Mot de passe: </td><td><input type="password" placeholder="Votre mot de passe" name="pass1"/><br></td>
		</tr>
		
		<td colpsan="2"><input type="submit" name="" value="Sinscrire"></td>
		<td colpsan="2"><input type="reset" name="" value="Annuler"></td>
		
	</table>
	</form>
	</fieldset>
</body>
</html>