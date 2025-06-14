<%-- 
    Document   : showTasks
    Created on : 14 jun 2025, 19:27:43
    Author     : XamSav
--%>
<%@page import="es.xamsav.todolist.logica.Task"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tasks</title>
        <link rel="stylesheet" href="showTasks.css">
    </head>
    <body>
        <div class="container">
        <h1>List Of Tasks:</h1>

        <% 
            List<Task> tasks = (List)request.getSession().getAttribute("Tasks");
            if (tasks != null && !tasks.isEmpty()) {
                for(Task task : tasks){
        %>
            <div class="task-card">
                <div class="task-title">Task: <%= task.getNombre() %></div>
                <div class="task-details"><%= task.toString().replace(",", ",\n").replace("{", "").replace("}", "") %></div>
            </div>
        <%  
                }
            } else {
        %>
            <p style="text-align:center; color: #999; font-size:18px;">No tasks available.</p>
        <% 
            }
        %>
    </div>
    </body>
</html>
