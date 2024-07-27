package me.Dmitriev.DZ.Skypro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorServis {


    @GetMapping("/hello")
    public String Hello(){
    return "Добро пожаловать в калькулятор";
}
    @GetMapping("/Bay")
    public String Bay(){
        return "Пока";
    }
    @GetMapping("/summa")
    public int summa(int nam1,int nam2){
        return nam1+nam2;
    }
    @GetMapping("/multiplication")
    public int multiplication(int nam1,int nam2 ){
        return  nam1*nam2;
    }
    @GetMapping("/subtraction")
    public int subtraction(int nam1,int nam2 ) {
        return nam1 - nam2;
    }
    @GetMapping("/division")
    public float division(float nam1,float nam2 ) {
        return nam1 / nam2;
    }







}
