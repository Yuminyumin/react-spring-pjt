package react.spring.react_spring_pjt.bbs.ctrl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bbs")
public class BbsController {
    
    // user endpoint : http:// ip : port /bbs/index
    @GetMapping("/index")
    public ResponseEntity<Void> landing() {
        System.out.println("client endpoint : bbs/index");
        return null;
    }
}
