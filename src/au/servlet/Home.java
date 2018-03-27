package au.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import au.bean.AnCliente;
import au.bean.AnStabi;
import au.bean.TermRig;
import au.bean.TermTest;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			response.setContentType("text/html");
	        PrintWriter pw = response.getWriter();
	        JSONObject jso = new JSONObject();
	        	        
	        JSONArray ar = new JSONArray();
	        AnCliente cl = new AnCliente();
	        for(int i=0;i<cl.getCampi().length;i++) {
	        	ar.put(cl.getCampi()[i]);	        
	        }
	        
	        JSONArray ar1 = new JSONArray();
	        TermTest tt = new TermTest();
	        for(int i=0;i<tt.getCampi().length;i++) {
	        	ar1.put(tt.getCampi()[i]);	        
	        }
	        JSONArray arTr = new JSONArray();
	        TermRig tr = new TermRig();
	        for(int i=0;i<tr.getCampi().length;i++) {
	        	arTr.put(tr.getCampi()[i]);	        
	        }
	        JSONArray arStabi = new JSONArray();
	        AnStabi stabi = new AnStabi();
	        for(int i=0;i<stabi.getCampi().length;i++) {
	        	arStabi.put(stabi.getCampi()[i]);	        
	        }
	        
	        jso.put("AnCliente", ar);	        
	        jso.put("TermTest", ar1);
	        jso.put("TermRig", arTr);
	        jso.put("AnStabi", arStabi);
	        
	        pw.println(jso);
	        pw.close();
	        pw.flush();
		}catch(Exception e) {e.getMessage();}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
