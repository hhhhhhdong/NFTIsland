package com.ssafy.nfti.common.exception.enums;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
public enum ExceptionEnum {
    RUNTIME_EXCEPTION(HttpStatus.BAD_REQUEST, "001"),
    ACCESS_DENIED_EXCEPTION(HttpStatus.UNAUTHORIZED, "002"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "003"),

    BAD_REQUEST_DATE(HttpStatus.BAD_REQUEST, "004", "잘못된 날짜 혹은 시간 혹은 요일 형식이 요청되었습니다."),
    
    NOT_FOUND_USER(HttpStatus.NOT_FOUND, "101", "해당 유저를 찾을 수 없습니다."),
    CONFLICT_UESR(HttpStatus.CONFLICT, "105", "이미 해당 아이디가 존재합니다."),

    UNAUTHORIZED_REDIRECT_URI(HttpStatus.UNAUTHORIZED, "904", "인증되지 않은 리디렉션 URI 입니다. 인증을 진행할 수 없습니다.");

    private final HttpStatus status;
    private final String code;
    private String message;

    ExceptionEnum(HttpStatus status, String code) {
        this.status = status;
        this.code = code;
    }

    ExceptionEnum(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}