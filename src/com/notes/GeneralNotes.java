package com.notes;


 /*
 to run any java application you should compile it first and then run it.
 code --> bytecode ( created with the help of javac , this will be in JDK(java development kit -- devl tools + JRE) )
 then JRE is java runtime env , which will have all deployment libraries and JVM ( java virtual machine)
*/


 /* workflow
 code ----- JDK ------ bytecode ( .class ) ------- JVM -------- JRE ----- machine lang (0's and 1's)
           compiler                               interpreter(line by line)
 */
public class GeneralNotes {

    public static void main(String[] args) {
        // here we are using static because we know that main function is the first thing that will be executed , so you
        // you have to use static ( which is object independent )
    }
}

// if we are using public then the classname should be exactly same as the file name
// class Cherry{ }

/* Input , output
 ------ INPUT -------
 Scanner in = new Scanner(System.in);
 if we have to save the input from cmd to some variable then
 int x = in.nextInt();
 char c = in.next().trim().charAt(0);    ---> trim removes whitespaces
 so to print this
 if you want the integer input to be printed --- syso(in.nextInt());
 if you want just the first string ---- syso(in.next());   here it print char until nullspace
 if you want the entire string ---- syso(in.nextLine());   here it prints everything until EOL
*/


 /* Primitive data types    are stored in stack
 primitive data types  --- the datatype which can not be divisible further --> int , char , float , double , long and bool
 String is NOT primitive as it can divided into chars
 int can't be divided so yes it is one.                                               4 bytes
 char  -- char c = 'c';                                                               4 bytes
 float   -- float fl = 45.87f; --- imp to put f in the end                            4 bytes
 double is for large decimal numbers --- double db = 64547847.8474784;                8 bytes
 long is for large int vals --- long lg = 676488478L; --- imp to put L in the end     8 bytes
 boolean is for true false --- boolean bl = true;
  */




/*
Type casting
 converting higher type to lower type explicitly
 int n = (int)(45.86) ---- will output only 45    (float to int)

 implicit casting

 int n = 'A';   -- will give 65 , if 'a' then 97   (char to int)
 one more example is if there are two type variables then the result will be the bigger one
 --------------------------- EXAMPLE -----------------------
 byte b = 42;
 char c = 'a';
 short s = 1024;
 int i = 34564;
 float f = 67.5f;
 double d = 0.1234;
 double res = (f * b) + (i / c) - (d * s);
 f*b will be converted to float as float>byte   next int then double  soo float+int-double will be double
 */



/* CHAR to UPPER / LOWER
to convert char to upper or lower case use Character wrapper class
Character.toLowerCase(ch)
 */


/* SPLIT INTEGERS
to split the integers we always have to use two things
1. to get the last digit =======> num % 10
2. to remove the last digit =====> num / 10
 */


/* Strings comparison  s1 = "cherry" s2 = "cherry"
1. s1 == s2 ----> may be false or might be true (as it'll check object ref)
2. s1.equals(s2) ----> True only ( as it's checking val)
3. s1.toCompare(s2) -----> if s1's length < s2 then returns -ve  , if s1's length is same then returns 0 , if s1>s2 +ve
 */


/*              VARARGS
so when we won't know the number of args to be passed we use this

*/

//static void function(int ...v){ int a; }
//static void multiple(int a, int b, String ...v){
//    System.out.println("it should take two ints and then any no of strings");
//}

 /*
it can be String ...v as well. basically this will get converted into Array of int / Strings
to print System.out.println(com.Arrays.toString(v));
 */
