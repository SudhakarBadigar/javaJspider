package upCasting;

import java.util.Scanner;

class CourseDetails {
    private String CourseDetails;
    private double cost;
    private int duration;

    public CourseDetails(String CourseDetails, double cost, int duration) {
        this.CourseDetails = CourseDetails;
        this.cost = cost;
        this.duration = duration;
        
       
    }
    
    public void study(){
        	System.out.println("Work hard");
        }

    public String getCourseDetails() {
        return CourseDetails;
    }

    public double getCost() {
        return cost;
    }

    public int getDuration() {
        return duration;
    }
}

class JavaScript extends CourseDetails {
    public JavaScript(double cost, int duration) {
        super("JavaScript", cost, duration);
    }
}

class React extends CourseDetails {
    public React(double cost, int duration) {
        super("React", cost, duration);
    }
}

public class CourseInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for JavaScript CourseDetails
        System.out.print("Enter cost of JavaScript CourseDetails: ");
        double JavaScriptCost = scanner.nextDouble();

        System.out.print("Enter duration of JavaScript CourseDetails: ");
        int JavaScriptDuration = scanner.nextInt();

        // Create JavaScript object
        CourseDetails JavaScriptCourseDetails = new JavaScript(JavaScriptCost, JavaScriptDuration);

        // Get input for React CourseDetails
        System.out.print("Enter cost of React CourseDetails: ");
        double ReactCost = scanner.nextDouble();

        System.out.print("Enter duration of React CourseDetails: ");
        int ReactDuration = scanner.nextInt();

        // Create React object
        CourseDetails ReactCourseDetails = new React(ReactCost, ReactDuration);

        // Print CourseDetails information
        System.out.println(JavaScriptCourseDetails.getCourseDetails() + " CourseDetails Cost: $" + JavaScriptCourseDetails.getCost() + " Duration: " + JavaScriptCourseDetails.getDuration() + " days");
        System.out.println(ReactCourseDetails.getCourseDetails() + " CourseDetails Cost: $" + ReactCourseDetails.getCost() + " Duration: " + ReactCourseDetails.getDuration() + " days");

        scanner.close();
    }
}
