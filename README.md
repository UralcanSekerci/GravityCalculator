# GravityCalculator

**DESCRIPTION** 

In this assignment, you will create a program that computes the distance an object will fall in Earth's gravity. 

Modify the example program to compute the position of an object after falling for 10 seconds, outputting the position in meters

**Original Code**

```
class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
    }
}

```

*Output of this code* 

![image](https://user-images.githubusercontent.com/85555680/154259798-3c945d09-2540-4a22-9cf1-3ddc57a13a3d.png)


**Modified Code**

```
public class GravityCalculator {

    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double x;

        x = (0.5 * gravity*(fallingTime*fallingTime)
                + (initialVelocity * fallingTime) + (initialPosition));

        System.out.println("The object's position after " + fallingTime + " seconds is " + x + " m.");
    }
}
```


*Output of this code*

![image](https://user-images.githubusercontent.com/85555680/154259684-2b623a18-09bb-41fa-a812-cec27dd7e8b6.png)

