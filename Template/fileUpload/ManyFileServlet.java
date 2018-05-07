package dataStructure;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
 
@WebServlet("/Manyfile.do")
public class ManyFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String savePath = "upload";
		
		int uploadFileSizeLimit= 5*1024*1024;
		String encType="UTF-8";
		
		
		ServletContext context = getServletContext();
		
		// getRealPath 메서드- 파일이 저장되는 실제 폴더 경로
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
		

		// 파일 이름들을 다 불러와서 Enumeration 객체에 저장.
		// Enumeration이란 여러 개의 파일 정보를 저장하고 있는 파일 목록
		Enumeration files= multi.getFileNames();
		
		// 데이터가 존재한다면 true / 없으면 false라서 while 괄호안에 들어감.
		while(files.hasMoreElements()){
			// 데이터를 얻어냄.
			String file= (String) files.nextElement();
			
			// 파일의 이름을 알아내기 위한 getFilesystemName 메서드 
			String file_name= multi.getFilesystemName(file);
			
			// 동일 파일 업로드 시 파일 중복 차단 위해 파일 명 뒤에 번호를 자동으로 붙여서 새로운 파일명 제공
			// 번호 붙기전 파일명 알려면 getOriginialFileName메서드 이용해야 함.
			String ori_file_name=multi.getOriginalFileName(file);
			out.print(file_name);
			out.print(ori_file_name);
			
		}
		}catch(Exception e){
			System.out.println("예외 발생");
		}
		
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
