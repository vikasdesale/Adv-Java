

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.security.Principal;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.CloseReason;
import javax.websocket.Extension;
import javax.websocket.MessageHandler;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
import javax.xml.ws.Response;
import javax.websocket.MessageHandler.Partial;
import javax.websocket.MessageHandler.Whole;
import javax.websocket.RemoteEndpoint.Async;
import javax.websocket.RemoteEndpoint.Basic;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter writer=response.getWriter();
		/*int term=Integer.parseInt(request.getParameter("a"));
		int term1=Integer.parseInt(request.getParameter("b"));
		int sum;
		sum=term+term1;
		writer.println("The sum of "+term+" and "+term1+" is :"+sum);
		*/
		Session s=new Session() {
			
			@Override
			public void setMaxTextMessageBufferSize(int arg0) {
				// TODO Auto-generated method stub
				writer.write("a");
			}
			
			
			@Override
			public void setMaxIdleTimeout(long arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setMaxBinaryMessageBufferSize(int arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void removeMessageHandler(MessageHandler arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isSecure() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isOpen() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Map<String, Object> getUserProperties() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Principal getUserPrincipal() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public URI getRequestURI() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Map<String, List<String>> getRequestParameterMap() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getQueryString() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProtocolVersion() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Map<String, String> getPathParameters() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Set<Session> getOpenSessions() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getNegotiatedSubprotocol() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Extension> getNegotiatedExtensions() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Set<MessageHandler> getMessageHandlers() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getMaxTextMessageBufferSize() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long getMaxIdleTimeout() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getMaxBinaryMessageBufferSize() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getId() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public WebSocketContainer getContainer() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Basic getBasicRemote() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Async getAsyncRemote() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void close(CloseReason arg0) throws IOException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void close() throws IOException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public <T> void addMessageHandler(Class<T> arg0, Whole<T> arg1) throws IllegalStateException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public <T> void addMessageHandler(Class<T> arg0, Partial<T> arg1) throws IllegalStateException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void addMessageHandler(MessageHandler arg0) throws IllegalStateException {
				// TODO Auto-generated method stub
				
			}
		};
		writer.write("items selcted are:");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
