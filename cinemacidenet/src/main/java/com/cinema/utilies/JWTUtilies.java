package com.cinema.utilies;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.cinema.model.UserModel;
import com.cinema.repository.UserRepository;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtilies  {
	
	
	
	@Autowired
	private UserRepository userRepository;
	private static final String KEY = "DDASDsafsafsaasKJFAHSJFSHLJA564165156kkkkk3443255DS5DAS5DSAaddsadsafRE5623";
	
	public String generateToken(UserDetails userDetails) {
		UserModel userInfo = userRepository.findByEmail(userDetails.getUsername());
		return Jwts.builder().setSubject(userInfo.getEmail()).setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
				.claim("firstName", userInfo.getFirstName())
				.claim("lastName", userInfo.getLastName())
				.signWith(SignatureAlgorithm.HS256, KEY).compact();
	}
	
	
	private Claims getClaims(String token) {
		return Jwts.parser().setSigningKey(KEY).parseClaimsJws(token).getBody();
	}
	
	public String getUsernameToken(String token) {
		return getClaims(token).getSubject();
	}
	
	public Boolean validatedToken(String token, UserDetails userDetails) {
		return userDetails.getUsername().equals(getUsernameToken(token)) && !isExpiredToken(token);
	}
	
	private Boolean isExpiredToken(String token) {
		return getClaims(token).getExpiration().before(new Date());
	}
	
	
}
