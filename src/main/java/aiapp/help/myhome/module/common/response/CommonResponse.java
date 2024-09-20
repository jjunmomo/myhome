package aiapp.help.myhome.module.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(title = "COMMON_RESPONSE : 공통 응답 DTO")
public class CommonResponse<T> {

    @Schema(description = "성공 여부", example = "SUCCESS / FAIL")
    private Result result;
    @Schema(description = "응답 데이터", example = "Object")
    private T data;
    @Schema(description = "응답 메시지", example = "Message")
    private String message;
    @Schema(description = "에러 코드", example = "COMMON_ERROR_CODE")
    private String errorCode;

    public static <T> CommonResponse<T> success(T data, String message) {
        return CommonResponse.<T>builder()
                .result(Result.SUCCESS)
                .data(data)
                .message(message)
                .build();
    }

    public static CommonResponse success(String message) {
        return CommonResponse.builder()
                .result(Result.SUCCESS)
                .message(message)
                .build();
    }

    public static <T> CommonResponse<T> success(T data) {
        return success(data, null);
    }


    public static CommonResponse fail(Exception exception, String message, HttpStatus httpStatus, String errorCode) {
        return CommonResponse.builder()
                .result(Result.FAIL)
                .message(message)
                .errorCode(errorCode)
                .build();
    }

    public static CommonResponse fail(ErrorCode errorCode) {
        return CommonResponse.builder()
                .result(Result.FAIL)
                .message(errorCode.getErrorMsg())
                .errorCode(errorCode.name())
                .build();
    }

    public enum Result {
        SUCCESS, FAIL
    }
}