package aiapp.help.myhome.module.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum WorkerRole {
    ROLE_ADMIN("최고 관리자"),
    ROLE_INTERMEDIATE("중간 관리자"),
    ROLE_STAFF("직원"),
    ROLE_HEAD ("소장"),
    ROLE_EQUIP ("장비"),
    ROLE_MANAGER("매니저");

    private final String value;

    }
