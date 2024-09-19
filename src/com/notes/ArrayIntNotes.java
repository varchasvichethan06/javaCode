package com.notes;

public class ArrayIntNotes {
    public static void main(String[] args) {

    }
}

/*
ARRAY is collection of same datatypes    -> by default array int elements will be 0 in java             arr.length
                                         -> string elements will be NULL in java                        str.length()

declare an array of integers
int[] arr;                   compile time                         here arr is getting defined in the stack
arr = new int[size];         Run time       initialisation        here object being created in the memory in heap (dynamic mem allocation)
1. int[] variable_name = new int[size];
new is used to create an object
2. int[] variable_name = { 12,2,3,45,5,5,6,46 };

3. String[] str = new String[5];

4.String[] str2 = {"cherry" , "che" , "hey"}




int[] arr = new int[5]; ===========> by default it'll be {0, 0, 0, 0, 0}   here each zero is a diff object in heap

so array is nothing but the collection of ref variables
 */


/*
INPUT and OUTPUT array

Scanner sc = new Scanner(System.in);
int[] arr = new int[size];                            String[] str = new String[size];

for(int i = 0;i < arr.length;i++){
    arr[i] = sc.nextInt();                              str[i] = sc.next();
}

System.out.println(com.Arrays.toString(arr));               System.out.println(com.Arrays.toString(str));


three types of out put

for(int i = 0;i < arr.length;i++){    or  for( int i : arr){                or System.out.println(com.Arrays.toString(arr));
    System.out.print(arr[i] + " ");         System.out.print(i + " ");          here Array will get converted to string
}                                          }                                        and will print with [1,2,0,3,4]

System.out.println(arr[5]);        --> will give index out of bound error
 */









/*
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 2D array !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

int[][] arr = new int[no of rows][no of columns]         no of rows is mandatory , no of cols is optional

                                    2d is array is nothing but array of arrays
int[][] arr = {                             arr = {arr0, arr1, arr2}
            {1,2,3}                            arr0 is {1,2,3}          to access 1 -> arr[0][0]
            {4,5,6}                            arr1 is {4,5,6}
            {7,8,9}                            arr2 is {7,8,9}          to access 8 -> arr[2][1]
};

int[][] arr = {
            {1,2}                           is possible; that's why no of columns is not necessary
            {3,4,5}
};

int n = arr.length;         -> gives no of rows
int m = arr[0].length;      -> gives no of columns


 input 2d array
 for(int row = 0;row < arr.length;row++){
    for(int col = 0;col < arr[row].length;col++){               // here for each row the no of elements will be considered
        arr[i][j] = sc.nextInt();
    }
 }

 output 2D array
 for(int row = 0;row < arr.length;row++){
    for(int col = 0;col < arr[row].length;col++){               // here for each row the no of elements will be considered
      System.out.print(arr[i][j] + " ");
    }
    System.out.println();                                   we are adding new line after printing every row
 }

                                OOOOOOOORRRRRRRR
  for(int row = 0;row < arr.length;row++){
   System.out.print(com.Arrays.toString(arr[row]);
 }
                                 OOOOOOOORRRRRRRR
  for(int[] a : arr){
   System.out.print(com.Arrays.toString(a));
 }



To convert string into char array
str.toCharArray();

to print the same
System.out.println(Arrays.toString(str.toCharArray());

 */