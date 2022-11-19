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
public class FilterId implements Filter {

    public void init(FilterConfig filterConfig) {}
    
  
    public void destroy() {}


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpServletRequest req = (HttpServletRequest) request;
        out.println("<b>Filter1 is filtering the request: </b>");
        //String n=request.getParameter("n");
            int id=Integer.parseInt(request.getParameter("id"));
        if (id <= 0 ) {
            out.println("please enter the student id ");
        } else {
            chain.doFilter(request, response);
        }

//To change body of generated methods, choose Tools | Templates.
    }

    
}
