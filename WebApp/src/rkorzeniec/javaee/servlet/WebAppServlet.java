package rkorzeniec.javaee.servlet;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.ServletContext;

public class WebAppServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException // ust. rządania i opdowiedzi
	{		
		res.setContentType("text/html; charset = UTF-8"); //ust. typu kodu / charset - zestaw znaków
		PrintWriter pw = res.getWriter(); // ust. wywołania
		javax.servlet.ServletContext context = this.getServletContext();
		pw.println("Servlet!");
		
		
		
		/*
		HttpSession session = req.getSession();	// ust. licznika liczby odwiedzić użytkownika podczas sesji
				//ust. licznika wejść
		session.setMaxInactiveInterval(60);//wygasniecie sesji po...sekund
		Integer counter = (Integer)session.getAttribute("counter");
		if(counter == null)
		
			counter = 1;
		 else
			counter++;
		session.setAttribute("counter", counter);
		pw.println("counter: " + counter);
		*/
		/*
		if(req.getCookies() != null)
			for(int i = 0; i < req.getCookies().length; i++)
			{
				Cookie c = req.getCookies()[i];
				if(c.getName().equals("name"))
				{
					pw.println("Hello" + c.getValue());
				return;
				}
			
	}
		pw.println("<html><head><title>This id title of the site</title></head>");
		pw.println("<body>");
		pw.println("<p>Hello world!</p>"); // generate html 
		pw.println("<p>Welcome!</p>");
		pw.println("<form method=\"post\">");
		pw.println("<p>What is your name?</p><input name = \"name\" /> <input type = \"submit\" value=\"OK\" />"); //pole formularza o metodzie POST
		pw.println("</form>");
		pw.println("</body></html>");
		*/
		
		/*
			// przykład na kodzie binarnym z pobraniem/wyświetleniem pliku jpg
		byte[] bufor = loadFile("C:\\Users\\Rafał Korzeniec\\Documents\\NetBeansProjects\\AnimacjaKropelki\\Uther.jpg");
		res.setContentType("image/jpg"); //okr. typu odp.
		res.setContentLength(bufor.length);
		//res.addHeader("Content-Disposition", "attachment;filename=Uther.jpg"); //dod. nagłówka - wyw. pobranie pliku, bez tego wyświetla plik
		OutputStream os = res.getOutputStream();
		os.write(bufor);
		os.flush();
		*/		
	}
	
	protected void doPOST(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		/*
		res.setContentType("text/html; charset = UTF-8");
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("name");//podanie parametrów ww / zwracanie wielu możliwości
		if(name != null && !"".equals(name))
		{
			Cookie cookie = new Cookie("name", name);
			cookie.setMaxAge(30);
			res.addCookie(cookie);
			pw.println("Hello" + name);  
		}
		name = "Rafał";
		*/
	}
	
	/*
	private byte[] loadFile(String fileName) throws IOException
	{
		File f = new File(fileName);
		long size = f.length();
		byte[] content = new byte[(int) size];
		FileInputStream fis = new FileInputStream(f);
		fis.read(content);
		fis.close();
		return content;
	}		*/
}
// sesja pozwala na identyfikacje uzytkownika na przestrzeni rządań
//atrybuty to objekty dostępne dzięki odpowiednim kluczom