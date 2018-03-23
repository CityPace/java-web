package com.qst.chapter01.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void service(ServletRequest arg0, ServletResponse arg1)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	
    	String name = arg0.getParameter("name");
    	String pass = arg0.getParameter("pass");
    	
    	if(name != null&& pass != null){
    		if(name.equals("admin") && pass.equals("123")){
    			arg0.setAttribute("USERNAME", name);
    			RequestDispatcher dispatcher=arg0.getRequestDispatcher("/helloservlet");
    		    dispatcher.forward(arg0, arg1);
    		}
    	}
    	
    	arg1.setContentType("text/html;charset=utf-8");
		PrintWriter out = arg1.getWriter();
		
		      out.write("<html>\r\n");
		      out.write("  \r\n");
		      out.write("  <body>\r\n");
		      out.write("   <form action=\"/chapter01/HelloServlet\" method=\"post\">\r\n");
		      out.write("   <p>�û���:<input name=\"name\" type=\"text\"></p>\r\n");
		      out.write("   <p>����:<input name=\"pass\" type=\"password\"></p>\r\n");
		      out.write("   <p><input type=\"submit\" value=\"��¼\"></p>\r\n");
		      out.write("   \r\n");
		      out.write("   </form>\r\n");
		      out.write("   \r\n");
		      out.write("  </body>\r\n");
		      out.write("</html>\r\n");
    }
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName() + "init()");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName() + "destroy()");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	/*	response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		      
		/*out.println("<HTML>");
		out.println("<HEAD><TITLE>The first Servlet</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("Hello Servlet!");
		out.println("<BODY>");
		out.println("<HTML>");
		out.flush();
		out.close();*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
