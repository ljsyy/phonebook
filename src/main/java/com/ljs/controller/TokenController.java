package com.ljs.controller;

import com.ljs.constant.SystemConstant;
import com.ljs.entity.CheckResult;
import com.ljs.entity.R;
import com.ljs.interceptor.SysInterceptor;
import com.ljs.util.JwtUtils;
import io.jsonwebtoken.Claims;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * token
 */
@RestController
@RequestMapping("/")
public class TokenController {

    private final Logger logger = LoggerFactory.getLogger(TokenController.class);


    /**
     * 刷新token
     * @return
     */
   @GetMapping(value = "/refreshToken")
    public R refreshTokne(HttpServletRequest request){
       String token = request.getHeader("token");
       Claims claims = JwtUtils.validateJWT(token).getClaims();
       String newToken = JwtUtils.createJWT(claims.getId(), claims.getSubject(), SystemConstant.JWT_TTL);
       R r = new R();
       r.put("token",newToken);
       logger.info("新token");
       return r;
    }
}
