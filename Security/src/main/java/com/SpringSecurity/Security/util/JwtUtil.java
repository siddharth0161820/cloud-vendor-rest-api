package com.SpringSecurity.Security.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class JwtUtil {
    //0>Declare secret_Key and expiration_Time
    private static final String SECRET_KEY="Siddharth0161820";
    private static final long EXPIRATION_TIME=1000*60*60;//1 Hour

    //1>Generate Token Method()
    public String generateToken(String username) {
        Date currentTime = new Date();
        Date expiryDate = new Date(currentTime.getTime() + EXPIRATION_TIME);
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(currentTime)
                .setExpiration(expiryDate)
                .signWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()), SignatureAlgorithm.HS256)
                .compact();
    }
        //2>Extract username (string token) from token
        public String extractUsername(String token){
            return Jwts.parserBuilder()
                    .setSigningKey(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()))
                    .build()
                    .parseClaimsJws(token)
                    .getBody()
                    .getSubject();

    }

       //3>Validate token
    public boolean validateToken(String token, UserDetails userDetails){
        final String username=extractUsername(token);
        return(username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    //4>Check if token is expired
    private boolean isTokenExpired(String token){
        Date expiration=Jwts.parserBuilder()
                .setSigningKey(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()))
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getExpiration();
        return expiration.before(new Date());
    }
}
