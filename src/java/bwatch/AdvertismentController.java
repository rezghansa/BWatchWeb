/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bwatch;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hansa
 */
@WebServlet(name = "AdvertismentController", urlPatterns = {"/AdvertismentController"})
public class AdvertismentController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private AddvertismentDAO dao;
    public static final String lIST_STUDENT = "/listAddverstiments.jsp";
    public static final String INSERT_OR_EDIT = "/advertisment.jsp";

    public AdvertismentController() {
        dao = new AdvertismentDAOImplementation();
    }
    
    
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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdvertismentController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdvertismentController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        //processRequest(request, response);
        
        String forward = "";
        String action = request.getParameter( "action" );
 
        if( action.equalsIgnoreCase( "delete" ) ) {
            forward = lIST_STUDENT;
            int studentId = Integer.parseInt( request.getParameter("jobId") );
            dao.deleteJob(studentId);
            request.setAttribute("jobs", dao.getAllStudents() );
        }
        else if( action.equalsIgnoreCase( "edit" ) ) {
            forward = INSERT_OR_EDIT;
            int studentId = Integer.parseInt( request.getParameter("jobId") );
            JobClass student = dao.getJobById(studentId);
            request.setAttribute("job", student);
        }
        else if( action.equalsIgnoreCase( "insert" ) ) {
            forward = INSERT_OR_EDIT;
        }
        else {
            forward = lIST_STUDENT;
            request.setAttribute("jobs", dao.getAllStudents());
        }
        RequestDispatcher view = request.getRequestDispatcher( forward );
        view.forward(request, response);
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
        //processRequest(request, response);
        
        JobClass job = new JobClass();

        job.setJobCategory(request.getParameter( "category" ) );
        job.setJobCountry(request.getParameter( "country" ) );
        job.setJobDescription(request.getParameter( "description" ) );
        job.setJobFeatures(request.getParameter( "features" ));
        job.setJobFlag(request.getParameter( "flag" ));
        job.setJobPosition(request.getParameter( "position" ));
        job.setJobSalary(request.getParameter( "salary" ));
        job.setJobStatus(request.getParameter( "status" ));
        job.setJobtitle(request.getParameter( "title" ));

        String studentId = request.getParameter("jobId");
 
        if( studentId == null || studentId.isEmpty() )
            dao.addJob(job);
        else {
            job.setJobId(Integer.parseInt(request.getParameter( "jobId" )));
            dao.updateJob(job);
        }
        RequestDispatcher view = request.getRequestDispatcher( lIST_STUDENT );
        request.setAttribute("jobs", dao.getAllStudents());
        view.forward(request, response);
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
