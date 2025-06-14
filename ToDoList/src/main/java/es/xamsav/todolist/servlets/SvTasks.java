package es.xamsav.todolist.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import es.xamsav.todolist.logica.Task;
import javax.servlet.http.HttpSession;
/**
 *
 * @author XamSav
 */
@WebServlet(name = "SvTasks", urlPatterns = {"/SvTasks"})
public class SvTasks extends HttpServlet {

    private List<Task> tareas = new ArrayList<Task>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion = request.getSession();
        sesion.setAttribute("Tasks", tareas);
        
        response.sendRedirect("showTasks.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String taskName = request.getParameter("task");
        String priority = request.getParameter("priority");
        String dueDate = request.getParameter("dueDate");
        String status = request.getParameter("status");
        String notes = request.getParameter("notes");
        String tags = request.getParameter("tags");
        String assignedTo = request.getParameter("assignedTo");
        String createdBy = request.getParameter("createdBy");
        processRequest(request, response);
        
        System.out.println("Task Name: "+taskName);
        System.out.println("Priority: "+priority);
        System.out.println("dueDate: "+dueDate);
        System.out.println("status: "+status);
        /*--- PUEDEN ESTAR EN VACIAS ---*/
        notes = notes == "" ? "None." : notes;
        tags = tags == "" ? "Not Specified." : tags;
        assignedTo = assignedTo == "" ? "Not Specified." : assignedTo;
        createdBy = createdBy == "" ? "Not Specified." : createdBy;
        
        System.out.println("notes: "+notes);
        System.out.println("tags: "+tags);
        System.out.println("assignedTo: "+assignedTo);
        System.out.println("createdBy: "+createdBy);
        
        tareas.add(new Task(taskName, priority, dueDate, status, notes, tags, assignedTo, createdBy));
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}