package com.doul.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.doul.beans.Utilisateur1;


@WebServlet("/Monservlet")
public class Monservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Monservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/Inscrire.jsp").forward(request, response);
}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String pseudo=request.getParameter("pseudo");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		String pass1=request.getParameter("pass1");
		String erreurs="";
		
		if(pass.equals(pass1)) {
			
			HttpSession session = request.getSession();
			List<Utilisateur1> list=(List<Utilisateur1>)session.getAttribute("list");
			if(list==null) {
				list=new ArrayList<Utilisateur1>();
			}
			
			Utilisateur1 user=new Utilisateur1(nom,prenom,pseudo,email,pass,pass1);
			
			list.add(user);
			session.setAttribute("list", list);
			session.setAttribute("lis", user);
		
			this.getServletContext().getRequestDispatcher("/Accueil.jsp").forward(request, response);

		}else {
			erreurs = "Les mots de passe ne sont pas correct";
			request.setAttribute("erreurs", erreurs);
			request.getRequestDispatcher("/Inscrire.jsp").forward(request, response);
		}
		}
		
		
		

}
