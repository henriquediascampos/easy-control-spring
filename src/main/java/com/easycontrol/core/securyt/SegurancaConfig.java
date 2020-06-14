// package com.easycontrol.core.securyt;

// import java.util.HashMap;
// import java.util.Map;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.core.annotation.Order;
// import org.springframework.http.HttpMethod;
// import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.AuthenticationProvider;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
// import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.builders.WebSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
// import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
// import org.springframework.security.oauth2.provider.expression.OAuth2MethodSecurityExpressionHandler;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.firewall.DefaultHttpFirewall;
// import org.springframework.security.web.firewall.HttpFirewall;

// @Configuration
// @Order(1)
// public class SegurancaConfig extends WebSecurityConfigurerAdapter {
	
	
// 	@Override
// 	@Bean(name = "authenticationManagerBean")
// 	public AuthenticationManager authenticationManagerBean() throws Exception {
// 		return super.authenticationManagerBean();
// 	}

//     @Autowired
//     private UserDetailsService             userDetailService;


// 	@Bean
//     public UserDetailsService users() {
//         UserDetails user = User.withDefaultPasswordEncoder()
//             .username("user1")
//             .password("password")
//             .roles("USER")
//             .build();
//         return  new InMemoryUserDetailsManager(user);
//     }

// 	@SuppressWarnings("deprecation")
// 	@Bean
// 	public PasswordEncoder passwordEncoder() {
// 		String encodingId = "bcrypt";
// 		Map<String, PasswordEncoder> encoders = new HashMap<>();
// 		encoders.put(encodingId, new BCryptPasswordEncoder(12));
// 		encoders.put("SIGSS", new org.springframework.security.crypto.password.MessageDigestPasswordEncoder("MD5"));

// 		return new DelegatingPasswordEncoder(encodingId, encoders);
// 	}

// 	@Override
// 	public void configure(AuthenticationManagerBuilder auth) throws Exception {
// 		// auth.inMemoryAuthentication().withUser("oi").password("1234").roles("ADMIN");
// 		auth.userDetailsService(users());
// 		// auth.authenticationProvider(authenticationProvider)
// 		//.userDetailsService(userDetailsService)
// 		//.passwordEncoder(passwordEncoder());
// 	}

// 	@Override
//     public void configure(final HttpSecurity http) throws Exception {
//         http.
//             userDetailsService(userDetailService)
//             .authorizeRequests()
//                 .antMatchers("/teste", "/login").permitAll()
//                 .anyRequest().authenticated();
// 	}
	
// 	// @Override
// 	// public void configure(WebSecurity web) throws Exception {
// 	// 	web.httpFirewall(allowUrlEncodedSlashHttpFirewall()).ignoring().antMatchers(HttpMethod.OPTIONS);
// 	// }

// 	// @Bean
// 	// public HttpFirewall allowUrlEncodedSlashHttpFirewall() {
// 	// 	return new DefaultHttpFirewall();
// 	// }

	
    
// 	// @Bean
// 	// @Override
// 	// protected AuthenticationManager authenticationManager() throws Exception {
// 	// 	return super.authenticationManager();
// 	// }
	
// 	// @Override
// 	// protected void configure(AuthenticationManagerBuilder auth) throws Exception {
// 	// 	auth.inMemoryAuthentication().withUser("oi").password("1234").roles("ADMIN");
// 	// }
	
// 	// @Bean
// 	// public PasswordEncoder passwordEncoder() {
// 	// 	return NoOpPasswordEncoder.getInstance();
// 	// }

// }