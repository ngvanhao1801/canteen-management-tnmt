package com.example.canteen.controller.home;

import com.example.canteen.dto.TopicDto;
import com.example.canteen.dto.UserDto;
import com.example.canteen.entity.Topic;
import com.example.canteen.service.TopicService;
import com.example.canteen.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@NoArgsConstructor
@AllArgsConstructor
@SessionAttributes("userdto")
public class EditTopicController {
    @Autowired
    private TopicService topicService;
    private UserService userService;
    @ModelAttribute("userdto")
    public UserDto userDto(){
        return new UserDto();
    }
    @GetMapping("/edit_topic/{id}")
    public String showEditTopic(Model model, @PathVariable String id,@ModelAttribute("userdto") UserDto userDto){
        Topic topic =topicService.findTopicById(Integer.parseInt(id));
        model.addAttribute("topic",topic);
        return "edit_topic";
    }
    @PostMapping("/edit_topic/{id}")
    public String updateTopic(Model model, @PathVariable String id,
                              @ModelAttribute("userdto") UserDto userDto,
                              @ModelAttribute("topic") TopicDto topicDto){
        Topic updatetopic= topicService.findTopicById(Integer.parseInt(id));
        updatetopic.setBody(topicDto.getBody());
        topicService.update(updatetopic);
        return "redirect:/home";
    }
}
