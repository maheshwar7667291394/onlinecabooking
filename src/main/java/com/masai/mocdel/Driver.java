package com.masai.mocdel;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
	
	@Id
	private String driverid;
	private String drivername;
	private String carNumber;
	private Integer xcoridname;
	private Integer ycordiname;

}
