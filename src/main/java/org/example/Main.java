package org.example;

public class Main {
    public static void main(String[] args) {

        Result<String> successResult= Result.success("Operation completed succesfully");
        System.out.println(successResult);

        if (successResult.isSuccess()) {
            System.out.println("Success Value" + successResult.getValue());
        } else {
            System.out.println("Error: " + successResult.getErrorMessage());
        }

        Result<String> failureResult= Result.failure("An error occurred during the operation");
        System.out.println(failureResult);

        if (!failureResult.isSuccess()) {
            System.out.println("Error Message: " + failureResult.getErrorMessage());
        } else {
            System.out.println("Succes Value: " + failureResult.getValue());
        }

    }
}