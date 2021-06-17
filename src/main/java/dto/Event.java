package dto;


import lombok.*;

@Builder
@Setter
@Getter
@ToString

public class Event {
    String title;
    String type;
    int breaks;
    String ammount;
}
