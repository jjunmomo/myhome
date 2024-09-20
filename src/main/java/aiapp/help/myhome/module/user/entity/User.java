package aiapp.help.myhome.module.user.entity;

import aiapp.help.myhome.module.common.util.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "MY_USER")
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private Integer userApartZone;

    private Integer userApartNumber;

    private String userPassword;

    private String userPhoneNumber;
}
