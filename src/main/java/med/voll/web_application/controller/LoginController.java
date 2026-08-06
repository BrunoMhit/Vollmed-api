package med.voll.web_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//é um controller web ai usa so @controller
@Controller
public class LoginController {
    //pega a rota
    @GetMapping("/login")
    public String canregaPaginaDeListagem(){
        return "autenticacao/login";
    }
    @GetMapping("/logout")
    public String carregaPaginaLogout(){
        return "autenticacao/logout";
    }
}
