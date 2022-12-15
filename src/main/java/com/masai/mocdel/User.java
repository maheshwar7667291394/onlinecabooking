package com.masai.mocdel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
@Id	
private String userid;
@Pattern(regexp = "[a-z]*")
private String firstName;
@Pattern(regexp = "[a-z]*")
private String lastName;
//@Size(min=10)
private String mobile;
@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
private String password;
private Integer currentPosition;


}
