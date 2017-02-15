/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bwatch;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hansa
 */
@WebServlet(name = "ApplyForPosition", urlPatterns = {"/ApplyForPosition"})
public class ApplyForPosition extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession session=request.getSession(false);  
            if(session!=null){  
                Integer userId =(Integer)session.getAttribute("logedUser");
                String jobId = request.getParameter("jobId");
                if(userId != null){
                out.println("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">");
                out.println("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">");
                out.println("<link rel=\"stylesheet\" href=\"css/nivo-lightbox.css\">");
                out.println("<link rel=\"stylesheet\" href=\"css/nivo_themes/default/default.css\">");
                out.println("<link rel=\"stylesheet\" href=\"css/intense-style.css\">");
                out.println("<link rel=\"stylesheet\" href=\"css/style.css\">");
                out.println("<title>Welcome to BlackWatch</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("    <div class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">");
                out.println("  <div class=\"container\">");
                out.println("    <div class=\"navbar-header\">");
                out.println("      <button class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\"><span class=\"icon icon-bar\"></span> <span class=\"icon icon-bar\"></span> <span class=\"icon icon-bar\"></span></button>");
                out.println("      <a><img src=\"images/logofinal.jpg\" class=\"img-responsive\"/></a></div>");
                out.println("    <div class=\"collapse navbar-collapse\">");
                out.println("      <ul class=\"nav navbar-nav navbar-right\">");
                out.println("       <li><a href=\"index.html#home\" class=\"smoothScroll\">HOME</a></li>");
                out.println("        <li><a href=\"index.html#service\" class=\"smoothScroll\">JOBS</a></li>");
                out.println("        <li><a href=\"index.html#about\" class=\"smoothScroll\">ABOUT</a></li>");
                out.println("        <li><a href=\"index.html#portfolio\" class=\"smoothScroll\">CLIENTS</a></li>");
                out.println("        <li><a href=\"index.html#pricing\" class=\"smoothScroll\">VACANCIES</a></li>");
                out.println("        <li><a href=\"index.html#contact\" class=\"smoothScroll\">CONTACT</a></li>");
                out.println("        <a href=\"userHome.html\"><img src=\"images/user.png\"/></a>");
                out.println("      </ul>");
                out.println("    </div>");
                out.println("  </div>");
                out.println("</div>");
                out.println("<div id=\"searchMID\">");
                out.println(" <div class=\"container\">");
                String applyInsertSql = "insert into jobsbyuser(userId,jobId) values("+userId+","+Integer.parseInt(jobId)+")";
                DbUtil db = new DbUtil();
                DbUtil.insertion(applyInsertSql);
                out.println("<h1>You are SucessFully Applied for the Position</h1>");
                out.println("</div>");
                out.println("</div>");
                out.println("<div class=\"copyright\">");
                out.println("  <div class=\"container\">");
                out.println("    <div class=\"row\">");
                out.println("      <div class=\"col-md-12 col-sm-12\">");
                out.println("        <p>&copy; Intense 7 . All Rights Reserved | Design: <a target=\"_blank\" rel=\"nofollow\" href=\"http://www.intense7.com\">intense7</a></p>");
                out.println("      </div>");
                out.println("    </div>");
                out.println("  </div>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
                }else{
                    out.println("<h1> You are not logged in or sign up please login</h1>");
                    response.sendRedirect("userHome.html"); 
                }             
            }else{
                /* TODO output your page here. You may use following sample code. */  
                out.println("<h1> You are not logged in or sign up please login</h1>");
                response.sendRedirect("userHome.html"); 
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
