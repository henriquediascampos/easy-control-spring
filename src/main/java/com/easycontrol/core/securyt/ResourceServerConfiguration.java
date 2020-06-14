// package com.easycontrol.core.securyt;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
// import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
// import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
// import org.springframework.security.oauth2.provider.token.TokenStore;
// import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


// @Configuration
// @EnableResourceServer
// public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

//     private static final String RESOURCE_ID = "messages-resource";

//     // @Autowired
//     // private CustomAuthenticationEntryPoint customAuthenticationEntryPoint;

//     // @Autowired
//     // private CustomLogoutSuccessHandler     customLogoutSuccessHandler;

//     @Autowired
//     private TokenStore                     tokenStore;

//     // @Autowired
//     // private UserDetailsService             userDetailService;

//     // @Override
//     // public void configure(final HttpSecurity http) throws Exception {
//     //     http.
//     //         userDetailsService(userDetailService)
//     //         // .exceptionHandling()
//     //         // .authenticationEntryPoint(customAuthenticationEntryPoint)
//     //         // .and()
//     //             // .logout()
//     //             // .logoutUrl("/api/oauth/logout")
//     //             // .logoutSuccessHandler(customLogoutSuccessHandler)
//     //         // .and()
//     //             // .csrf()
//     //             // .requireCsrfProtectionMatcher(new AntPathRequestMatcher("/api/oauth/authorize")).disable().headers().frameOptions().disable()
//     //         // .and()
//     //             // .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//     //         // .and()
//     //         .authorizeRequests()
//     //             .antMatchers("/teste", "/login").permitAll()
//     //             // .antMatchers("/api/**").authenticated()
//     //             // .antMatchers("/**").permitAll()
//     //             .anyRequest().authenticated();
//     // }

//     @Override
//     public void configure(final ResourceServerSecurityConfigurer security) throws Exception {
//         security
// 			.resourceId(RESOURCE_ID)
// 			.tokenStore(this.tokenStore);
//         // resources.tokenStore(tokenStore).resourceId("portal-server");
//         // resources.authenticationEntryPoint(customAuthenticationEntryPoint);
//     }
// }
