package Calculator;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) throws Exception {
        Converter converter = new Converter();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] words =str.split(" ");
        if(Converter.isRoman1(words[0])== converter.isRoman1(words[2])){
            int x,y;

            boolean isRoman2 = converter.isRoman1(words[0]);
            if(isRoman2){
                x = converter.romanToInt(words[0]);
                y = converter.romanToInt(words[2]);
            } else {
                x = Integer.parseInt(words[0]);
                y = Integer.parseInt(words[2]);
            }
            int result = 0;
            if (words.length>3 || words.length <3){
                throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
            if(x>10 || y >10){
                System.out.println("Число не должно превышать 10!");
            }else {
                switch (words[1]) {
                    case "+":
                        result = x + y;
                        break;
                    case "-":
                        result = x - y;
                        break;
                    case "/":
                        result = x / y;
                        break;
                    case "*":
                        result = x * y;
                        break;
                    default:
                        System.out.println("Нет такой операции!");
                        break;
                    }
                }
                if(isRoman2){
                    if (result<0) {
                        System.out.println("В римкой системе исчиления нет отрицательнвх чисел");
                    }
                    System.out.println(converter.intToRoman(result));}
                else {
                    System.out.println(result);}
            }else {
                System.out.println("Оба числа должны быть в одном формате!");}

    }
}