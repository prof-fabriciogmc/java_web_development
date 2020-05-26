package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author fabriciogmc
 */
@WebServlet(urlPatterns={"/escrevernome"})
public class ServletBasico extends GenericServlet{
    @Override
    public void service(ServletRequest req, ServletResponse res) 
           throws ServletException, IOException {        
        String nome = req.getParameter("nome");
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");
        PrintWriter pw = res.getWriter();
        pw.print(new String("Seu nome é: ".getBytes(), "UTF-8")
                + nome + " <br/>");
        pw.close();
    }    
}
