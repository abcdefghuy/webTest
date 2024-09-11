package murach.email;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/test")
public class Test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest requset, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().println("TestServlet Get");
    }
@Override
    protected void doPost(HttpServletRequest requset, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().println("TestServlet Post");
}
}
