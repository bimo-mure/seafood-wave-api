# Seafood Wave API 🦀

A Spring Boot API for managing seafood-wave data, including information about different menu items and orders. The data is stored in a MongoDB database.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Examples](#examples)

## Introduction

Seafood Wave API is designed to provide a RESTful interface for managing seafood-wave data. This includes CRUD operations for menu items and orders. The API uses MongoDB as the underlying database, making it scalable and flexible.

## Features

- CRUD operations for menu items and orders.
- Flexible and easy-to-use API endpoints.
- Data storage using MongoDB.

## Technologies

- **Spring Boot:** Framework for creating Java-based, production-grade Spring applications.
- **Spring Data MongoDB:** Simplifies the implementation of MongoDB data access layers.
- **MongoDB:** NoSQL database for storing seafood-related data.

## Getting Started

1. Clone the repository:

    ```bash
    git clone https://github.com/bimo-mure/seafood-wave-api.git
    ```

2. Configure MongoDB connection settings in `application.yml`.

    ```application.yml
   spring:
     data:
       mongodb:
         uri: mongodb+srv://{username}:{password}@{cluster}
         database: {database-name}
    ```

3. Build and run the application:

    ```bash
    ./mvnw spring-boot:run
    ```

## API Endpoints

The API provides the following endpoints:

- `/api/menu`: CRUD operations for menu items.
- `/api/order`: CRUD operations for orders.

## Examples

### Get All Seafood Items

```http
GET /api/menu
```

### Create New Order
```http
POST /api/order
Content-Type: application/json

{
    "customer": "Ujang Jeprut",
    "status": "preparing",
    "estimatedDelivery": "2023-04-25T06:42:22.937Z",
    "orderPrice": 70000,
    "cart": [
      {
        "menuId": "6556e2cb4542f32cf50b5028",
        "menuName": "Capiz Clams",
        "choisesOfDhises": "Grilled Ala Jimbaran",
        "quantity": 2,
        "unitPrice": 35000,
        "totalPrice": 70000
      }
    ]
  }
```
