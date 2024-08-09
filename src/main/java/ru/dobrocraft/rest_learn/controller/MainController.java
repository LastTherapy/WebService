package ru.dobrocraft.rest_learn.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.dobrocraft.rest_learn.entity.User;
import lombok.AllArgsConstructor;

@RestController
public class MainController {

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/api/main")
    public String mainListener() {
        return "Hello world";
    }

    @GetMapping("/api/user")
    public String getUser() {
        User user = new User("bob", 100);
        String jsonData = null;
        try  {
            jsonData = objectMapper.writeValueAsString(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @PostMapping("/api/create")
    public String createUserByName(@RequestParam String name) {
        User user = new User(name, 100);
        String jsonData = null;
        try  {
            jsonData = objectMapper.writeValueAsString(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }


}
