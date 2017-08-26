package com.example.demo;

import com.github.bufferings.thymeleaf.extras.nl2br.dialect.Nl2brDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class ThymeleafexamplesNl2brApplication {

  public static void main(String[] args) {
    SpringApplication.run(ThymeleafexamplesNl2brApplication.class, args);
  }

  @GetMapping
  public String index(Model model) {
    model.addAttribute("sample",
        "Hello!\nThis is a multiline text.\r\n" +
            "After the <b>HTML Tags</b> is escaped,\n <br /> tags are inserted before \\n or \\r\\n.");
    return "index";
  }

  @Bean
  public Nl2brDialect dialect() {
    return new Nl2brDialect();
  }
}
