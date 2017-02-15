/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bwatch;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hansa
 */
public class loginServlet extends HttpServlet {

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
         
        String name = request.getParameter("email");
        String password  = request.getParameter("password");
        
        DbUtil dbUtil = new DbUtil();
        ResultSet rs = DbUtil.readData("select * from userLogin where uName ='"+name+"'");
        
        try{
        while(rs.next()){
         //Retrieve by column name
         String first = rs.getString("uName");
         String last = rs.getString("pSwrd");
         if(name.equals(first) && password.equals(last)){
             Integer userId = rs.getInt("uId");
             HttpSession session=request.getSession();  
             session.setAttribute("logedUser",userId);  
             String userType = rs.getString("Type");
             if(userType.equalsIgnoreCase("admin"))
             {
                 //getServletContext().getRequestDispatcher("/AdminPanel.jsp").forward(request, response);
                 response.sendRedirect("AdminPanel.jsp");
             }else{
                response.sendRedirect("index.html"); 
             }
         }else{
            out.print("Sorry username or password error");  
            RequestDispatcher rd=request.getRequestDispatcher("userHome.html");  
            rd.include(request,response);  
         }
        }
        }catch(Exception e){e.printStackTrace();}
        
        out.print("Sorry username or password error");  
        RequestDispatcher rd=request.getRequestDispatcher("userHome.html");  
        rd.include(request,response);  
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
