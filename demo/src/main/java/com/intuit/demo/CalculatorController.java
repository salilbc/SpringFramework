
package com.intuit.demo;
import com.intuit.demo.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    @Autowired
    private List operations;

    @GetMapping("/operations")
    public List getOperations(){
        return operations;
    }

    @Autowired
    private Calculator calc;

    @GetMapping("/add/{x}/{y}")
    public int add(@PathVariable("x") int x, @PathVariable ("y") int y){
        return calc.add(x, y);
    }

    @GetMapping("/square/{x}")
    public int square(@PathVariable ("x") int x){
        return calc.square(x);
    }

    @PutMapping("/subtract/{x}/{y}")
    public int subtract(@PathVariable ("x") int x,@PathVariable ("y")  int y){
        return calc.subtract(x, y);
    }

    @PostMapping("/product")
    public int product(@RequestParam("num1") int x, @RequestParam("num2") int y){
        return calc.product(x,y);
    }
}
