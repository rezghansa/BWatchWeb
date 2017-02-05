/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bwatch;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author hansa
 */
@WebServlet(name = "CompleteSearch", urlPatterns = {"/CompleteSearch"})
public class CompleteSearch extends HttpServlet {

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
         String searchQuery = "select * from jobs where jobStatus like 'F'";
        DbUtil dbUtil = new DbUtil();
        ResultSet rs = DbUtil.readData(searchQuery);
        JSONArray listJobs = new JSONArray();
        ArrayList listarrJobs = new ArrayList();
        try{
        while(rs.next()){
         //Retrieve by column name
            String jobPosition = rs.getString("jobposition");
            String jobtitle = rs.getString("jobtitle");
            String jobDescription = rs.getString("jobDescription");
            String jobCountry = rs.getString("jobCountry");
            String jobCategory = rs.getString("jobCategory");
            String jobSalary = rs.getString("jobSalary");
            String jobFeatures = rs.getString("jobFeatures");
            String jobStatus = rs.getString("jobStatus");
            String jobFlag = rs.getString("jobFlag");
            
            JSONObject tempJob = new JSONObject();
            tempJob.put("jobCategory",jobCategory);
            tempJob.put("jobCountry",jobCountry);
            tempJob.put("jobDescription",jobDescription);
            tempJob.put("jobFeatures",jobFeatures);
            tempJob.put("jobFlag",jobFlag);
            tempJob.put("jobPosition",jobPosition);
            tempJob.put("jobSalary",jobSalary);
            tempJob.put("jobStatus",jobStatus);
            tempJob.put("jobtitle",jobtitle);
            
            
            JobClass tempJJob = new JobClass();
            tempJJob.setJobStatus(jobStatus);
            tempJJob.setJobSalary(jobSalary);
            tempJJob.setJobPosition(jobPosition);
            tempJJob.setJobFlag(jobFlag);
            tempJJob.setJobFeatures(jobFeatures);
            tempJJob.setJobDescription(jobDescription);
            tempJJob.setJobCountry(jobCountry);
            tempJJob.setJobCategory(jobCategory);
            tempJJob.setJobtitle(jobtitle);  
            listarrJobs.add(tempJJob);
            listJobs.put(tempJob);        
        }
        }catch(Exception e){e.printStackTrace();}
        try (PrintWriter out = response.getWriter()) {
          request.setAttribute("joblist", listarrJobs);
          getServletContext().getRequestDispatcher("/searchresultsJSP.jsp").forward(request, response);
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
