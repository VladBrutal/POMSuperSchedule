package dto;

import lombok.*;

@Builder
@Setter
@Getter
@ToString

public class Credentials {
    String email;
    String password;
}
