package aiapp.help.myhome.module.user.service;

import aiapp.help.myhome.module.user.dto.request.UserJoinDto;
import aiapp.help.myhome.module.user.entity.User;
import aiapp.help.myhome.module.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;


    public void join(UserJoinDto userJoinDto){
        userRepository.save(UserJoinDto.toEntity(userJoinDto));
    }

    public List<User> userList(){
        return userRepository.findAll();
    }
}
