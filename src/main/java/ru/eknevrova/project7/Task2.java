package ru.eknevrova.project7;

//Написать программу, которая будет проверять правильность скобочной последовательности.
// Дана строка, содержащая только символы скобок: '(', ')', '[', ']', '{' и '}'.
// Необходимо проверить, что скобочная последовательность верна, т.е. каждая открывающая
// скобка имеет соответствующую закрывающую скобку, и пары скобок правильно вложены друг в друга.
//Примеры: "([)]" - неправильная скобочная последовательность
//          "(]" - неправильная скобочная последовательность
//          "()[]{}" - правильная скобочная последовательность
//          "()" - правильная скобочная последовательность
import java.util.Stack;
public class Task2 {
        public static void testIsValid() {
            System.out.println(isValid("([)]"));
            System.out.println(isValid("(]"));
            System.out.println(isValid("()[]{}"));
            System.out.println(isValid("()"));
        }
        public static boolean isValid(String str) {
            Stack<Character> stack = new Stack<>();
            for (char symbol : str.toCharArray()) {
                if (symbol == '(' || symbol == '{' || symbol == '[') {
                    stack.push(symbol);
                }
                else {
                    if (stack.isEmpty() || !isPair(stack.pop(), symbol)) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
        private static boolean isPair(char open, char close) {
            return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
        }
    }