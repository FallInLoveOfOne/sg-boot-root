package qjsh.sg.bootweb.controllerr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qjsh.sg.bootservice.service.IHelloService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    IHelloService helloService;

    @GetMapping("/index")
    public String index() {
        return helloService.sayHello();
    }
}
