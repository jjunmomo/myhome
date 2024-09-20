package aiapp.help.myhome.module.user.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
@Schema(title = "USER_REQ_02 : 로그인 요청 DTO")
public class UserLoginDto {

    private Integer userApartZone;

    private Integer userApartNumber;

    private String userPassword;
}
