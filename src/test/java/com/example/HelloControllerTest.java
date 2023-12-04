package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerTest {
    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/calc")
    public CalculationResult calc(@RequestParam int left, @RequestParam int right) {
        return new CalculationResult(left, right, left + right);
    }

    static class CalculationResult {
        private final int left;
        private final int right;
        private final int answer;

        public CalculationResult(int left, int right, int answer) {
            this.left = left;
            this.right = right;
            this.answer = answer;
        }

        public int getLeft() {
            return left;
        }

        public int getRight() {
            return right;
        }

        public int getAnswer() {
            return answer;
        }
    }
}
