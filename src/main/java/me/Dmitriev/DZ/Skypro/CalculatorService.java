package me.Dmitriev.DZ.Skypro;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@Component
public class CalculatorService {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String bay() {
        return "Пока";
    }

    public int summa(int nam1, int nam2) {
        return nam1 + nam2;
    }

    public int multiplication(int nam1, int nam2) {
        return nam1 * nam2;

    }


    public int subtraction(int nam1, int nam2) {
        return nam1 - nam2;
    }

    public float division(float nam1, float nam2) {
        return nam1 / nam2;
    }
}








