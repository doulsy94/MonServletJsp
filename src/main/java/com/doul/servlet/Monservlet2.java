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


@WebServlet("/Monservlet2")
public class Monservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Monservlet2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<Utilisateur1> list=(List<Utilisateur1>)session.getAttribute("list");
		if(list==null) {
			list=new ArrayList<Utilisateur1>();
		}
		session.setAttribute("list", list);
		this.getServletContext().getRequestDispatcher("/Accueil.jsp").forward(request, response);
	
	}

}
