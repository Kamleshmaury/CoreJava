package com.hops;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fil)
			throws IOException, ServletException {
		System.out.println("Before filter");
		
		fil.doFilter(req, res);
		
		System.out.println("After filter");
		
	}

}
