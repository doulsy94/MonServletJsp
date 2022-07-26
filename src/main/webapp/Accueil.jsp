<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page import="java.util.List" %>
<%@page import="com.doul.beans.Utilisateur1" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>	
	<%  //HttpSession sess=request.getSession();
		Utilisateur1 us = (Utilisateur1) session.getAttribute("lis");
	%>
	<h2> Bienvenue <% out.print(us.getNom()); %></h2>
	
	<p> La liste des utilisateurs sont: </p>
	
	<% 
	
	  List<Utilisateur1> list = (ArrayList<Utilisateur1>) session.getAttribute("list");
	%>
	<table>
		<% for(Utilisateur1 user : list){%>
		<tr>
			<td><%= user.getNom() %> |</td>
			<td><%= user.getPrenom() %> |</td>
			<td><%= user.getPseudo() %> |</td>
			<td><%= user.getEmail() %></td>
		</tr>	
	<%} %>
	</table>
	<form method="post" action="Login">
	<td colpsan="2">
		<!-- <input type="submit" name="" value="Déconnecter">-->
		<a href="/MonServletJsp/Monservlet2">Déconnecter</a>
	</td>
	</form>

</body>
</html>