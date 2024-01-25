package net.ugurkartal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isFibonacci(int number) {
        int index = 2;
        if (number == 0 || number == 1){
            return true;
        }else if(number>=2){
            int[] fiboNumbers = new int[number];
            fiboNumbers[0] = 1;
            fiboNumbers[1] = 1;
            for (int i = 0; i<number; i++){
                int newFibo = fiboNumbers[index-2] + fiboNumbers[index-1];
                if (newFibo == number){
                    return true;
                }else{
                    if (newFibo < number){
                        fiboNumbers[index] = newFibo;
                        index++;
                    }else{
                        return false;
                    }
                }
            }
        }
        return false;
    }
}