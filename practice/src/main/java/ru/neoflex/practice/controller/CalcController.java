package ru.neoflex.practice.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@RestController
public class CalcController {
    public static void main(String[] args) {
        SpringApplication.run(CalcController.class, args);
        //Scanner in = new Scanner(System.in);
        //System.out.println("Введите перовое число: ");
        //int a = in.nextInt();
        //System.out.println("Введите второе число: ");
        //int b = in.nextInt();
        //System.out.println("Введите 1 если хотите сложить или 2 если хотите вычесть:");
        //int deystvie = in.nextInt(); // 1 - сложение, 2 - вычитание
        //int result = 0;
        //if (deystvie == 1) {
        //    result = plus(a, b);
        //} else if (deystvie == 2) {
        //    result = minus(a, b);
        //} else {
        //    System.out.println("Ошибка ввода");
        //}
        //System.out.println("Результат вычисления: " + result);
    }

    @GetMapping("/plus/{a}/{b}")
    public int plus(@PathVariable("a") int a, @PathVariable("b") int b) {
        return a + b;
    }

    @GetMapping("/minus/{a}/{b}")
    public int minus(@PathVariable("a") int a, @PathVariable("b") int b) {
        return a - b;
    }
}

