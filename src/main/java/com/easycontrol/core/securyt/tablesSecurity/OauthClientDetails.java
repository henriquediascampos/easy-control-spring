// package com.easycontrol.core.securyt.tablesSecurity;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.Table;

// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Entity
// @Table(name = "oauth_client_details")
// @Data
// @Builder
// @AllArgsConstructor
// @NoArgsConstructor
// public class OauthClientDetails {
    
//     @Id
//     @Column(name = "client_id")
//     String id;
//     @Column(name = "resource_ids")
//     private String resourceIds;
//     @Column(name = "client_secret")
//     private String clientSecret;
//     @Column(name = "scope")
//     private String scope;
//     @Column(name = "authorized_grant_types")
//     private String authorizedGrantTypes;
//     @Column(name = "web_server_redirect_uri")
//     private String webServerRedirectUri;
//     @Column(name = "authorities")
//     private String authorities;
//     @Column(name = "access_token_validity")
//     private Integer access_token_validity;
//     @Column(name = "refresh_token_validity")
//     private Integer refresh_token_validity;
//     @Column(name = "additional_information")
//     private String additional_information;
//     @Column(name = "autoapprove")
//     private String autoapprove;
// }