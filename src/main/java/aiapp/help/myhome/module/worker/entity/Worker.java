package aiapp.help.myhome.module.worker.entity;

import aiapp.help.myhome.module.common.enums.WorkerRole;
import aiapp.help.myhome.module.common.util.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "MY_WORKER")
public class Worker extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workerEmail;

    private String workerName;

    private String workerPhone;

    private String workerAddress;

    private String workerCity;

    private String workerState;

    @Enumerated(value = EnumType.STRING)
    private WorkerRole workerRole;

}
