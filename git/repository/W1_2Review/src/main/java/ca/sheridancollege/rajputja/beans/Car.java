
package ca.sheridancollege.rajputja.beans;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data //@Getter @Setter @ToString @ToString @EqualsAndHashCode


public class Car {
	private String make;
	private String model;
	private int year;
	private double mileage;
	private boolean hybrid;

}
