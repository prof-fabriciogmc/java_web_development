/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fabriciogmc
 */
@WebServlet({"*.action","/"})
public class HttpServletBasico extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req,
                       HttpServletResponse res){
        
        String path = req.getServletPath();
        ServletContext sc = req.getServletContext();
        System.out.println(path); 
        switch (path){
            case "/":
               try{
                    sc.getRequestDispatcher("/jsp/form.jsp").forward(req, res);
                } catch (Exception e){}
               break;
            case "/escrevernome.action":
                try{
                    req.setCharacterEncoding("UTF-8");
                    String nome = req.getParameter("nome_completo");
                    nome = nome.toUpperCase();
                    res.setContentType("text/html");
                    res.setCharacterEncoding("UTF-8");
                    req.setAttribute("nomeCompleto", nome);
                    sc.getRequestDispatcher("/jsp/resposta.jsp").forward(req, res);
                }catch (Exception e){}
            break;
            default:
                try{
                   sc.getRequestDispatcher("/jsp/nao_encontrado.jsp").forward(req, res);
                }catch (Exception e){}               
        }
        
    }  
}