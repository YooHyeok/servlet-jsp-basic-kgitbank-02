package lab.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Filter.do")
public class FilterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FilterServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("서블릿 실행"); 
		request.setAttribute("message","이 메세지는 서블릿에서");//메시지를 리퀘스트에 저장하고 응답이 나감.
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
