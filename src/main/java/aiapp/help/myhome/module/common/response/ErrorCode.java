package aiapp.help.myhome.module.common.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    //TODO: 에러코드 유형별 정립

    //system
    COMMON_INTERNAL_SERVER_ERROR(" 잘못된 접근입니다. \n 관리자에게 문의하세요."),
    COMMON_ENCRYPT_ERROR("암호화 에러"),
    COMMON_SYSTEM_ERROR("일시적인 오류가 발생했습니다. 잠시 후 다시 시도해주세요."), // 장애 상황
    COMMON_BAD_REQUEST("잘못된 요청입니다."),
    COMMON_UNAUTHORIZED("권한이 없습니다."),

    //data
    COMMON_NON_UNIQUE("서버 에러,관리자에게 문의하세요"),
    COMMON_NON_NULLABLE("서버 에러,관리자에게 문의하세요"),

    //request
    COMMON_INVALID_PARAMETER("요청한 값이 올바르지 않습니다."),
    COMMON_ENTITY_NOT_FOUND("존재하지 않는 엔티티입니다."),
    //
    COMMON_ILLEGAL_STATUS("잘못된 상태값입니다."),
    COMMON_FORBIDDEN("유저 요청 권한이 없습니다"),
    //auth email
    COMMON_AUTH_EMAIL_TIME("이메일 인증 시간이 만료 되었습니다"),
    COMMON_AUTH_EMAIL("이메일 인증을 해주세요"),
    COMMON_DUPLICATE_ID("이미 존재하는 이메일입니다"),
    //member
    COMMON_NO_ID("아이디를 입력하세요"),
    COMMON_NO_PW("비밀번호를 입력하세요"),
    COMMON_NO_LOGIN("로그인 하세요"),
    MEMBER_NOT_FOUND("존재하지 않는 회원입니다."),
    MEMBER_LOGIN_FAIL(" 아이디 또는 비밀번호를 잘못 입력했습니다. \n 입력하신 내용을 다시 확인해주세요. "),
    COMMON_NO_MATCH_PW("재입력한 비밀번호와 일치하지 않습니다.");





    private final String errorMsg;

    public String getErrorMsg(Object... arg) {
        return String.format(errorMsg, arg);
    }
}
