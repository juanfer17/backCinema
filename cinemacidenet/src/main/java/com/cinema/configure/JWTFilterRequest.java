package com.cinema.configure;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.cinema.service.impl.UserDetailsServiceImpl;
import com.cinema.utilies.JWTUtilies;

@Component
public class JWTFilterRequest extends OncePerRequestFilter{
	
	@Autowired
	private JWTUtilies jwtUtilies;
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String autorizationHeader = request.getHeader("Authorization");
		
		try {
		
			if(autorizationHeader != null && autorizationHeader.startsWith("Bearer")) {
				String token = autorizationHeader.substring(7);
				String userName = jwtUtilies.getUsernameToken(token);
				
				if(userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
					UserDetails userDetails = userDetailsService.loadUserByUsername(userName);
					
					if(jwtUtilies.validatedToken(token, userDetails)) {
						UsernamePasswordAuthenticationToken usernameAuthentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
						usernameAuthentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
						SecurityContextHolder.getContext().setAuthentication(usernameAuthentication);
					}
				}

			}
			
			filterChain.doFilter(request, response);
			
		}catch(Exception e) {
			System.out.println("Error de Autenticazion: " + e);
			response.setStatus(401);
		}
		
	}

	
		
}
