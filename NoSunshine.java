/*
Ain't no sunshine when she's gone
It's not warm when she's away
Ain't no sunshine when she's gone
And she's always gone too long
Anytime she goes away

Wonder this time where she's gone
Wonder if she's gone to stay
Ain't no sunshine when she's gone
And this house just ain't no home
Anytime she goes away

And I know, I know, I know, I know
I know, I know, I know, I know, I know
I know, I know, I know, I know, I know
I know, I know, I know, I know, I know
I know, I know, I know, I know, I know
I know, I know

Hey, I ought to leave young thing alone
But ain't no sunshine when she's gone, whoa-whoa
Ain't no sunshine when she's gone
Only darkness every day

Ain't no sunshine when she's gone
And this house just ain't no home

Anytime she goes away
Anytime she goes away
Anytime she goes away
Anytime she goes away
*/

public class NoSunshine {
    public static void main(String[] args) {
        int count;
        String string1 = "Ain't no sunshine when she's gone";
        String string2 = "Anytime she goes away";
        String string3 = "And this house just ain't no home";
        String string4 = "I know, ";
        String string5 = "ain't no sunshine when she's gone";

        System.out.println(string1);
        System.out.println("It's not warm when she's away");
        System.out.println(string1);
        System.out.println("And she's always gone too long");
        System.out.println(string2);
        System.out.println();
        System.out.println("Wonder this time where she's gone");
        System.out.println("Wonder if she's gone to stay");
        System.out.println(string1);
        System.out.println(string3);
        System.out.println(string2);
        System.out.print("And ");
        for (count = 0; count <4; count++)
        {
            System.out.print(string4);
        }
        System.out.println();
        for (count = 0; count <4; count++)
        {
            for (int count2 = 0; count2 <5; count2++)
            {
                System.out.print(string4);
            }
            System.out.println();
        }
        System.out.println(string4 + string4);
        System.out.println("Hey, I ought to leave young thing alone");
        System.out.println("But, " + string5 + ", whoa-whoa");
        System.out.println(string1);
        System.out.println("Only darkness every day");
        System.out.println();
        System.out.println(string1);
        System.out.println(string3);
        System.out.println();
        for (count = 0; count <4; count++)
        {
            System.out.println(string2);
        }
    }
}