package com.stackroute.javape3;
//program to find out if a series of 7 digits are consecutive numbers
import java.util.Arrays;

    public class ConsecutiveNumbers {
    //assume the digits are a ​ string​ and use split()
        public String isConsecutiveNumbers(String numbers)
        {
            try {

                String messsage = "Consecutive numbers";

                String[] numberStrings = numbers.trim().split(",");

                int[] numArray = new int[numberStrings.length];

                for (int i = 0; i < numArray.length; i++) {  //converting string to numbers

                    numArray[i] = Integer.parseInt(numberStrings[i]);
                }

                Arrays.sort(numArray);

                for (int i=0; i < numArray.length-1; i++)
                {
                    if(numArray[i] + 1 != numArray[i+1])   //logic to find consecutive numbers
                    {
                        messsage = "Non Consecutive numbers";
                        break;
                    }
                }

                return messsage;
            }
            catch (Exception exception)
            {
                return "Please enter all integers";
            }
        }
    }

