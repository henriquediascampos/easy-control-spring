// package com.easycontrol.core.securyt;

// import java.util.HashMap;
// import java.util.Map;

// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import javax.sql.DataSource;

// import org.apache.coyote.Response;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.jdbc.datasource.DriverManagerDataSource;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
// import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
// import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
// import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
// import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
// import org.springframework.security.oauth2.provider.approval.ApprovalStore;
// import org.springframework.security.oauth2.provider.approval.JdbcApprovalStore;
// import org.springframework.security.oauth2.provider.code.AuthorizationCodeServices;
// import org.springframework.security.oauth2.provider.code.JdbcAuthorizationCodeServices;
// import org.springframework.security.oauth2.provider.token.TokenStore;
// import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

// @Configuration
// @EnableAuthorizationServer
// public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

//     @Autowired
//     @Qualifier("authenticationManagerBean")
//     private AuthenticationManager    authenticationManager;

//     @Autowired
//     private DataSource               dataSource;

//     @Autowired
//     private PasswordEncoder          passwordEncoder;

//     // @Autowired
//     // private BCryptPasswordEncoder passwordEncoder;

//     // @Autowired
//     // @Qualifier("handlerExceptionResolver")
//     // private HandlerExceptionResolver resolver;

//     // @Autowired
//     // private HttpServletRequest       request;

//     // @Autowired
//     // private HttpServletResponse      response;

//     @Bean
//     public ApprovalStore approvalStore() {
//         return new JdbcApprovalStore(dataSource);
//     }

//     @Bean
//     public AuthorizationCodeServices authorizationCodeServices() {
//         return new JdbcAuthorizationCodeServices(dataSource);
//     }
 
//     @Override
//     public void configure(final AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//         endpoints.tokenStore(tokenStore())
//         .authenticationManager(authenticationManager)
//         .approvalStore(approvalStore())
//         .pathMapping("/oauth/token", "/api/oauth/token").
//         authorizationCodeServices(authorizationCodeServices());
//     }

//     @Override
//     public void configure(final AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
//         oauthServer.tokenKeyAccess("permitAll()").checkTokenAccess("isAuthenticated()");
//     }
 
//     @Override
//     public void configure(final ClientDetailsServiceConfigurer clients) throws Exception {
//         clients.jdbc(dataSource).passwordEncoder(passwordEncoder); //qualquer coisa mudar
//     }

//     @Bean
//     public TokenStore tokenStore() {
//         return new JdbcTokenStore(dataSource);
//     }

//     // @Bean
//     // public DataSource dataSource() {
//     //     DriverManagerDataSource dataSource = new DriverManagerDataSource();
//     //     dataSource.setDriverClassName("org.postgresql.Driver");
//     //     dataSource.setUrl("jdbc:postgresql://192.168.1.7:5432/easy_control");
//     //     dataSource.setUsername("postgres");
//     //     dataSource.setPassword("xxxx");
        
//     //     return dataSource;
//     // }

//     // private String obtainAccessToken(String clientId, String username, String password) {
//     //     Map<String, String> params = new HashMap<String, String>();
//     //     params.put("grant_type", "password");
//     //     params.put("client_id", clientId);
//     //     params.put("username", username);
//     //     params.put("password", password);
//     //     //   .basic(clientId, "secret").and().with().params(params).when()
//     //     //   .post("http://localhost:8081/spring-security-oauth-server/oauth/token");
//     //     return "response.jsonPath().getString(\"access_token\");";
//     // }
// }
