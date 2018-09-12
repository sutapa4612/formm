import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
 
    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Test t=new Test();
        String status=t.save(username,password);
       
        
       /* if(username.equals("") || password.equals(""))
        {
        RequestDispatcher dis=request.getRequestDispatcher("Index.html");
        dis.forward(request, response);
        }
        */
     // PrintWriter out = response.getWriter();
       // out.print(status);
        
        
        
        
     /*   Student s = new Student();
        s.setAge(12);
        s.setName("chinmna");
        s.setId(1);
        */
        
       // request.setAttribute("statusInfo", status);
        
       
        
        request.setAttribute("statusInfo",status);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/result.jsp");
        dispatcher.forward(request, response);
        
         
    }
}