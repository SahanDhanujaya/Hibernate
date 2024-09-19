package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lk.ijse.embed.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Person {
    @Id
    private int id;
    private Name name;
}
