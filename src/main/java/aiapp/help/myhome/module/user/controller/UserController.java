package aiapp.help.myhome.module.user.controller;

import aiapp.help.myhome.module.common.response.CommonResponse;
import aiapp.help.myhome.module.user.dto.request.UserJoinDto;
import aiapp.help.myhome.module.user.entity.User;
import aiapp.help.myhome.module.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public CommonResponse<Object> join(UserJoinDto userJoinDto) {
        userService.join(userJoinDto);
        return CommonResponse.success("");
    }

    @GetMapping
    public CommonResponse<List<User>> userList() {

        return CommonResponse.success(userService.userList());
    }
}
