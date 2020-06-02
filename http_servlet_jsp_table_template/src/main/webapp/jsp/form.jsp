<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head> 
        <title> Formulário Simples </title>
        <meta charset="utf-8">
    </head>
    <body>
        <form method="get" 
         action="gerar_tabela.action">
            Número de Linhas <input name="num_linhas"/><br/>
            Número de Colunas <input name="num_colunas"/><br/>
            <input type="submit">
        </form>
    </body>    
</html>