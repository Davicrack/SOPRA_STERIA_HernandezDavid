package PART2;

import java.util.Scanner;

public class PersonClassification {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Person[] PERSONAS = LEER_PERSONAS();

        int adultWomanCount = 0;
        int adultManCount = 0;
        int femaleCount = 0;

        for(Person actualPerson : PERSONAS){
            if(actualPerson.getAge() > 17){
                if(actualPerson.getSex() == SEX.MALE)
                {
                    adultManCount ++;
                }else
                {
                    adultWomanCount++;
                }
            }
            if(actualPerson.getSex() == SEX.FEMALE){
                femaleCount++;
            }
        }

        System.out.println("Adults " + (adultWomanCount+adultManCount) +
                           "\nMinors " + (50 - (adultWomanCount+adultManCount)) +
                           " \nAdult males " + adultManCount +
                           "\nNon Adult Females " + (femaleCount - adultWomanCount) +
                            "\nAdult Percentage " + (((float)(adultManCount+adultWomanCount)/50)*100) + "%" +
                            "\nFemale Percentage " + (((float)(femaleCount)/50)*100) + "%"
        );
    }

    private static Person[] LEER_PERSONAS(){
        Person[] PERSONAS = new Person[50];

        for(int i = 0; i < 50; i++){

            System.out.print("Introduce the age of the person number " + (i+1) + "/50 : ");
            int age = sc.nextInt();

            System.out.print("Introduce the genre (H/M) of the person number " + (i + 1) + "/50 : ");
            char sexo = sc.next().toLowerCase().charAt(0);


            if(sexo == 'h'){
                Person actualPerson = new Person(age, SEX.MALE);
                PERSONAS[i] = actualPerson;
            }else{
                Person actualPerson = new Person(age, SEX.FEMALE);
                PERSONAS[i] = actualPerson;
            }
            if(sexo != 'h' && sexo != 'm'){
                i--;
                System.out.println("\u001B[31mThe genre has to be male (H) or female (M) \u001B[0m");
            }
        }

        return PERSONAS;
    }
}
