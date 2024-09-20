package aiapp.help.myhome.module.common.util;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
public class BaseEntity extends BaseTimeEntity{

    @CreatedBy
    @Column(name = "CREATE_BY",updatable = false)
    private String createdBy;

    @LastModifiedBy
    @Column(name = "MODIFIED_BY",updatable = false)
    private String modifiedBy;

}
