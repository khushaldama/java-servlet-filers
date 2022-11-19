/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author admin
 */
public class FilterName implements Filter {

    
    public void init(FilterConfig filterConfig) {}
    
  
    public void destroy() {}


    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpServletRequest req = (HttpServletRequest) request;
        out.println("<b>FilterName is filtering the request: </b>");
            String n=request.getParameter("n");
        if (n.equals("")) {
            out.println("please enter the student name");
        } else {
            chain.doFilter(request, response);
        }

//To change body of generated methods, choose Tools | Templates.
    }

    
}
