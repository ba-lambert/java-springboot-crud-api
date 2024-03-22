package com.bookStore.book.store.app.services;

public class ApiResponse<T> {
    private String message;
    private int status;
    private T data;
    public ApiResponse(int status,String message,T data){
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
