package aiapp.help.myhome.module.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Status {
        GREEN("활동") , RED("강퇴");
        private final String description;
}
