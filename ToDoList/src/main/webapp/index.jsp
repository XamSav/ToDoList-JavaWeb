<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ToDoList</title>
        <link rel="stylesheet" href="index.css">
    </head>
    <body>
        <h1>To Do List by XamSav!</h1>

    <button id="showFormBtn">Add Task</button>
    <form action="SvTasks" method="GET" >
            <button type="submit">Show Tasks</button>
        </form>

    <!-- Modal -->
    <div id="taskModal" class="modal">
        <div class="modal-content">
            <span class="close">&times;</span>
            <form action="SvTasks" method="post">
                <label for="task">New Task:</label>
                <input type="text" id="task" name="task" required>

                <label for="priority">Priority:</label>
                <select id="priority" name="priority">
                    <option value="low">Low</option>
                    <option value="medium">Medium</option>
                    <option value="high">High</option>
                    <option value="urgent">Urgent</option>
                </select>

                <label for="dueDate">Due Date:</label>
                <input type="date" id="dueDate" name="dueDate" required>

                <label for="status">Status:</label>
                <select id="status" name="status">
                    <option value="pending">Pending</option>
                    <option value="in-progress">In Progress</option>
                    <option value="completed">Completed</option>
                    <option value="cancelled">Cancelled</option>
                </select>

                <label for="notes">Notes:</label>
                <textarea id="notes" name="notes" rows="4" cols="50"></textarea>

                <label for="tags">Tags:</label>
                <input type="text" id="tags" name="tags" placeholder="e.g., work, personal, urgent">

                <label for="assignedTo">Assigned To:</label>
                <input type="text" id="assignedTo" name="assignedTo" placeholder="e.g., John Doe">

                <label for="createdBy">Created By:</label>
                <input type="text" id="createdBy" name="createdBy" placeholder="e.g., Jane Smith">

                <button type="submit">Add Task</button>
            </form>
        </div>
    </div>

    <script>
        const modal = document.getElementById("taskModal");
        const btn = document.getElementById("showFormBtn");
        const span = document.getElementsByClassName("close")[0];

        btn.onclick = function() {
            modal.style.display = "block";
        }

        span.onclick = function() {
            modal.style.display = "none";
        }

        window.onclick = function(event) {
            if (event.target == modal) {
                modal.style.display = "none";
            }
        }
    </script>
    </body>
</html>
