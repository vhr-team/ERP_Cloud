package cc.mrbird.febs.auth.controller;

import cc.mrbird.febs.auth.manager.UserManager;
import cc.mrbird.febs.auth.service.ValidateCodeService;
import cc.mrbird.febs.common.core.exception.ValidateCodeException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;

/**
 * @author MrBird
 */
@Controller
@RequiredArgsConstructor
public class SecurityController {

    private final ValidateCodeService validateCodeService;
    private final UserManager userManager;

    @ResponseBody
    @GetMapping("user")
    public Principal currentUser(Principal principal) {
        return principal;
    }

    @ResponseBody
    @GetMapping("captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws IOException, ValidateCodeException {
        validateCodeService.create(request, response);
    }

    @RequestMapping("login")
    public String login() {
        return "login";
    }
}
