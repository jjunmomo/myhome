package aiapp.help.myhome.module.user.dto.request;

import aiapp.help.myhome.module.user.entity.User;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
@Schema(title = "USER_REQ_01 : 회원가입 요청 DTO")
public class UserJoinDto {

    @NotBlank(message = "사용자 이름을 입력해주세요.")
    @Size(min = 3, max = 15, message = "사용자 이름은 15글자 이하로 입력해야 합니다.")
    @Schema(description = "사용자 이름", example = "John Doe")
    private String userName;

//    @NotBlank(message = "사용자 이메일을 입력해주세요.")
//    @Email(message = "이메일 형식에 맞지 않습니다.")
//    @Schema(description = "사용자 이메일", example = "testtest@gmail.com")
    private Integer userApartZone;

    private Integer userApartNumber;

    private String userPhoneNumber;

    public static User toEntity(UserJoinDto userJoinDto){
        return User.builder()
                .userName(userJoinDto.getUserName())
                .userApartZone(userJoinDto.getUserApartZone())
                .userApartNumber(userJoinDto.getUserApartNumber())
                .userPhoneNumber(userJoinDto.getUserPhoneNumber())
                .build();
    }
}
