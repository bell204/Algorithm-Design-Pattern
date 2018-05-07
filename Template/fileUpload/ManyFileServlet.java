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
		
		// getRealPath �޼���- ������ ����Ǵ� ���� ���� ���
		String uploadFilePath = context.getRealPath(savePath);
	
		System.out.println(uploadFilePath);
		
		try{
		// ������ �Ű������� request, ���� ���ε� ���, ���ε� ���� ������, ���ڵ����, �ߺ� ���� ��å�� ����.
		MultipartRequest multi = new MultipartRequest(
				request, 
				uploadFilePath, 
				uploadFileSizeLimit, 
				encType,
				new DefaultFileRenamePolicy());
		

		// ���� �̸����� �� �ҷ��ͼ� Enumeration ��ü�� ����.
		// Enumeration�̶� ���� ���� ���� ������ �����ϰ� �ִ� ���� ���
		Enumeration files= multi.getFileNames();
		
		// �����Ͱ� �����Ѵٸ� true / ������ false�� while ��ȣ�ȿ� ��.
		while(files.hasMoreElements()){
			// �����͸� ��.
			String file= (String) files.nextElement();
			
			// ������ �̸��� �˾Ƴ��� ���� getFilesystemName �޼��� 
			String file_name= multi.getFilesystemName(file);
			
			// ���� ���� ���ε� �� ���� �ߺ� ���� ���� ���� �� �ڿ� ��ȣ�� �ڵ����� �ٿ��� ���ο� ���ϸ� ����
			// ��ȣ �ٱ��� ���ϸ� �˷��� getOriginialFileName�޼��� �̿��ؾ� ��.
			String ori_file_name=multi.getOriginalFileName(file);
			out.print(file_name);
			out.print(ori_file_name);
			
		}
		}catch(Exception e){
			System.out.println("���� �߻�");
		}
		
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
