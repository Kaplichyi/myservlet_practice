package ru.javavision.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetIndexPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>MyServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Data transmitted by the servlet:</h3>");
        out.println("<div>Name: " + req.getParameter("Name") + "</div>");
        out.println("<div>Age: " + Integer.parseInt(req.getParameter("Age")) + "</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
