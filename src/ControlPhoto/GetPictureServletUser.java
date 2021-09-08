package ControlPhoto;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getPictureUser")
public class GetPictureServletUser extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public GetPictureServletUser() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String id = (String) request.getParameter("code");
		if (id != null)
		{
			byte[] bt=null;
			try 
			{
				bt = PhotoControlUser.load(id);
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		
			ServletOutputStream out = response.getOutputStream();
			if(bt != null)
			{
				out.write(bt);
				response.setContentType("image/jpeg");			
			}
			out.close();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}