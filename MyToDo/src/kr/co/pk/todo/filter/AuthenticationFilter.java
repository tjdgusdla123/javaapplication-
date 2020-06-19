package kr.co.pk.todo.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
@WebFilter("/write.do")
public class AuthenticationFilter implements Filter {

	public AuthenticationFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 주의할 점은 매개변수인 request가 HttpServeltRequest가
		// 아니라서 강제 형 변환을 해서 사용
		HttpServletRequest req = (HttpServletRequest) request;
		// 세션에서 id를 가져옵니다.
		String id = (String) req.getSession().getAttribute("id");
		// 로그인이 되어 있지 않다면
		if (id == null) {
			HttpServletResponse rep = (HttpServletResponse) response;
        //이전 요청을 세션에 저장
		req.getSession().setAttribute("path",req.getRequestURI());
			rep.sendRedirect("login.do");
		} else {
			// 원래 요청을 처리
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
