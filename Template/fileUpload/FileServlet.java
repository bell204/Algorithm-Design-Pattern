package dataStructure;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
 
@WebServlet("/file.do")
public class FileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String savePath = "upload";
		
		int uploadFileSizeLimit= 5*1024*1024;
		String encType="UTF-8";
		
		
		ServletContext context = getServletContext();
		
		// getRealPath 메서드가 뭐지??
		String uploadFilePath = context.getRealPath(savePath);
	
		System.out.println(uploadFilePath);
		
		try{
		// 주입할 매개변수로 request, 파일 업로드 경로, 업로드 파일 사이즈, 인코딩방법, 중복 방지 정책이 있음.
		MultipartRequest multi = new MultipartRequest(
				request, 
				uploadFilePath, 
				uploadFileSizeLimit, 
				encType,
				new DefaultFileRenamePolicy());
		
		// JSP에서 받아온 파일명
		String fileName= multi.getFilesystemName("uploadFile");
		
		if(fileName== null){
			System.out.println("파일 업로드 안 됨");
		}else{
			out.println(fileName);
			
			
		}
		}catch(Exception e){
			System.out.println("예외 발생");
		}
		
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
