/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 *
 * @author fabricio
 */
public class HttpServletBasicoTest {
 
    @Test
    public void doGetTest(){
        HttpServletRequest req = Mockito.mock(HttpServletRequest.class);
        Mockito.when(req.getParameter("nome_completo")).thenReturn("Fabricio");
        HttpServletResponse res = Mockito.mock(HttpServletResponse.class);  
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try{ 
            Mockito.when(res.getWriter()).thenReturn(printWriter);
        } catch (Exception e ) {}
        HttpServletBasico httpSB = new HttpServletBasico();
        httpSB.doGet(req, res);
        String response = null;
        try{
           response =  res.getOutputStream().toString();
        } catch(Exception e){
            
        }
        
        String expected = null;
        try {
            expected = new String("Seu nome é: Fabricio".getBytes(),
                    "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Erro de encoding");
        }
        assertEquals(expected, stringWriter.toString());        
    }
}
