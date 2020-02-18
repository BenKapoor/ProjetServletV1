package eu.ensup.servletv1.presentation;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PremiereServlet
 */
@WebServlet("/info")
public class PremiereServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PremiereServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession maSession = request.getSession();
		System.out.println("Session = " +maSession);
		
		String contextPath = request.getContextPath();
		System.out.println("Contexte = "+ contextPath);
		
		int localPort = request.getLocalPort();
		System.out.println("Local Port = "+ localPort);
		
		String localAddr = request.getLocalAddr();
		System.out.println("Local addr. = "+ localAddr);
		
		int remotePort = request.getRemotePort();
		System.out.println("Remote Port = "+remotePort);
		
		Cookie[] cookies = request.getCookies();
		System.out.println("Cookies = "+cookies);
		
		String protocole = request.getProtocol();
		System.out.println("Protocol = "+protocole);
		
		String remoteUser = request.getRemoteHost();
		System.out.println("Remote User = "+ remoteUser);
		
		String serverName = request.getServerName();
		System.out.println("Server name = "+ serverName);
		
		BufferedReader reader = request.getReader();
		System.out.println("Reader = "+ reader);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
