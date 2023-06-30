

public class IfStatements {
    public static void main(String[] args)
    {
        //Creating if-statement on Boolean values
        boolean  isFemale = true;
        if (isFemale == true) {
            System.out.println("you are Female");
        }else if (isFemale == false){
            System.out.println("you are male");
        }else{
            System.out.println("gender is not specified");
        }
        //  Creating If-statement for Integer values
        int age = 25;
        if (age <= 35){
            System.out.println("You are a youth");
        }else if (age > 35){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are an older adult");
        }
        //Creating switch case
        int day = 1;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        int[] n1 = {1,2,3,4,5,6,7,8,9,10,11,12 };

        boolean isTrue = (12>10)? true : false;
        System.out.println(isTrue);

        for(int k = 0; k < n1.length; k++){
            System.out.println(n1[k]);
        }

}
}

