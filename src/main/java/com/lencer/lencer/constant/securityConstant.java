package com.lencer.lencer.constant;

public class securityConstant {


    public static final long EXPIRATION_TIME = 433_000_000;
    public static final String TOKEN_PREFIX = "Bearer";
    public static final String JWT_TOKEN_HEADER= "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED ="Token Cannot Be Verified";
    public static final String GET_ARRAYS_LLC ="Get Arrays, LLC";
    public static final String GET_ARRAYS_ADMINISTRATION="User mangement portal";
    public static final String AUTHORITIES ="Authorities";
    public static final String FORBIDDEN_MESSAGE ="You have to loginn first";
    public static final String ACCESS_DENIED_MESSAGE ="You dont have permission";
    public static final String OPTIONS_HTTP_METHOD = "Options";
    public static final String[] PUBLIC_URLS ={"/user/login", "/user/register", "/user/resetpassword/**","/user/image/**"};



}
