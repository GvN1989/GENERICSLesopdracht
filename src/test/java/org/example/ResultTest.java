package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    void success() {

        var data = "Success data";

        var result = Result.success(data);

        assertTrue(result.isSuccess());
        assertEquals(data, result.getValue());
        assertEquals("Result {success, value= '" + data + "'}", result.toString());
    }

    @Test
    void failure() {

        var errorText = "error 1: faulty fault";

        var result = Result.failure(errorText);

        assertFalse(result.isSuccess());
        assertEquals(errorText, result.getErrorMessage());
        assertEquals("Result {failure, errorMessage= '"+ errorText +"'}", result.toString()
        );

    }

}