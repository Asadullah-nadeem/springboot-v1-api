package com.api.Api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// import java.util.Map;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;


// @RestController
// public class HelloController {

//   @GetMapping("/")
//   public Map<String, String> Hello() {
//     String V1 = "Massage", Vnmae = "Hello World";
//       // return Map.of("Message", "Hello World");
//       return Map.of(V1, Vnmae);
//   }

// }

@RestController
public class HelloController{

  @GetMapping("/")
  public User hello(){
    return new User(1, "Asadullah", "Spring Boot");
  }

}
