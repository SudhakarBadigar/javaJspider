package upCasting;
class Course {
    private String course;
    private double cost;
    private int duration;

    public Course(String course, double cost, int duration) {
        this.course = course;
        this.cost = cost;
        this.duration = duration;
    }

    public String getCourse() {
        return course;
    }

    public double getCost() {
        return cost;
    }

    public int getDuration() {
        return duration;
    }
}

class Java extends Course {
    public Java(double cost, int duration) {
        super("Java", cost, duration);
    }
}

class Python extends Course {
    public Python(double cost, int duration) {
        super("Python", cost, duration);
    }
}

public class InstanceOf {
    public static void main(String[] args) {
        // Upcasting
        Course javaCourse = new Java(500.0, 60);
        Course pythonCourse = new Python(400.0, 45);

        System.out.println(javaCourse.getCourse() + " Course Cost: $" + javaCourse.getCost() + " Duration: " + javaCourse.getDuration() + " days");
        System.out.println(pythonCourse.getCourse() + " Course Cost: $" + pythonCourse.getCost() + " Duration: " + pythonCourse.getDuration() + " days");

        // Downcasting
        Java java = (Java) javaCourse;
        Python python = (Python) pythonCourse;

        System.out.println(java.getCourse() + " Course Cost: $" + java.getCost() + " Duration: " + java.getDuration() + " days");
        System.out.println(python.getCourse() + " Course Cost: $" + python.getCost() + " Duration: " + python.getDuration() + " days");
    }
}
