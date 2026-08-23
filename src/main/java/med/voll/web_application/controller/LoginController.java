package med.voll.web_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//é um controller web ai usa so @controller
@Controller
public class LoginController {
    @GetMapping("/login")
    public String carregaPaginaListagem(){
        return "autenticacao/login";
    }
}
