package sampleprograms.animal2;

public class TestAnimal {
    public static void main(String args[]) {

        Animal[] allAnimals = new Animal[10];

        System.out.println("testing the 4-argument constructor....");
        Animal animal1 = new Animal();
        animal1.setType("Gorilla");
        animal1.setWeight(250);
        System.out.println(animal1); //tests toString() and the accessor methods
        String lionContinents[] = {"Africa", "Asia"}; //initialise an array of strings

        //tests 4-arg constructor and the 4 mutator methods
        System.out.println("\n\ntesting the 4-argument constructor....");
        Animal animal2 = new Animal("Lion", lionContinents, 200, 40);
        System.out.println(animal2);

        System.out.println("\n\ntesting the 4-argument constructor....");
        Animal animal3 = new Animal("Rat", new String[]
                {"Europe","Asia","America","Africa"}, 0.5, 5);
        System.out.println(animal3);

        System.out.println("\n\ntesting the 4-argument constructor....");
        Animal animal4 = new Animal("Polar Bear", new String[]{"Antarctica"}, 450, 15);
        System.out.println(animal4);

        System.out.println("\n\ntesting the 4-argument constructor....");
        Animal animal5 = new Animal("Anaconda", new String[]{"Asia","America"}, 100, 8);
        System.out.println(animal5);

        System.out.println("\n\n\nThe details of all the animal objects are as follows:\n\n");

        allAnimals[0] = animal1;
        allAnimals[1] = animal2;
        allAnimals[2] = animal3;
        allAnimals[3] = animal4;
        allAnimals[4] = animal5;

        for (int j = 0; j < allAnimals.length; j++){
            if(allAnimals[j]!=null)
                System.out.println(allAnimals[j] + "\n\n");
        }
        System.exit(0);
    }
}
