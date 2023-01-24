/*
 * Создать калькулятор для работы с рациональными и комплексными числами, 
 * организовать меню, добавив в неё систему логирования (с использованием паттерна MVC и ООП).
 */
package MyCalc;

public class Main {
    public static void main(String[] args) {
        
        String input = "4/5+4/2";

        Presenter p = new Presenter(new RationalCalc(), new View());
        p.startProgram(input);    
    }

}

