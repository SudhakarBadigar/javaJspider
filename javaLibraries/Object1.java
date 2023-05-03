package javaLibraries;

public class Object1  {
	public static void main(String[] args) {
		// Get the array of all the packages in the current class loader
		Package[] packages = Package.getPackages();

		// Print the name of each package
		for (Package pkg : packages) {
		    System.out.println(pkg.getName());
		}
		
	


	}
}
