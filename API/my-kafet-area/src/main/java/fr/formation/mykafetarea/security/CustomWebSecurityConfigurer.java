package fr.formation.mykafetarea.security;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
public class CustomWebSecurityConfigurer extends WebSecurityConfigurerAdapter {


 AuthenticationManager customersAuthenticationManager() {
        return authentication -> {
            if (isCollaborator(authentication)) {
                return new UsernamePasswordAuthenticationToken(authentication, authentication);
            }
            throw new UsernameNotFoundException("You are not allowed");
        };
    }

 public AuthenticationManager employeesAuthenticationManager() {
        return authentication -> {
            if (isCateringTeam(authentication)) {
                return new UsernamePasswordAuthenticationToken(authentication, authentication);
            }
            throw new UsernameNotFoundException("You are not allowed");
        };
    }

	private boolean isCateringTeam(Authentication authentication) {
	return false;
}

	private boolean isCollaborator(Authentication authentication) {
	return false;
    }
    
    AuthenticationManagerResolver<HttpServletRequest> resolver() {
        return request -> {
            if (request.getPathInfo().startsWith("/mkaUser")) {
                return employeesAuthenticationManager();
            }
            return customersAuthenticationManager();
        };
    }
   
}