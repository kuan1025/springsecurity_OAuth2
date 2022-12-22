package com.kaun.springsecurityoauth2demo.Controller;



import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 取得目前用戶資料
     * @param authorization
     * @return
     */
    @RequestMapping("getCurrentUser")
    public Object getCurrentUser(Authentication authorization){
        return authorization.getPrincipal();
    }


}
