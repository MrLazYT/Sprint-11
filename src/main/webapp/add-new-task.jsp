<head>
    <title>Create new Task</title>
    <p>
        <a href="/home">Home</a> |
        <a href="/create-task">Add new task</a> |
        <a href="/tasks-list">Show all tasks</a>
    </p>
</head>
<body>
    <h2>Create new Task</h2>
    <form>
        <%@ page import = "main.Task, main.TaskDao" %>
        <% Task task = new Task(); %>
        <p>Name
        <input name="task", id="task">
        <% if (request.getParameter("task") != null) { task.setTask(request.getParameter("task")); } %>
        </p>
        <p>Priority
            <select name = "priority", id = "priority">
                <option value="Low">Low</option>
                <option value="Medium">Medium</option>
                <option value="High">High</option>
            </select>
            <% if (request.getParameter("task") != null) { task.setPriority(request.getParameter("priority")); } %>
            <% TaskDao tasks = new TaskDao(); %>
            <% tasks.create(task); %>
        </p>
        <button>Create</button>
    </form>
</body>
</html>