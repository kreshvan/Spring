package me.Dmitriev.DZ.Skypro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Calculator")
public class CalculatorController{
    private CalculatorService calculatorService ;
    @Autowired
    public CalculatorController (CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }
    @GetMapping("/hello")
    public String Hello(){
    return calculatorService.Hello();
    }
    @GetMapping("/Bay")
    public String Bay(){
        return calculatorService.Bay();
    }
    @GetMapping("/plus")
    public String summa( Integer nam1,Integer nam2){
        if (nam1==null||nam2==null) {
            return "Ошибка. Параметр не передан.";
        }
        return (nam1 +"+"+ nam2 +"=" + nam1+nam2);
    }
    @GetMapping("/multiplication")
    public String multiplication(Integer nam1,Integer nam2 ){
        if(nam1==null||nam2==null) {
        return "Ошибка. Параметр не передан.";
        }
         return (nam1 +"*"+ nam2 +"=" + nam1*nam2);
    }
    @GetMapping("/subtraction")
    public  String subtraction(Integer nam1,Integer nam2 ) {
        if(nam1==null||nam2==null) {
            return "Ошибка. Параметр не передан.";
        }
        return (nam1 +"-"+ nam2 +"=" + (nam1-nam2));
        }
    @GetMapping("/division")
    public String division(Integer nam1,Integer nam2 ) {
        if (nam2==0)
            return "Деление на 0 запрещено!!!";
        if (nam1==null||nam2==null) {
            return "Ошибка. Параметр не передан.";
        }
        return (nam1 +"/"+ nam2 +"=" + nam1/nam2);
    }
}

