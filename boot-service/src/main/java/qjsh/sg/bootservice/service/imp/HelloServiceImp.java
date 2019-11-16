package qjsh.sg.bootservice.service.imp;

import org.springframework.stereotype.Service;
import qjsh.sg.bootservice.service.IHelloService;

@Service
public class HelloServiceImp implements IHelloService {
    @Override
    public String sayHello() {
        return "hello helloService";
    }
}
