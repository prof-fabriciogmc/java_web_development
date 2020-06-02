<%-- 
    Author: Fabrício Galende Marques de Carvalho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que gera uma tabela dinâmica.</title>
        <style>
            td{
                border-style:solid;
            }
        </style>
    </head>
    <body>
        <%
            int linhas = (int) request.getAttribute("numLinhas");
            int colunas = (int) request.getAttribute("numColunas");
            int x = 1;
            if(linhas >0 && colunas>0){
                
                out.print("<table>");
                for(int i=0; i<linhas;++i){
                    out.print("<tr>");
                    for(int j=0; j<colunas;++j){
                        out.print("<td>");
                        out.print(x);
                        out.print("</td>");
                        ++x;
                    }
                    out.print("</tr>");
                }
                out.print("<table");
            }
        %>
    </body>
</html>
