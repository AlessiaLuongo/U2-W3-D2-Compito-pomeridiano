package alessia.U2W3D2Compitopomeridiano.entities;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Author {

    private int id;
    private String name;
    private String surname;
    private String eMail;
    private int birthdayYear;
    private String avatar;
}

