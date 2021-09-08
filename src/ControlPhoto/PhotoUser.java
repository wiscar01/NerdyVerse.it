package ControlPhoto;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class PhotoUser
 */
@WebServlet("/PhotoUser")
@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
maxFileSize=1024*1024*10,      // 10MB
maxRequestSize=1024*1024*50)   // 50MB

public class PhotoUser extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	static String SAVE_DIR ="/uploadTemp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PhotoUser() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");

		out.write("Error: GET method is used but POST method is required");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
		
		String id = request.getParameter("code");
		
		
	    String appPath = request.getServletContext().getRealPath("");
	    String savePath = appPath + File.separator + SAVE_DIR;
	         
		File fileSaveDir = new File(savePath);
		if (!fileSaveDir.exists())
		{
			fileSaveDir.mkdir();
		}

		for (Part part : request.getParts())
		{
			String fileName = extractFileName(part);
			if (fileName != null && !fileName.equals(""))
			{
				part.write(savePath + File.separator + fileName);
				try
				{
					PhotoControlUser.updatePhoto(id, savePath + File.separator + fileName);
				}
				catch (SQLException sqlException)
				{
					System.out.println(sqlException);
				}
			}
		}

		RequestDispatcher view = request.getRequestDispatcher("/logged.jsp");
		view.forward(request, response);
	}
	
    private String extractFileName(Part part) 
    {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) 
        {
            if (s.trim().startsWith("filename"))
            {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
    }	

}
