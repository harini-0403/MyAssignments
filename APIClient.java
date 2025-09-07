package com.example.tasks;

public class APIClient {
    // Overloaded method: only endpoint
    public void sendRequest(String endpoint) {
        System.out.println("Sending GET request to " + endpoint);
    }

    // Overloaded method: endpoint + request body + status
    public void sendRequest(String endpoint, String body, boolean status) {
        System.out.println("Sending POST request to " + endpoint);
        System.out.println("Request Body: " + body);
        System.out.println("Expected Status: " + status);
    }

    public static void main(String[] args) {
        // Create object of APIClient
        APIClient api = new APIClient();

        // Call first overloaded method
        api.sendRequest("/users");

        // Call second overloaded method
        api.sendRequest("/users", "{\"name\":\"Ava\"}", true);
    }
}
